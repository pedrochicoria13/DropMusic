package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import classes.User;

public interface RmiClientInterface extends Remote{
	
	public String SimpleMessage() throws RemoteException;
	
	public  ArrayList<User> registerUsers(String username, String password, String privilege, String name) throws RemoteException;
	
	public boolean checkPrivilege(String username) throws RemoteException;
}