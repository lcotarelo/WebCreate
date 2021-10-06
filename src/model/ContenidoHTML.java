package model;

public class ContenidoHTML {

	private Parrafo parrafo;
	private Imagen imagen;

	public ContenidoHTML() {
	}



	public ContenidoHTML(Parrafo parrafo, Imagen imagen) {
		super();
		this.parrafo = parrafo;
		this.imagen = imagen;
	}

	public Parrafo getParrafo() {
		return parrafo;
	}

	public void setParrafo(Parrafo parrafo) {
		this.parrafo = parrafo;
	}

	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

}
