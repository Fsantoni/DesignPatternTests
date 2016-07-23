package observer;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class UnitTestObserver {
	
//	ConcreteObs GetState
// 	ConcreteObs Update GetState
//	
// 	Subject setState[notify]
// 	Subject detach				 <- In questo caso il driver fa le veci dell'"Object", ne chiamo il metodo e lo "lascio fare", identico anche in integration test 
// Subject attach attach attach detach detach  (+setState[notify]) x4 attach attach E attach detach E detach detach E detach notify
// 	Subject attach attach detach detach attach (+setState[notify]) x3 subject attach E detach attach E attach notify 

	
	@Test
	public void testConcreteGetState() {
		ConcreteObserver c = new ConcreteObserver(2);
		
		int res=c.getState();
		assertEquals(2, res);
	}
	
	@Test
	public void testConcreteUpdateGetState() {
		ConcreteSubject s = mock(ConcreteSubject.class);
		ConcreteObserver c = new ConcreteObserver(0);
		doReturn(2).when(s).getState();
		
		c.update(s);
		int res=c.getState();
		assertEquals(2, res);
	}
	
	@Test
	public void testSubjectSetState() {
		ConcreteSubject s = new ConcreteSubject();
		s.setState(2);
		int res=s.getState();
		assertArrayEquals(new Object[]{}, s.getList());
		
		assertEquals(2, res); //assert that no Exception has been launched(due to empty list) and that state was updated correctly
	}
	
	@Test
	public void testSubjectDetachSetState() {
		ConcreteSubject s = new ConcreteSubject();
		
		ConcreteObserver c = mock(ConcreteObserver.class);
		doNothing().when(c).update(any(ConcreteSubject.class));
			
		s.detach(c);
		s.setState(2);
		int res=s.getState();
		assertArrayEquals(new Object[]{}, s.getList());
		
		assertEquals(2, res); //assert that no Exception has been launched(due to detach on empty list) and that state was updated correctly 
	}
	
	
	@Test
	public void testSubjectAttach3Detach2() {
		ConcreteSubject s = new ConcreteSubject();
		ConcreteObserver c = mock(ConcreteObserver.class);
		doNothing().when(c).update(any(ConcreteSubject.class));
		ConcreteObserver b = mock(ConcreteObserver.class);
		doNothing().when(b).update(any(ConcreteSubject.class));
			
		s.attach(c);
		assertArrayEquals(new Object[]{c}, s.getList());
		
		s.attach(c);
		
		assertArrayEquals(new Object[]{c,c}, s.getList());
		
		s.attach(b);
		
		assertArrayEquals(new Object[]{c,c,b}, s.getList());
		
		s.detach(c);
		
		assertArrayEquals(new Object[]{c,b}, s.getList());
		
		s.detach(c);
		
		assertArrayEquals(new Object[]{b}, s.getList());
		
		s.setState(2);
		verify(c,never()).update(s);
		verify(b,times(1)).update(s);
		int res=s.getState();
		assertEquals(2, res);
	}
	
	@Test
	public void testAttach2Detach2Attach1() {
		ConcreteSubject s = new ConcreteSubject();
		ConcreteObserver c = mock(ConcreteObserver.class);
		doNothing().when(c).update(any(ConcreteSubject.class));
		ConcreteObserver b = mock(ConcreteObserver.class);
		doNothing().when(b).update(any(ConcreteSubject.class));
		ConcreteObserver d = mock(ConcreteObserver.class);
		doNothing().when(d).update(any(ConcreteSubject.class));
		
		s.attach(c);
		assertArrayEquals(new Object[]{c}, s.getList());
		
		s.attach(b);
		assertArrayEquals(new Object[]{c,b}, s.getList());
		
		s.detach(b);
		assertArrayEquals(new Object[]{c}, s.getList());
		s.detach(c);
		assertArrayEquals(new Object[]{}, s.getList());
		s.attach(c);
		assertArrayEquals(new Object[]{c}, s.getList());
		s.detach(c);
		assertArrayEquals(new Object[]{}, s.getList());
		s.attach(d);
		assertArrayEquals(new Object[]{d}, s.getList());
		
		
		
		s.setState(3);
		verify(c,never()).update(s);
		verify(b,never()).update(s);
		verify(d,times(1)).update(s);
		int res=s.getState();
		assertEquals(3, res);
	
	}

}
