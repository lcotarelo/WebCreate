package impl;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import enumerators.Mensajes;
import exceptions.CustomException;
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
		try {
			int pagina = sc.nextInt();
			int i;
			for (i = 0; i < pagina; i++) {
				System.out.println(Mensajes.SITE_COMIENZO_DE_PAGINA.getMensaje());
				Page paginaActual = PageMaker.Maker();
				System.out.println(Mensajes.SITE_FIN_DE_PAGINA.getMensaje());
				paginas.add(paginaActual);
			}
			site.setCantidadDePaginas(pagina);
			System.out.println(Mensajes.PROGRAMA_FINALIZADO_EXITO.getMensaje());
			site.setPaginas(paginas);
			return site;

		} catch (InputMismatchException ime) {
			System.out.println(Mensajes.VALOR_INVALIDO.getMensaje());
		} catch (NoSuchElementException ns) {
			System.out.println(Mensajes.CIERRE_POR_EL_USUARIO.getMensaje());
		} catch (Exception e) {
			System.out.println(Mensajes.MENSAJE_ERROR_DEFAULT.getMensaje() + e.getMessage());
		}
		return null;
	}
}
