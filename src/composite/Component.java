package composite;

public abstract class Component {

	public float multiplicity;
	public Component(float val){
		multiplicity = val;
	}
	public abstract float getValue();
	
	public void add(Component c) throws SinglePartException {
		if (this instanceof Leaf)
			throw new SinglePartException("execution of add on Leaf");
	}
	public void remove(Component c) throws SinglePartException{
		if (this instanceof Leaf)
			throw new SinglePartException("execution of remove on Leaf");
	}
	
	//returns null for LEAF requests
	public Component getChild(int n){
		return null;
	}
}