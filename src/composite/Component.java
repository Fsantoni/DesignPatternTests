package composite;

public abstract class Component {

	protected float price;
	public Component(float p){
		price = p;
	}
	public abstract float getValue();
	
	public void add(Component c) throws CompositeException {
		if (this instanceof Leaf)
			throw new CompositeException("execution of add on Leaf");
	}
	public void remove(Component c) throws CompositeException{
		if (this instanceof Leaf)
			throw new CompositeException("execution of remove on Leaf");
	}
	
	//returns null for LEAF requests
	public Component getChild(int n){
		return null;
	}
}