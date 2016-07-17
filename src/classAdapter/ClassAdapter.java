package classAdapter;

public class ClassAdapter extends Adaptee  implements Target{
	
	public void setIntResult(int newVal){
		setBooleanResult((newVal==0?false:true));
	}

	public int getIntResult(){
		return (getBooleanResult()?1:0);
	}
}
