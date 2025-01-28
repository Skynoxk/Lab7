package Ex3;

public class Microwave extends Appliance {
	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Microwave is turning on.....");
	}
	@Override
	void turnOff() {
		super.turnOff();
	}

}
