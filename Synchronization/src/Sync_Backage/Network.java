package Sync_Backage;

import java.util.ArrayList;
import java.util.Scanner;

public class Network {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Router router = new Router();
		ArrayList<Device> devices = new ArrayList();
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("What is the Number of Wi-Fi Connections? \n -> ");
		int connectionsNum = scan.nextInt();
		
		router.setConnectionsNum(connectionsNum);
		
		System.out.print("What is the Number of Devices? \n -> ");
		int devicesNum = scan.nextInt();
		
		
		for (int i = 0; i < devicesNum; i++) {
			
			Device d = new Device(router);
			
			System.out.print("Device Number (" + (i+1) + "): \n Name -> ");
			d.itsName(scan.next());
			
			System.out.print("\n Type -> ");
			d.itsType(scan.next());
			
			devices.add(d);
		}
		
		
		for (int i = 0; i < devicesNum; i++) {
			devices.get(i).start();
		}
		
		
//		Device d1 = new Device(router);
//		Device d2 = new Device(router);
//		Device d3 = new Device(router);
//		Device d4 = new Device(router);
//		
//		
//		d1.itsName("C1");
//		d2.itsName("C2");
//		d3.itsName("C3");
//		d4.itsName("C4");
//		
//		d1.itsType("LabTop");
//		d2.itsType("Tablet");
//		d3.itsType("PC");
//		d4.itsType("PC");
//		
//		d1.start();
//		d2.start();
//		d3.start();
//		d4.start();
		
		
	}

}
