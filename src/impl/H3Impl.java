package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IH3;
import model.H3;

public class H3Impl implements IH3 {

	Scanner sc = new Scanner(System.in);
	H3 h3 = new H3();

	@Override
	public H3 create() {
		System.out.println(Mensajes.TAMAÑO_H.getMensaje() + "3): ");
		String h3Text = sc.nextLine();
		String h3Content = "<h3>" + h3Text + "</h3>";
		h3.setTexto(h3Content);
		return h3;
	}

}
