package visitor;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class TestVisitor {

//	Visitor ConcreteVisitor Element ConcreteElement2 Visitor
// 	Visitor ConcreteVisitor Element ConcreteElement1 Visitor
  
	
	@Test
	public final void testTopologyConcrete1() {
		
		LinkedList<Element> list = new LinkedList<Element>();
		list.add(new ConcreteElement1(2.0));
		ConcreteVisitor v = new ConcreteVisitor(list);
		v.visit();
		String res=v.getTotal();
		assertEquals("2.0", res );
		
	}

	@Test
	public final void testTopologyConcrete2() {
		
		LinkedList<Element> list = new LinkedList<Element>();
		list.add(new ConcreteElement2("a"));
		ConcreteVisitor v = new ConcreteVisitor(list);
		v.visit();
		String res=v.getTotal();
		
		assertEquals("a", res );
		
	}
}
