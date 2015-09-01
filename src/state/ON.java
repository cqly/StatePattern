package state;

public class ON implements DifferentState {

	private static ON instance = null;

	private ON() {

	}

	public static DifferentState getInstance() {
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
