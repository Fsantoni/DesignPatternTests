package state;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestState {

	@Test
	public final void testStateContextWrite() {

		State state= new ConcreteState2();	
		StateContext s = new StateContext(state);
		int out=s.writeStateOutput();
		assertEquals(2,out);
	}

	@Test
	public final void testStateContextSetStateWrite() {

		State state= new ConcreteState2();	
		StateContext s = new StateContext(state);
		s.setState(new ConcreteState1());
		int out=s.writeStateOutput();
		assertEquals(1,out);
	}


	@Test
	public final void testStateContextWriteWrite1() {

		State state= new ConcreteState2();	
		StateContext s = new StateContext(state);
		s.writeStateOutput();
		int out=s.writeStateOutput();
		assertEquals(1,out);
	}


	@Test
	public final void testStateContextWriteWrite2() {

		State state= new ConcreteState2();
		StateContext s = new StateContext(state);
		s.writeStateOutput();
		s.writeStateOutput();
		s.writeStateOutput();
		s.writeStateOutput();
		int out=s.writeStateOutput();
		assertEquals(2,out);

	}


}
