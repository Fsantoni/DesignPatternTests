package objectAdapter;

public class Adaptee {
	
	private boolean current=false;
	
	public void setBooleanResult(boolean newValue){
		current= newValue;
	}
	
	public boolean getBooleanResult(){
		return current;
	};

}
