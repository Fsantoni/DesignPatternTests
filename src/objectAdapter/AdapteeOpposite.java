package objectAdapter;

public class AdapteeOpposite extends Adaptee{
	
	private boolean current=true;
	
	public void setBooleanResult(boolean newValue){
		current= !newValue;
	}
	
	public boolean getBooleanResult(){
		return current;
	};

}
