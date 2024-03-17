package behavioral.strategy.withStrategy;

public class OffroadVehicle extends Vehicle{

	public OffroadVehicle(DriveStrategy obj) {
		super(new SpecialDriveStrategy());	
	}
}
		
