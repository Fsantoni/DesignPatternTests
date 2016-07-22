package objectAdapter;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


public class UnitTestObjectAdapter {
		 
	    
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
	}

	

}

