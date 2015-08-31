package state;

public class OFF implements ButtonState {

	private static OFF instance = null;

	private OFF() {

	}

	public static ButtonState getInstance() { 
		if (instance == null) {
			instance = new OFF();
		}			
		return instance; 
	}

	@Override
	public void push(Button b) {
		System.out.println(" Turning ON");
		b.setCurrent(ON.getInstance());

	}
}
