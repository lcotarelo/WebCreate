package model;

import java.util.List;

public class Site {
	private List<Page> paginas;
	private int cantidadDePaginas;

	public Site() {
	}

	public Site(List<Page> paginas, int cantidadDePaginas) {
		super();
		this.paginas = paginas;
		this.cantidadDePaginas = cantidadDePaginas;
	}

	public List<Page> getPaginas() {
		return paginas;
	}

	public void setPaginas(List<Page> paginas) {
		this.paginas = paginas;
	}

	public int getCantidadDePaginas() {
		return cantidadDePaginas;
	}

	public void setCantidadDePaginas(int cantidadDePaginas) {
		this.cantidadDePaginas = cantidadDePaginas;
	}

}
