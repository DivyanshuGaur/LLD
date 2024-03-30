package creational.factory;

public class ShapeFactory {

	
		public Shape getShape(String rule) {
			
				switch(rule) {
				case "circle": return new Circle();
				case "square": return new Square();
				default : return null;
				
				}
		}
	
}
