package classAdapter;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestClassAdapter {


	@Test
	public final void testAdapterGetInt() {

		ClassAdapter adapt = new ClassAdapter();
		int result=adapt.getIntResult();

		assertEquals(0,result);
	}
	@Test
	public final void testAdapterGetBool() {

		ClassAdapter adapt = new ClassAdapter();
	boolean result=adapt.getBooleanResult();

		assertEquals(false,result);
	}
	//si testano solo all uses, quindi basta un singolo input, non essendo un test di All Paths
	@Test
	public final void testAdapterSetIntGetInt() {

		ClassAdapter adapt = new ClassAdapter();
		adapt.setIntResult(0);
		int result=adapt.getIntResult();

		assertEquals(0,result);
	}

	@Test
	public final void testAdapterSetIntGetBool() {

		ClassAdapter adapt = new ClassAdapter();
		adapt.setIntResult(10);
		boolean result=adapt.getBooleanResult();

		assertEquals(true,result);
	}

	@Test
	public final void testAdapterSetBoolGetInt() {

		ClassAdapter adapt = new ClassAdapter();
		adapt.setBooleanResult(true);
		int result=adapt.getIntResult();

		assertEquals(1,result);
	}


}
