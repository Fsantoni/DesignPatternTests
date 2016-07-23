package visitor;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import java.util.LinkedList;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class UnitTestVisitor {

//	Visitor ConcreteVisitor Element ConcreteElement2 Visitor
// 	Visitor ConcreteVisitor Element ConcreteElement1 Visitor
  
	
	@Test
	public final void testTopologyConcrete1() {
		
		LinkedList<Element> list = new LinkedList<Element>();
		
		ConcreteElement1 a = mock(ConcreteElement1.class);
		doAnswer(new Answer<Void>() {
		    public Void answer(InvocationOnMock invocation) {
		        ((ConcreteVisitor)invocation.getArguments()[0]).visit(a);
		       return null;
		    }
		}).when(a).accept(any(ConcreteVisitor.class));
		
		when(a.getDouble()).thenReturn(2.0);
		
		list.add(a);
		ConcreteVisitor v = new ConcreteVisitor(list);
		v.visit();
		verify(a, times(1)).getDouble();
		
		String res=v.getTotal();
		assertEquals("2.0", res );
		
	}

	@Test
	public final void testTopologyConcrete2() {
		
	LinkedList<Element> list = new LinkedList<Element>();
	
		
		ConcreteElement2 b = mock(ConcreteElement2.class);
		doAnswer(new Answer<Void>() {
		    public Void answer(InvocationOnMock invocation) {
		        ((ConcreteVisitor)invocation.getArguments()[0]).visit(b);
		       return null;
		    }
		}).when(b).accept(any(ConcreteVisitor.class));
		
		when(b.getString()).thenReturn("b");
		
		list.add(b);
		
		ConcreteVisitor v = new ConcreteVisitor(list);
		v.visit();
		verify(b, atLeastOnce()).getString();

		String res=v.getTotal();
		
		assertEquals("b", res );
		
	}
}
