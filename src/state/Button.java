package state;

public class Button {
	
	private State current;

	public Button() { 
		current = OFF.getInstance(); 
	}
	public void setCurrent(State s) { 
		current = s;
	}

	public void push()	{ 
		current.push( this ); 
	}
}