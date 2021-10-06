package impl;

import interfaces.IPage;
import model.Body;
import model.FileLocation;
import model.Page;

public class PageImpl implements IPage {

	Page page = new Page();
	FileLocation fileLocation = new FileLocationImpl().create();
	Body body = new BodyImpl().create();

	@Override
	public Page create() {
		page.setFileLocation(fileLocation);
		page.setBody(body);
		return page;
	}

}
