package Ex3;

public class WashingMachine extends Appliance{
	@Override
	void turnOn () {
		System.out.println("Washing Machine is turning on..");
	}
	@Override
	void turnOff() {
		super.turnOff();
	}
}
