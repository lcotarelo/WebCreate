package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IH4;
import model.H4;

public class H4Impl implements IH4{

	Scanner sc = new Scanner(System.in);
	H4 h4 = new H4();

	@Override
	public H4 create() {
		System.out.println(Mensajes.TAMAÑO_H.getMensaje() + "4): ");
		String h4Text = sc.nextLine();
		String h4Content = "<h4>" + h4Text + "</h4>";
		h4.setTexto(h4Content);
		return h4;
	}

}
