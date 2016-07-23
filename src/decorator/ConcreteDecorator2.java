package decorator;

public class ConcreteDecorator2 extends Decorator {

	public ConcreteDecorator2(Component comp) {
		super(comp);
	}

	public String getName(){
		String a="2";
		a+=super.getName();
		return a;
	}
}