package classAdapter;
import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClassAdapter {
	
//****** Unit Tests ******//	
	
	@Test
	public final void unitTestAdapterSetIntGetInt() {

		ClassAdapter adapt = new ClassAdapter();
		adapt.setIntResult(0);
		int result=adapt.getIntResult();

		assertEquals(0,result);
	}

	@Test
	public final void unitTestAdapterSetBoolGetInt() {

		ClassAdapter adapt = new ClassAdapter();
		adapt.setBooleanResult(true);
		int result=adapt.getIntResult();

		assertEquals(1,result);
	}
	
	
//****** Integation Tests ******//	
	
	//si testano solo all uses, quindi basta un singolo input, non essendo un test di All Paths
	@Test
	public final void testAdapterSetIntGetInt() {

		ClassAdapter adapt = new ClassAdapter();
		adapt.setIntResult(0);
		int result=adapt.getIntResult();

		assertEquals(0,result);
	}

	@Test
	public final void testAdapterSetBoolGetInt() {

		ClassAdapter adapt = new ClassAdapter();
		adapt.setBooleanResult(true);
		int result=adapt.getIntResult();

		assertEquals(1,result);
	}

	
}
