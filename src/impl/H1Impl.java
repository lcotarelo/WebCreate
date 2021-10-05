package impl;

import java.util.Scanner;

import interfaces.ICreable;
import model.H1;

public class H1Impl implements ICreable {

	Scanner sc = new Scanner(System.in);
	H1 h1 = new H1();

	@Override
	public H1 create() {
		System.out.println("Ingrese el titulo primario (H1)");
		String h1Text = sc.nextLine();
		String h1Content = "<h1>" + h1Text + "</h1>";
		h1.setTexto(h1Content);
		return h1;
	}

}
