package observer;

class ConcreteObserver implements Observer { 
	private int state;

	public ConcreteObserver(int ss) {
		this.state= ss;
	} 
	public void update(Subject s) {
		state=((ConcreteSubject)s).getState();
	} 


	public int getState(){
		return state;
	}

}