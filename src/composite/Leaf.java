package composite;

public class Leaf extends Component{
	
	public Leaf(float p){
		super(p);
	}
	
	public float getValue(){
		return this.price;
	}

}
