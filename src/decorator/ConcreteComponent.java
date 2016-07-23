package decorator;

abstract class ConcreteComponent implements Component {

	private String name;

	public ConcreteComponent(String nam) {
		name = nam;
	}

	public void operation() {
	}

}