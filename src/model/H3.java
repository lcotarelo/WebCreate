package model;

public class H3 {
	private String texto;

	public H3() {
	}

	public H3(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = "<h3>"+texto+"</h3>";
	}

}
