package impl;

import interfaces.IBody;
import model.Body;
import model.H1;
import model.Imagen;
import model.Parrafo;
import model.Title;

public class BodyImpl implements IBody {

	Body body = new Body();
	Title title = new TitleImpl().create();
	H1 h1 = new H1Impl().create();
	Imagen imagen = new ImagenImpl().create();
	Parrafo parrafo = new ParrafoImpl().create();
	
	@Override
	public Body create() {
		body.setTitulo(title);
		body.setH1(h1);
		body.setParrafo(parrafo);
		body.setImagen(imagen);
		
		return body;
	}

}
