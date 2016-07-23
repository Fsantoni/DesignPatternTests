package observer;

class ConcreteObserver implements Observer { 
	private int state;
	private int counter =0;
	
	private ConcreteSubject subj;
	
	public ConcreteObserver( ConcreteSubject s ) {
		this.subj = s;
		this.subj.attach( this );
		this.state= subj.getState();
	} 
	public void update() {
		state = subj.getState();
	} 
	
	
	public int getState(){
		counter++;
		if(counter==2){
			subj.detach(this);
		}
		return state;
	}
}