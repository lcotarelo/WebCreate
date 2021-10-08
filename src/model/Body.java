package model;

public class Body {
	private Title titulo;
	private H1 h1;
	private String contenidoHTML;

	public Body() {

	}

	public Body(Title titulo, H1 h1, String contenidoHTML) {
		super();
		this.titulo = titulo;
		this.h1 = h1;
		this.contenidoHTML = contenidoHTML;
	}

	@Override
	public String toString() {
		return titulo.getTitle() + "<body>" + h1.getTexto() + contenidoHTML.toString() + "</body>";
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

	public String getContenidoHTML() {
		return contenidoHTML;
	}

	public void setContenidoHTML(String contenidoHTML) {
		this.contenidoHTML = contenidoHTML;
	}

}
