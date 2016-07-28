package visitor;

import java.util.LinkedList;

public class ConcreteVisitor implements Visitor {

	private	LinkedList<Element> list;
	
	private String str;
	
	public ConcreteVisitor(LinkedList<Element> l){
		list = l;
		str="";
	}
	
	public String getTotal(){
		return str;
	}
	
	public void visit() {
		str = "";
		for(Element e: list){
			e.accept(this);
		}
	}
	public void visit(ConcreteElement2 vString) {
		this.str += vString.getString();
	}
	public void visit(ConcreteElement1 vFloat) {
		this.str += vFloat.getDouble().toString();
	}
}