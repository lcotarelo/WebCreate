package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IParrafo;
import model.Parrafo;

public class ParrafoImpl implements IParrafo {

	Scanner sc = new Scanner(System.in);
	Parrafo parrafo = new Parrafo();

	@Override
	public Parrafo create() {
		System.out.println(Mensajes.PARRAFO.getMensaje());
		String contenido = "<p>"+sc.nextLine()+"</p>";
		parrafo.setContenido(contenido);
		return parrafo;
	}

}
