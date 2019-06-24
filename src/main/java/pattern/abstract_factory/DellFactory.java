package pattern.abstract_factory;

public class DellFactory implements PCFactory {
	@Override
	public Mouse createMouse() {
		return new DellMouse();
	}
	
	@Override
	public Keyboard createKeyboard() {
		return new DellKeyboard();
	}
}
