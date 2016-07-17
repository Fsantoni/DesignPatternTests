package state;

public class ConcreteState1 implements State {
	private int counter=0;

	public int writeOutput(StateContext stateContext){
		if( counter==2){
			stateContext.setState(new ConcreteState2());
		}
		counter++;
		return 1;
	};
	
}
