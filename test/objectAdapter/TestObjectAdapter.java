package objectAdapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestObjectAdapter {
		
	//****** Unit Tests ******//	
		
		@Test
		public final void unitTestAdapterSetIntGetInt() {

			ObjectAdapter adapt = new ObjectAdapter();
			adapt.setIntResult(0);
			int result=adapt.getIntResult();

			assertEquals(result, 0);
		}

		@Test
		public final void unitTestAdapterSetAdapteeGetInt() {

			ObjectAdapter adapt = new ObjectAdapter();
			adapt.setIntResult(0);
			int result=adapt.getIntResult();

			assertEquals(result, 0);
		}

		
		
	//****** Integation Tests ******//	
		
		@Test
		public final void testAdapterSetIntGetInt() {

			ObjectAdapter adapt = new ObjectAdapter();
			adapt.setIntResult(0);
			int result=adapt.getIntResult();

			assertEquals(result, 0);
		}

		@Test
		public final void testAdapterSetAdapteeGetInt() {

			ObjectAdapter adapt = new ObjectAdapter();
			adapt.setAdaptee(new Adaptee());
			int result=adapt.getIntResult();

			assertEquals(result, 0);
		}


		@Test
		public final void testAdapterSetAdapteeGetInt2() {

			ObjectAdapter adapt = new ObjectAdapter();
			Adaptee a =new AdapteeOpposite();
			
			adapt.setAdaptee(a);
			int result=adapt.getIntResult();

			assertEquals(result, 0);
		}

		
	}

