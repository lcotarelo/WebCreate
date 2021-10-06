package impl;

import java.util.Scanner;

import model.ContenidoHTML;

public class ContenidoHTMLImpl {

	ContenidoHTML contenidoHTML = new ContenidoHTML();
	Scanner sc = new Scanner(System.in);

	public String create() {
		String cuerpo = "";
		int respuesta = 0;
		while (respuesta != 3) {
			System.out.println("Que queres agregar? " + "\n1- Un parrafo" + "\n2- Una imagen" + "\n3- Terminar");
			respuesta = sc.nextInt();
			switch (respuesta) {
			case 1:
				cuerpo += new ParrafoImpl().create().getContenido();
				break;
			case 2:
				cuerpo += new ImagenImpl().create().getImagenLocation();
				break;
			default:
				System.out.println("Seleccione una opcion valida");
			}
		}

		return cuerpo;
	}

}
