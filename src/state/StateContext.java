package state;

public class StateContext {

	private State innerState;
	
	public StateContext(){
		this.innerState= new ConcreteState2();
	}
	
	public void setState(State name){
		this.innerState=name;
	}	
	
	public int writeStateOutput(){
		
		 return innerState.writeOutput(this);
		
	};
	
}
