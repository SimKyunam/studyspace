package chapter8;

public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	public void washCar() {}
	
	public void run() {
		start();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
