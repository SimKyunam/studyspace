package chapter8;

public class Avante extends Car {

	public final String carName = "Avante";
	
	@Override
	public void start() {
		System.out.println(carName + "시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println(carName + "달립니다.");
	}

	@Override
	public void stop() {
		System.out.println(carName + "멈춥니다.");
	}

	@Override
	public void turnOff() {
		System.out.println(carName + "시동을 끕니다.");
	}

}
