package impl;

import interfaces.IBody;
import model.Body;
import model.H1;
import model.Title;

public class BodyImpl implements IBody {

	Body body = new Body();
	Title title = new TitleImpl().create();
	H1 h1 = new H1Impl().create();
	String contenidoHTML = new ContenidoHTMLImpl().create();
	
	@Override
	public Body create() {
		body.setTitulo(title);
		body.setH1(h1);
		body.setContenidoHTML(contenidoHTML);
		
		return body;
	}

}
