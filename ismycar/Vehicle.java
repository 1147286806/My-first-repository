package ismycar;

public class Vehicle {
	protected int speed;
	protected int size;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Vehicle(int speed, int size) {
		super();
		this.speed = speed;
		this.size = size;
	}
	
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int move(){
		return 0;
	}
	
	public int speedUp() {
		return speed ++;
	}
	
	public int speedDown() {
		return speed = speed - 2;
	}
	
	@Override
	public String toString() {
		return "车辆 [速度=" + speed + ", 体积=" + size + "]";
	}
	
	
}
