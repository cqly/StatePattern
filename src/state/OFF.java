package state;

public class OFF implements DifferentState {

	private static OFF instance = null;

	private OFF() {

	}

	public static DifferentState getInstance() { 
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
