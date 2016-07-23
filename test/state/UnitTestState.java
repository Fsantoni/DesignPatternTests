package state;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;
public class UnitTestState {
	
	@Test
	public final void testStateContextWrite() {
		
		State state = mock(ConcreteState2.class);
		when(state.writeOutput(isA(StateContext.class))).thenReturn(2);
			
		StateContext s = new StateContext(state);
		int out=s.writeStateOutput();
		assertEquals(2,out);
	}

	@Test
	public final void testStateContextSetStateWrite() {
		
		State state = mock(ConcreteState2.class);
		when(state.writeOutput(isA(StateContext.class))).thenReturn(2);
		State state1 = mock(ConcreteState1.class);
		when(state1.writeOutput(isA(StateContext.class))).thenReturn(1);
			
		StateContext s = new StateContext(state);
		s.setState(state1);
		int out=s.writeStateOutput();
		assertEquals(1,out);
	}
	
}
