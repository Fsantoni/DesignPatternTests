package decorator;

public class ConcreteComponent implements Component {

	private String name;

	public ConcreteComponent(String nam) {
		name = nam;
	}

	public String getName(){
		return name;
	}
	
}