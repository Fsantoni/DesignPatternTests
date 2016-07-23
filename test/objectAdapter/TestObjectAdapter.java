package objectAdapter;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestObjectAdapter {
	

	@Test
	public final void testAdapterGetInt() {

		ObjectAdapter adapt = new ObjectAdapter(new Adaptee());
		int result=adapt.getIntResult();

		assertEquals(0,result);
	}
	
	@Test
	public final void testAdapterSetIntGetInt() {

		ObjectAdapter adapt = new ObjectAdapter(new Adaptee());
		adapt.setIntResult(0);
		int result=adapt.getIntResult();

		assertEquals(0,result);
	}
	
	

	@Test
	public final void testAdapterGetInt2() {
		
		Adaptee a =new AdapteeOpposite();
		ObjectAdapter adapt = new ObjectAdapter(a);
		
			int result=adapt.getIntResult();

		assertEquals(0,result);
	}


}

