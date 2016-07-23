package proxy;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class UnitTestProxy {

//	Proxy getstring
// 	Proxy getstring getstring
// 	Proxt getSubstring
// 	Proxy getstring getsubstring
// 	Proxy getsubstring getsubstring testa ANCHE per CACHE
// 	Proxy getsubstring getstring
	
	private class FakeProxy extends RealSubject{
		
	}
	
	@Test
	public final void testProxyGetString() {
		
		Proxy p = new Proxy("p");
		String res= p.getString();
		assertEquals("plong", res);
	}
	
	@Test
	public final void testProxyGetStringGetString() {
		
		Proxy p = new Proxy("p");
		p.getString();
		String res= p.getString();
		assertEquals("plong", res);
	}
	
	@Test
	public final void testProxyGetSubstring() {
		
		Proxy p = new Proxy("p");
		String res= p.getSubstring(1);
		assertEquals("long", res);
	}
	
	@Test
	public final void testProxyGetStringGetSubstring() {
		
		Proxy p = new Proxy("p");
		p.getString();
		String res= p.getSubstring(1);
		assertEquals("long", res);
	}
	
	@Test
	public final void testProxyGetSubstringGetSubstring() {
		
		Proxy p = new Proxy("p");
		p.getSubstring(1);
		String res= p.getSubstring(1);
		
		assertEquals("long", res);
		
		res= p.getSubstring(2);
		
		assertEquals("ong", res);
			
	}
	
	@Test
	public final void testProxyGetSubstringGetString() {
		
		Proxy p = new Proxy("p");
		p.getSubstring(1);
		String res= p.getString();
		assertEquals("plong", res);
	}
}
