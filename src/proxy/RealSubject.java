package proxy;

class RealSubject extends SubjectInterface {

	private String longStr;

	public RealSubject( String fName ){
		super(fName);
		this.longStr= fName+"long";
	}
	
	

	public String getString(){
		return longStr;
	}

	@Override
	public String getFileName() {
		
		return this.fileName;
	}


	public String getSubstring(int posit) {
		
		return longStr.substring(posit);
	}
}