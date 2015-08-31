package state;

public class Button {

	private ButtonState current;

	public Button() { 
		current = OFF.getInstance(); 
	}
	public void setCurrent(ButtonState s) { 
		current = s;
	}

	public void push()	{ 
		current.push(this); 
	}
}