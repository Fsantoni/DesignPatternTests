package visitor;

public class ConcreteElement1 implements Element {
	private Float value;
	public ConcreteElement1(float f) {
		value = new Float( f );
	}

	public Float getFloat() {
		return value;
	}
	public void accept( ConcreteVisitor visitor ) {
		visitor.visit( this );
	}
}