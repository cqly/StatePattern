package state;

public class OFF implements State {

	private static OFF instance = null;

	private OFF() {
		
	}

	public static State getInstance() { 
		if (instance == null) {
			instance = new OFF();
		}			
		return instance; 
	}
	

	public void push( Button b ) {
		
		b.setCurrent( ON.getInstance() );
		System.out.println( "   turning OFF" ); 
	}
}
