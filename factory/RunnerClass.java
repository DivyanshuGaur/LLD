package creational.factory;

public class RunnerClass {

		public static void main(String[] args) {
			ShapeFactory sfObj=new ShapeFactory();
			Shape cs=sfObj.getShape("circle");
			Shape ss=sfObj.getShape("square");
			cs.draw();
			ss.draw();
		}
}
