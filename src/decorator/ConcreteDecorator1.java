package decorator;

public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(Component comp) {
		super(comp);
	}

	public String getName(){
		String a="1";
		a+=super.getName();
		return a;
	}
}