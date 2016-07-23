package proxy;

public abstract class SubjectInterface {
	protected String fileName;
	public SubjectInterface(String fName) {
		fileName = fName;
	}

	public abstract String getString();
	public abstract String getFileName();
	public abstract String getSubstring(int posit);
		
}


