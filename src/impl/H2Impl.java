package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IH2;
import model.H2;

public class H2Impl implements IH2 {

	Scanner sc = new Scanner(System.in);
	H2 h2 = new H2();

	@Override
	public H2 create() {
		System.out.println(Mensajes.TAMAÑO_H.getMensaje() + "2): ");
		String h2Text = sc.nextLine();
		String h2Content = "<h2>" + h2Text + "</h2>";
		h2.setTexto(h2Content);
		return h2;
	}
}
