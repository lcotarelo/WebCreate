package model;

public class Body {
	private Title titulo;
	private H1 h1;
	private Parrafo parrafo;
	private Imagen imagen;
	
	public Body() {

	}

	@Override
	public String toString() {
		return "<body>"+titulo.getTitle() + h1.getTexto() + parrafo.getContenido() + imagen.getImagenLocation()+"</body>";
	}

	public Body(Title titulo, H1 h1, Parrafo parrafo, Imagen imagen) {
		super();
		this.titulo = titulo;
		this.h1 = h1;
		this.parrafo = parrafo;
		this.imagen = imagen;
	}

	public Title getTitulo() {
		return titulo;
	}

	public void setTitulo(Title titulo) {
		this.titulo = titulo;
	}

	public H1 getH1() {
		return h1;
	}

	public void setH1(H1 h1) {
		this.h1 = h1;
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
