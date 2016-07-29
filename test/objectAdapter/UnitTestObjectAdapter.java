package objectAdapter;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;


public class UnitTestObjectAdapter {
		 
	@Test
	public final void testAdapterGetInt() {

		Adaptee adaptee = mock(Adaptee.class);
		when(adaptee.getBooleanResult()).thenReturn(false);
		
		ObjectAdapter adapt = new ObjectAdapter(adaptee);
		int result=adapt.getIntResult();

		assertEquals(0,result);
	}
	   
	
	
	@Test
	public final void testAdapterSetIntGetInt() {

		
		Adaptee adaptee = mock(Adaptee.class);
		doNothing().when(adaptee).setBooleanResult(false);
		when(adaptee.getBooleanResult()).thenReturn(false);
		
		ObjectAdapter adapt = new ObjectAdapter(adaptee);
		adapt.setIntResult(0);
		int result=adapt.getIntResult();

		assertEquals(0,result);
	}



	@Test
	public final void testAdapterSetAdapteeGetInt2() {

		AdapteeOpposite a = mock(AdapteeOpposite.class);
		doNothing().when(a).setBooleanResult(false);
		when(a.getBooleanResult()).thenReturn(true);

		ObjectAdapter adapt = new ObjectAdapter((Adaptee)a);
		
		int result=adapt.getIntResult();

		assertEquals(0,result);
		
		

		AdapteeOpposite b =mock(AdapteeOpposite.class);
		doNothing().when(b).setBooleanResult(true);
		when(b.getBooleanResult()).thenReturn(false);

		ObjectAdapter adapt1 = new ObjectAdapter(b);

		b.setBooleanResult(true);
		int result1 =adapt1.getIntResult();


		assertEquals(1,result1);

		
		
	}

	

}

