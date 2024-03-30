package behavioral.strategy.withStrategy;

public class Vehicle {

		DriveStrategy obj;
		public Vehicle(DriveStrategy obj) {
			this.obj=obj;
		}

		public void drive() {
			obj.drive();
		}
}
