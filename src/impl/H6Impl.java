package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IH6;
import model.H6;

public class H6Impl implements IH6{

	Scanner sc = new Scanner(System.in);
	H6 h6= new H6();

	@Override
	public H6 create() {
		System.out.println(Mensajes.TAMAÑO_H.getMensaje() + "6): ");
		String h3Text = sc.nextLine();
		String h3Content = "<h6>" + h3Text + "</h6>";
		h6.setTexto(h3Content);
		return h6;
	}


}
