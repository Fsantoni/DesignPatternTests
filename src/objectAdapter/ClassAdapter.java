package objectAdapter;

public class ClassAdapter implements Target{
	
	private Adaptee adaptee;
	public ClassAdapter(){
		this.adaptee = new Adaptee();
	}
	
	public void setIntResult(int newVal){
		adaptee.setBooleanResult((newVal==0?false:true));
	}

	public int getIntResult(){
		return (adaptee.getBooleanResult()?1:0);
	}
}
