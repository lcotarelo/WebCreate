package impl;

import interfaces.ICreable;
import model.Body;
import model.FileLocation;
import model.Page;

public class PageImpl implements ICreable {

	Page page = new Page();
	Body body = new BodyImpl().create();
	FileLocation fileLocation = new FileLocationImpl().create();
	@Override
	public Page create() {
		page.setBody(body);
		page.setFileLocation(fileLocation);
		return page;
	}

}
