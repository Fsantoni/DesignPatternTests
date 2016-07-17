package composite;

public class Leaf extends Component{
	
	public Leaf(int val){
		super(val);
	}
	
	public float getValue(){
		return this.multiplicity;
	}

}
