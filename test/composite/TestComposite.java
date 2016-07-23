package composite;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestComposite{

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

	@Test
	public final void topologyTestLeaf() {	

		Leaf a = new Leaf(4.1f);
	
		float res = a.getValue();
		assertEquals(4.1, res, 0.1);

	}
	
	@Test
	public final void topologyTestCompositeComposite() {	

		CompoundPart b = new CompoundPart(1f);
		CompoundPart c = new CompoundPart(1f);
		c.add(b);

		float res = c.getValue();
		assertEquals(2, res, 0.1);

	}
	@Test
	public final void topologyTestCompositeLeaf() {	

		Leaf a = new Leaf(4.1f);
		CompoundPart b = new CompoundPart(1f);
		b.add(a);
	
		float res = b.getValue();
		assertEquals(5.1, res, 0.1);

	}

	@Test
	public final void testAddRemoveGetChildOnLeaf() {	

		Leaf a = new Leaf(4.1f);

		CompoundPart b = new CompoundPart(1f);

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
