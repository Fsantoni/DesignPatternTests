package observer;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestObserver {
	
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
		ConcreteSubject s = new ConcreteSubject();
		ConcreteObserver c = new ConcreteObserver(0);
		s.attach(c);
		s.setState(2);
		int res=c.getState();
		assertArrayEquals(new Object[]{c}, s.getList());
		
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
		s.detach(new ConcreteObserver(0));
		s.setState(2);
		int res=s.getState();
		assertArrayEquals(new Object[]{}, s.getList());
		
		assertEquals(2, res); //assert that no Exception has been launched(due to detach on empty list) and that state was updated correctly 
	}
	
	
	@Test
	public void testSubjectAttach3Detach2() {
		ConcreteSubject s = new ConcreteSubject();
		ConcreteObserver c = new ConcreteObserver(0);
		ConcreteObserver b = new ConcreteObserver(1);
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
		int res=s.getState();
		assertEquals(2, res);
		assertEquals(0,c.getState());
		assertEquals(2,b.getState());
	}
	
	@Test
	public void testAttach2Detach2Attach1Detach1Attach1() {
		ConcreteSubject s = new ConcreteSubject();
		ConcreteObserver c = new ConcreteObserver(0);
		ConcreteObserver b = new ConcreteObserver(1);
		ConcreteObserver d = new ConcreteObserver(2);
		
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
		int res=s.getState();
		assertEquals(3, res);
		assertEquals(0,c.getState());
		assertEquals(1,b.getState());
		assertEquals(3,d.getState());
	}

}
