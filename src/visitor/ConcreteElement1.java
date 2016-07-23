package visitor;

public class ConcreteElement1 implements Element {
	private Double value;
	public ConcreteElement1(Double f) {
		value = new Double( f );
	}

	public Double getDouble() {
		return value;
	}
	public void accept( ConcreteVisitor visitor ) {
		visitor.visit( this );
	}
}