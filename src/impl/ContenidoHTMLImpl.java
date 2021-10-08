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
		int salida = 5;
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
				cuerpo += new IH2Impl().create().getTexto();
				break;
			case 4:
				cuerpo += new IH3Impl().create().getTexto();
				break;

			}

		}
		return cuerpo;
	}
}
