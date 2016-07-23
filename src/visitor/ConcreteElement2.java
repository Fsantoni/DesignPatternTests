package visitor;

public class ConcreteElement2 implements Element {
	private String str;
	public ConcreteElement2(String string) {
		str = string;
	}
		
	public String getString() {
		return str;
	}
	public void accept( ConcreteVisitor visitor ) {
		visitor.visit( this );
	}
}