package BusRev;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no, boolean ac, int cap){
		this.busNo= no;
		this.ac= ac;
		this.capacity= cap;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public boolean isAc() {
		return ac;
	}
	
	public int getcapacity() {
		return capacity;
	}
	
	public void setAc(boolean val) {
		ac=val;
	}
	
	public void setcapacity(int cap) {
		capacity=cap;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus NO:" + busNo + "Ac:" + ac + "capacity:" + capacity);
	}

	
}
