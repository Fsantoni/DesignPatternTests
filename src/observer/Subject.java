package observer;

import java.util.LinkedList;

class Subject { 
	private LinkedList<Observer> observers;

	private boolean changed;
	
	public Subject(){
		this.changed = false;
		this.observers = new LinkedList<Observer>();
	}
	
	public void attach( Observer o ) {
		observers.add(o);
	}
	public void detach( Observer o ) {
		observers.remove(o);
	}

	
	public void setChanged(boolean b){
		this.changed=b;
	}
	
	

	protected void notifyObservers() {
		if(changed){
			for (Observer obs: observers) {
				obs.update();
			}
		}
		setChanged(false);
	}
}