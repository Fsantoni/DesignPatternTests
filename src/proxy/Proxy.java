package proxy;

public class Proxy extends SubjectInterface {

	private RealSubject realHandler;
	private int cacheInt;
	private String cache;
	private boolean cacheInit=false;


	public Proxy ( String fName ){
		super( fName );
		cacheInt=-1;
		cache="";

	}

	public String getString(){
		if (realHandler == null)
			realHandler = new RealSubject(fileName);
		return realHandler.getString();
	}


	public String getFileName() {

		return this.fileName;
	}

	public String getSubstring(int posit) {

		if (cacheInt != posit || !cacheInit){
			cacheInit=true;
			cacheInt=posit;

			if (realHandler == null)
				realHandler = new RealSubject(fileName);
			cache=realHandler.getSubstring(posit);

		}return cache;
	}


}