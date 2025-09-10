package chapter6.video78;

public class Video78 {
	public static void main(String[] args) {
		System.out.println("-------------");
		Car myCar = new Car("toyota");
		Bus myBus = new Bus("vin");
		Motorbike myMotor = new Motorbike("honda");

		// Vehicle[] phuongTien = new Vehicle[3];
		// phuongTien[0] = myCar;
		// phuongTien[1] = myBus;
		// phuongTien[2] = myMotor;

		Vehicle[] phuongTien = { myCar, myBus, myMotor };
		for (Vehicle vehicle : phuongTien) {
			// Vehicle: ten cua doi tuong
			// vehicle: ten cua bien
			vehicle.start();// run time
		}

	}

}
