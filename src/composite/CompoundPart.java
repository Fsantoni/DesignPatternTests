package composite;

import java.util.Vector;

public class CompoundPart extends Component {

	public CompoundPart(float p){
			super(p);
			children = new Vector<Component>();
	}
	private Vector<Component> children ;


	public float getValue(){
		float count = this.price;
		int size = children.size();
		for( int i=0; i< size ; i ++ ) {
			Component c = children.get( i );
			count+= c.getValue();
		}
		return count;
	}

	public void add(Component c){
		children.addElement(c);
	}

	public void remove(Component c){
		children.removeElement(c);
	}
	
	public Component getChild(int n) {
		return children.elementAt(n);
	}
}
