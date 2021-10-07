package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IH1;
import model.H1;

public class H1Impl implements IH1 {

	Scanner sc = new Scanner(System.in);
	H1 h1 = new H1();

	@Override
	public H1 create() {
		System.out.println(Mensajes.H1.getMensaje());
		String h1Text = sc.nextLine();
		String h1Content = "<h1>" + h1Text + "</h1>";
		h1.setTexto(h1Content);
		return h1;
	}

}
