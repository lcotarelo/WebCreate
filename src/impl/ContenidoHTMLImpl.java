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
		while (respuesta != 3) {
			System.out.println(Mensajes.CONTENIDOHTLM.getMensaje());
			respuesta = sc.nextInt();
			
			switch (respuesta) {
			case 1:
				cuerpo += new ParrafoImpl().create().getContenido();
				break;
			case 2:
				cuerpo += new ImagenImpl().create().getImagenLocation();
				break;

			}

		}
		return cuerpo;
	}
}
