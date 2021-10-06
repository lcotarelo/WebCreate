package impl;

import java.util.Scanner;

import interfaces.IParrafo;
import model.Parrafo;

public class ParrafoImpl implements IParrafo {

	Scanner sc = new Scanner(System.in);
	Parrafo parrafo = new Parrafo();

	@Override
	public Parrafo create() {
		System.out.println("Ingrese el contenido del parrafo: ");
		String contenido = "<p>"+sc.nextLine()+"</p>";
		parrafo.setContenido(contenido);
		return parrafo;
	}

}
