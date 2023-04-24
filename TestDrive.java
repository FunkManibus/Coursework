public class TestDrive {

	String name; //Class attributes//
	String make;
	String type;

	public void Drive (String name, String make, String type) { //Constructor//
		this.name = name;
		this.make = make;
		this.type = type;
	}
	public void display() {
	System.out.println("Your boot drive is changing... \n");
	System.out.println("Your new boot drive is: " + name + " " + make + " " + type);
	System.out.println("... shutting down\n");
}	

	public static void main(String[] args) {
		String name = "C";
		String make = "Samsung";
		String type = "SSD";
		Drive d1 = new Drive (name, make, type);
		d1.display();
		
		name = "D";
		make = "Western Digital";
		type = "HHD";
		Drive d2 = new Drive (name, make, type);
		d2.display();
		
		name = "E";
		make = "SanDisk";
		type = "NVMe M.2";
		Drive d3 = new Drive (name, make, type);
		d3.display();
	}
}

