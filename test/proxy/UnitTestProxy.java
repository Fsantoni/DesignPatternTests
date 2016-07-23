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
	
	
	
	@Test
	public final void testProxyGetString() {
		
		Proxy p = spy(new Proxy("p"));
		RealSubject s = mock(RealSubject.class);
		when(s.getString()).thenReturn("plong");
		doReturn(s).when(p).makeReal(anyString());
		
		String res= p.getString();
		assertEquals("plong", res);
	}
	
	@Test
	public final void testProxyGetStringGetString() {
		
		Proxy p = spy(new Proxy("p"));
		RealSubject s = mock(RealSubject.class);
		when(s.getString()).thenReturn("plong");
		doReturn(s).when(p).makeReal(anyString());
		
		p.getString();
		String res= p.getString();
		assertEquals("plong", res);
	}
	
	@Test
	public final void testProxyGetSubstring() {
		
		Proxy p = spy(new Proxy("p"));
		RealSubject s = mock(RealSubject.class);
		when(s.getSubstring(1)).thenReturn("long");
		doReturn(s).when(p).makeReal(anyString());
		
		String res= p.getSubstring(1);
		assertEquals("long", res);
	}
	
	@Test
	public final void testProxyGetStringGetSubstring() {
		Proxy p = spy(new Proxy("p"));
		RealSubject s = mock(RealSubject.class);
		when(s.getString()).thenReturn("plong");
		when(s.getSubstring(1)).thenReturn("long");
		doReturn(s).when(p).makeReal(anyString());
		
		p.getString();
		String res= p.getSubstring(1);
		assertEquals("long", res);
	}
	
	@Test
	public final void testProxyGetSubstringGetSubstring() {
		
		Proxy p = spy(new Proxy("p"));
		RealSubject s = mock(RealSubject.class);
		when(s.getSubstring(1)).thenReturn("long");
		when(s.getSubstring(2)).thenReturn("ong");
		
		doReturn(s).when(p).makeReal(anyString());
		p.getSubstring(1);
		String res= p.getSubstring(1);
		
		assertEquals("long", res);
		
		res= p.getSubstring(2);
		
		assertEquals("ong", res);
			
	}
	
	@Test
	public final void testProxyGetSubstringGetString() {
		
		Proxy p = spy(new Proxy("p"));
		RealSubject s = mock(RealSubject.class);
		when(s.getSubstring(1)).thenReturn("long");
		when(s.getString()).thenReturn("plong");
		
		doReturn(s).when(p).makeReal(anyString());
		p.getSubstring(1);
		String res= p.getString();
		assertEquals("plong", res);
	}
}
