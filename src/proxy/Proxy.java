package proxy;

public class Proxy extends SubjectInterface {
	private RealSubject realHandler;
	public Proxy ( String fName ){
		super( fName );

	}

	public String getString(){
		if (realHandler == null)
			realHandler = new RealSubject(fileName);
		return realHandler.getString();
	}

}