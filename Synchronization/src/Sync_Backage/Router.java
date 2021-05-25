package Sync_Backage;

import java.util.ArrayList;

public class Router {

	private int connectionsNum = 0;
	private Sema connections;
	private ArrayList<Device> activeDevices = new ArrayList();

	
	
	
	public void setConnectionsNum(int connectionsNum) {
		
		this.connectionsNum = connectionsNum;
		connections = new Sema(connectionsNum);
	}
	
	

	public boolean establishConnection(Device d) throws InterruptedException {
		
		boolean active = connections.waitfor(d);

		if (true) {
			activeDevices.add(d);
			System.out.println("Connection(" + (activeDevices.indexOf(d)+1) + ")-> " + d.itsName() + " Occupied");
		}
		
		d.sleep(5000);
		System.out.println(d.itsName() + " (" + d.itsType() + ") " + "Online Activity");
		
		activeDevices.remove(d);
		connections.signalit(d);
		
		return active;
		
	}
	
	
	
	
	
	
	
	
	
}
