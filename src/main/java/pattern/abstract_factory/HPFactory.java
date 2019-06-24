package pattern.abstract_factory;

public class HPFactory implements PCFactory {
	@Override
	public Mouse createMouse() {
		return new HPMouse();
	}
	
	@Override
	public Keyboard createKeyboard() {
		return new HPKeyboard();
	}
}
