package Sync_Backage;

public class Device extends Thread{

	
	private String name;
	private String type;
	private String status;
	private Router router = new Router();
	private int connection;
	
	
	public Device(Router router) {
		this.router = router;
	}
	
	
	public void itsName(String name) {
		this.name = name;
	}
	
	
	public String itsName() {
		return name;
	}
	
	
	public void itsType(String type) {
		this.type = type;
	}
	
	
	public String itsType() {
		return type;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void connect() throws InterruptedException {
		
		router.establishConnection(this);
		
//		this.sleep(5000);
		
	}
	
	
	
	
	
	
	
	
	
	
	public void run() {
		
		
		try {
			
			connect();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}















