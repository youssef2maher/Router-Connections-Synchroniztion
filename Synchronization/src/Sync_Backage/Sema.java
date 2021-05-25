package Sync_Backage;

public class Sema {
	
	
	
	protected int value = 0;
	
	
	
	
	protected Sema() { 
		
		value = 0; 
		
	}
	
	
	
	
	
	
	
	protected Sema(int initial) { 
		
		value = initial; 
		
	}
	
	
	
	
	
	
	
	
	public synchronized boolean waitfor(Device d) {
		
		value--;
		if (value < 0) {
			
			try { 
				
				System.out.println(d.itsName() + " Arrived and Wait");
				wait(); 
				return false;
				
			} catch( InterruptedException e ) { 
				
			}
		}
		
		System.out.println(d.itsName() + " Arrived");
		return true;
	}
	
	
	
	
	
	
	
	
	
	public synchronized void signalit(Device d) {
		
		value++; 
		if (value <= 0) {
			notify();
		}
		
		System.out.println(d.itsName() + " Log out");
	}

}












