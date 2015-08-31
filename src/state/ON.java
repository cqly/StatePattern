package state;

public class ON implements State {

	private static ON instance = null;

	private ON() {

	}

	public static State getInstance() {
		if (instance == null) {
			instance = new ON();
		}			
		return instance; 
	}

	@Override
	public void push(Button b) {
		b.setCurrent( OFF.getInstance() );
		System.out.println(" Turning ON");

	}
}
