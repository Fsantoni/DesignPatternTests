package visitor;

public class ConcreteElement implements Element {
	private String value;
	public ConcreteElement(String string) {
		value = string;
	}
	public String getString() {
		return value;
	}
	public void accept( ConcreteVisitor visitor ) {
		visitor.visit( this );
	}
}