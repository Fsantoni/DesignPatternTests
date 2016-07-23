package observer;

class ConcreteSubject extends Subject { 


	private int state;

	
	public ConcreteSubject(){
		super();
		this.state=0;
		
	}	
	
	public int getState() {
		return state;
	}

	public void setState( int in ) {
		if(state != in){
			state = in;
			setChanged(true);
		}
		notifyObservers();
	}

	
}