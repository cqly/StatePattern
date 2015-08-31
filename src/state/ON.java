package state;

public class ON implements ButtonState {

	private static ON instance = null;

	private ON() {

	}

	public static ButtonState getInstance() {
		if (instance == null) {
			instance = new ON();
		}			
		return instance; 
	}

	@Override
	public void push(Button b) {
		System.out.println(" Turning OFF");
		b.setCurrent(OFF.getInstance());

	}
}
