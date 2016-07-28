package objectAdapter;

public class Adaptee {
	
	protected boolean current=false;
	
	public void setBooleanResult(boolean newValue){
		current= newValue;
	}
	
	public boolean getBooleanResult(){
		return current;
	};

}
