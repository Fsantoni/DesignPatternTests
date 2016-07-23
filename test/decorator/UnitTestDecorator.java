package decorator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class UnitTestDecorator {


		@Test
		public final void topologyTestConcreteComp() {	

			ConcreteComponent a = new ConcreteComponent("a");
		
			String res=a.getName();
			assertEquals("a",res);

		}
		@Test
		public final void topologyTestDecoratorConcreteComp() {	

			ConcreteComponent a = mock(ConcreteComponent.class);
			when(a.getName()).thenReturn("a");
			
			ConcreteDecorator1 b= new ConcreteDecorator1(a);
					
			String res=b.getName();
			assertEquals("1a",res);

		}
		@Test
		public final void topologyTestDecoratorDecoratorConcreteComp() {	
			ConcreteDecorator1 b=  mock(ConcreteDecorator1.class);
			when(b.getName()).thenReturn("1a");
			ConcreteDecorator2 c= new ConcreteDecorator2(b);
			
			String res=c.getName();
			assertEquals("21a",res);

		}
	

	}
