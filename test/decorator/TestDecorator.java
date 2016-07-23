package decorator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDecorator {


		@Test
		public final void topologyTestConcreteComp() {	

			ConcreteComponent a = new ConcreteComponent("a");
		
			String res=a.getName();
			assertEquals("a",res);

		}
		@Test
		public final void topologyTestDecoratorConcreteComp() {	

			ConcreteComponent a = new ConcreteComponent("a");
			ConcreteDecorator1 b= new ConcreteDecorator1(a);
					
			String res=b.getName();
			assertEquals("1a",res);

		}
		@Test
		public final void topologyTestDecoratorDecoratorConcreteComp() {	

			ConcreteComponent a = new ConcreteComponent("a");
			ConcreteDecorator1 b= new ConcreteDecorator1(a);
			ConcreteDecorator2 c= new ConcreteDecorator2(b);
			
			String res=c.getName();
			assertEquals("21a",res);

		}
	

	}
