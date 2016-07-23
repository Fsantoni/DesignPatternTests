package observer;

class ConcreteObserver extends Observer { 
	public ConcreteObserver( Subject s ) {
		subj = s;
		subj.attach( this );
	} 
	public void update() {
		//do something santo bau
	} 
}