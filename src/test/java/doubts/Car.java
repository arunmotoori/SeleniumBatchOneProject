package doubts;

class Vehicle{
	
	public void vehicleDetails() {
		
		System.out.println("Vehicle details");
		
	}

}

public class Car extends Vehicle {
	
	public Car startCar() {
		
		System.out.println("Car started");
		return new Car();
		
	}
	
	public Car stopCar() {
		
		System.out.println("Car stopped");
		return new Car();
	}
	
	public void vehicle() {
		
		System.out.println("Inside vehicle of Car class");
		
	}
	
	public static void main(String[] args) {
		
		/*
		Car c = new Car();
		c.startCar();
		c.stopCar();
		*/
		
		//new Car().startCar().stopCar();
		
		
		Vehicle v = new Car()
				.startCar().stopCar();
		
		Car c = (Car)v;
		c.startCar();
		c.stopCar();
		c.vehicleDetails();
		
		
	}

}
