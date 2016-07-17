package classAdapter;


public class Client {

	public static void main(String[] args) {
		
		Target adapt = new ClassAdapter();
		
		System.out.println("A default Target has value:"+adapt.getIntResult());
		
		adapt.setIntResult(6);
		System.out.println("A Target with set value 6, has value:"+adapt.getIntResult());
		
		
	}
}