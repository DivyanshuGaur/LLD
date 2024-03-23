package behavioral.strategy.withStrategy;

public class SportsVehicle extends Vehicle {

	public SportsVehicle() {
		super(new SpecialDriveStrategy());
		
	}


}
