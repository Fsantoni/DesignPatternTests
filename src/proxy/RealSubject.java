package proxy;

class RealSubject extends SubjectInterface {

	private byte[] str;

	public RealSubject( String fName ){
		super(fName);
	}

	public String getString(){
		return new String(str);
	}
}