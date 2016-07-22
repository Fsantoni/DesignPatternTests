package composite;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestComposite{

//****** Unit Tests ******//
	
	


//****** Integation Tests ******//	
	@Test
	public final void testCompAddGetChild() {
		
		Leaf a = new Leaf(2.1f);
		CompoundPart b = new CompoundPart(3f);
		CompoundPart c = new CompoundPart(1f);
		b.add(a);
		c.add(b);
	
		boolean catched =false;
		try{
		c.getChild(2);
		}catch(ArrayIndexOutOfBoundsException e){
			catched = true;
		}
		assertTrue(catched);
		
		Component res1 = c.getChild(0);
		
		assertEquals(5.1,res1.getValue(),0.1);
		
	}

	@Test
	public final void testCompAddGetValue() {	
	
	Leaf a = new Leaf(2.1f);
	CompoundPart b = new CompoundPart(3f);
	CompoundPart c = new CompoundPart(1f);
	b.add(a);
	c.add(b);
	
	float res = c.getValue();
	assertEquals(6.1, res, 0.1);
	
	}
	
	@Test
	public final void testCompAddAddRemoveGetChild() {
		
		Leaf a = new Leaf(2.1f);
		CompoundPart b = new CompoundPart(3f);
		CompoundPart c = new CompoundPart(1f);
		b.add(a);
		c.add(a);
		c.remove(a);
		c.add(b);
		
		
		Component res1 = c.getChild(0);
		
		assertEquals(5.1,res1.getValue(),0.1);
		
	}

	@Test
	public final void testCompAddAddRemoveGetValue() {	
	
	Leaf a = new Leaf(2.1f);
	CompoundPart b = new CompoundPart(3f);
	CompoundPart c = new CompoundPart(1f);
	b.add(a);
	c.add(a);
	c.remove(a);
	c.add(b);
	
	float res = c.getValue();
	assertEquals(6.1, res, 0.1);
	
	}


		
	
	
}
