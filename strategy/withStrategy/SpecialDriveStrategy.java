package behavioral.strategy.withStrategy;

public class SpecialDriveStrategy implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("Special Drive ...");	
	}

}
