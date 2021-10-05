package model;

public class Page {
	private Body body;
	private FileLocation fileLocation;

	public Page() {
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}

	public FileLocation getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(FileLocation fileLocation) {
		this.fileLocation = fileLocation;
	}


	public Page(Body body, FileLocation fileLocation) {
		super();
		this.body = body;
		this.fileLocation = fileLocation;
	}


}
