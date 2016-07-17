package state;

public class ConcreteState2 implements State {

	public int writeOutput(StateContext stateContext){

		stateContext.setState(new ConcreteState1());

		return 2;
	};

}
