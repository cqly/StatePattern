package state;

public class Button {

	private DifferentState current;

	public Button() { 
		current = OFF.getInstance(); 
	}
	public void setCurrent(DifferentState s) { 
		current = s;
	}

	public void push()	{ 
		current.push(this); 
	}
}