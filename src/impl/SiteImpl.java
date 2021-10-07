package impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.ISite;
import model.Page;
import model.Site;

public class SiteImpl implements ISite {

	Site site = new Site();
	PageMaker pm = new PageMaker();
	List<Page> paginas = new ArrayList<>();

	@Override
	public Site create() {

		Scanner sc = new Scanner(System.in);
		System.out.println(Mensajes.SITE_CANTIDAD_DE_PAGINAS.getMensaje());
		int pagina = sc.nextInt();
		try {
			int i;
			for (i = 0; i < pagina; i++) {
				System.out.println(Mensajes.SITE_COMIENZO_DE_PAGINA.getMensaje() + (i + 1));
				Page paginaActual = PageMaker.Maker();
				System.out.println(Mensajes.SITE_FIN_DE_PAGINA.getMensaje() + (i + 1));
				paginas.add(paginaActual);
			}
			site.setCantidadDePaginas(pagina);
			System.out.println(site.getCantidadDePaginas());
			site.setPaginas(paginas);
			return site;

		} catch (Exception e) {
			System.out.println("Haz ingresado un caracter no valido. \nFin del programa.");
		}
		return null;
	}
}
