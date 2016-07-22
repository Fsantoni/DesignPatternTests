package composite;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class UnitTestComposite{

	@Test
	public final void testCompAddGetChild() {

		Leaf a = mock(Leaf.class);
		CompoundPart b = mock(CompoundPart.class);
		when(a.getValue()).thenReturn(2.1f);
		when(b.getValue()).thenReturn(5.1f);
		doNothing().when(b).add(a);


		CompoundPart c = new CompoundPart(1f);
		b.add(a); //mocked
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

		Leaf a = mock(Leaf.class);
		CompoundPart b = mock(CompoundPart.class);
		when(a.getValue()).thenReturn(2.1f);
		when(b.getValue()).thenReturn(5.1f);
		doNothing().when(b).add(a);

		CompoundPart c = new CompoundPart(1f);
		b.add(a); //mocked
		c.add(b);

		float res = c.getValue();
		assertEquals(6.1, res, 0.1);

	}

	@Test
	public final void testCompAddAddRemoveGetChild() {

		Leaf a = mock(Leaf.class);
		CompoundPart b = mock(CompoundPart.class);
		when(a.getValue()).thenReturn(2.1f);
		when(b.getValue()).thenReturn(5.1f);
		doNothing().when(b).add(a);

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

		Leaf a = mock(Leaf.class);
		CompoundPart b = mock(CompoundPart.class);
		when(a.getValue()).thenReturn(2.1f);
		when(b.getValue()).thenReturn(5.1f);
		doNothing().when(b).add(a);
		
		CompoundPart c = new CompoundPart(1f);
		b.add(a);
		c.add(a);
		c.remove(a);
		c.add(b);

		float res = c.getValue();
		assertEquals(6.1, res, 0.1);

	}

	@Test
	public final void topologyTestCompositeLeaf() {	

		Leaf a = mock(Leaf.class);
		CompoundPart b = mock(CompoundPart.class);
		when(a.getValue()).thenReturn(4.1f);
		when(b.getValue()).thenReturn(5.1f);
		doNothing().when(b).add(a);
		
		CompoundPart c = new CompoundPart(1f);
		b.add(a);
		c.add(b);

		float res = c.getValue();
		assertEquals(6.1, res, 0.1);

	}

	@Test
	public final void testAddRemoveGetChildOnLeaf() {	

		Leaf a = new Leaf(4.1f);
		
		CompoundPart b = mock(CompoundPart.class);
		when(b.getValue()).thenReturn(5.1f);
	
		boolean catched =false;
		try{
			a.add(b);
		}catch(CompositeException e){
			catched = true;
		}
		assertTrue(catched);

		catched =false;
		try{
			a.remove(b);
		}catch(CompositeException e){
			catched = true;
		}
		assertTrue(catched);


		Component c=a.getChild(2);
		assertNull(c);

	}





}
