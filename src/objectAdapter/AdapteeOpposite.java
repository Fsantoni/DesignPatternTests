package objectAdapter;


public class AdapteeOpposite extends Adaptee{
	
	private boolean current=false;
	

	public boolean getBooleanResult(){
		return !current;
	};

}
