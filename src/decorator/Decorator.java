package decorator;

abstract class Decorator implements Component{

	protected Component decor;

	public Decorator(Component comp) {
		decor = comp;
	}

	public String getName(){
		return decor.getName();

	}

}