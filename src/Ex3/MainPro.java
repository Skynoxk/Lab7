package Ex3;

public class MainPro {
	public static void main(String[] args) {
		WashingMachine p1 = new WashingMachine();
		p1.turnOn();
		p1.turnOff();
		Microwave p2 = new Microwave();
		System.out.println("======================");
		p2.turnOn();
		p2.turnOff();
	}
}
