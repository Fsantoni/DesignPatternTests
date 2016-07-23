package proxy;

public abstract class SubjectInterface {
	protected String fileName;
	public SubjectInterface(String fName) {
		fileName = fName;
	}

	public abstract String getString();
}
