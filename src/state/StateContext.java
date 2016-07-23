package state;

public class StateContext {

	private State innerState;
	
	public StateContext(State state){
		this.innerState= state;
	}
	
	public void setState(State name){
		this.innerState=name;
	}	
	
	public int writeStateOutput(){
		
		 return innerState.writeOutput(this);
		
	};
	
}
