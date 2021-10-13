package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import model.ContenidoHTML;

public class ContenidoHTMLImpl {

	ContenidoHTML contenidoHTML = new ContenidoHTML();
	Scanner sc = new Scanner(System.in);

	public String create() {
		String cuerpo = "";
		int respuesta = 0;
		int salida = 9;
		while (respuesta != salida) {
			System.out.println(Mensajes.CONTENIDOHTLM.getMensaje());
			respuesta = sc.nextInt();
			switch (respuesta) {
			case 1:
				cuerpo += new ParrafoImpl().create().getContenido();
				break;
			case 2:
				cuerpo += new ImagenImpl().create().getImagenLocation();
				break;
			case 3:
				cuerpo += new H2Impl().create().getTexto();
				break;
			case 4:
				cuerpo += new H3Impl().create().getTexto();
				break;
			case 5:
				cuerpo += new H4Impl().create().getTexto();
				break;
			case 6:
				cuerpo += new H5Impl().create().getTexto();
				break;
			case 7:
				cuerpo += new H6Impl().create().getTexto();
				break;
			case 8:
				cuerpo += new ALinkImpl().create().getLink();
				break;
			}

		}
		return cuerpo;
	}
}
