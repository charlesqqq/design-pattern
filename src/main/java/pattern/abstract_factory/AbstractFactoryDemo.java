package pattern.abstract_factory;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		PCFactory factory = new HPFactory();
		Mouse mouse = factory.createMouse();
		Keyboard keyboard = factory.createKeyboard();
		mouse.name();
		keyboard.name();
		
		factory = new DellFactory();
		mouse = factory.createMouse();
		keyboard = factory.createKeyboard();
		mouse.name();
		keyboard.name();
	}
}
