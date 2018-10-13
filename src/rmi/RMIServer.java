package rmi;
import classes.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;

public class RMIServer extends UnicastRemoteObject implements RmiClientInterface{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Registry registry_main;
	private static int rmi_port;
	private static String MULTICAST_ADDRESS = "224.3.2.1";
    private static int PORT = 4321;
	private static Scanner keyboardScanner;
	
	
    public ArrayList<User> users = new ArrayList<>();
	
	protected RMIServer() throws RemoteException {
		super();
	}
	
	
	public static void main(String args []) throws RemoteException {
		
		rmi_port = 1099;
		
		try {
			RMIServer rmi_server =new RMIServer();
			registry_main = LocateRegistry.createRegistry(rmi_port);
			registry_main.rebind("localhost",rmi_server);
		}catch(ExportException ee) {
			System.out.println(ee.getMessage());
		}
		
		System.out.println("RMI Server is ready!\n");
        MulticastSocket socket = null;
   
        long counter = 0;
        try {
            socket = new MulticastSocket();  // create socket without binding it (only for sending)
        	keyboardScanner = new Scanner(System.in);
        	
            while (true) {
            	String readKeyboard = keyboardScanner.nextLine();
            	byte[] buffer = readKeyboard.getBytes();

                InetAddress group = InetAddress.getByName(MULTICAST_ADDRESS);
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length, group, PORT);
                socket.send(packet);
                
     
         

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }
	
	public  ArrayList<User> registerUsers(String username, String password, String privilege, String name) throws RemoteException{
		User user = new User(username, password, privilege, name);
		users.add(user);
		for(User u: users) {
			System.out.println(u.getName());
		}
		return users;
		
	}
	
	public boolean checkPrivilege(String username) throws RemoteException{
		
		for(User user: users) {
			if(user.getName().equalsIgnoreCase(username)) {
				if(user.getPrivilege().equalsIgnoreCase("editor")){
					System.out.println(user.getPrivilege());
					return true;
				}else
					return false;
				
			}else {
				return false;
			}
			
		}
		
		return false;
		
	}
	
	public String SimpleMessage() throws RemoteException{
		return "HEY HEY";
	}

}