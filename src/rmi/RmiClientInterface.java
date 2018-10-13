package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiClientInterface extends Remote{
	
	public String SimpleMessage() throws RemoteException;
}