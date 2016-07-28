package objectAdapter;


public class ObjectAdapter implements Target{

	private Adaptee adaptee;
	public ObjectAdapter(Adaptee adaptee){
		this.adaptee = adaptee;
	}

	public void setIntResult(int newVal){
		adaptee.setBooleanResult((newVal==0?false:true));
	}

	public int getIntResult(){
		boolean b= adaptee.getBooleanResult();
		if(adaptee instanceof AdapteeOpposite){
			b=!b;
		}

		return (b?1:0);
	}
}
