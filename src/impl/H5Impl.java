package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IH5;
import model.H5;

public class H5Impl implements IH5{
	Scanner sc = new Scanner(System.in);
	H5 h5 = new H5();

	@Override
	public H5 create() {
		System.out.println(Mensajes.TAMAÑO_H.getMensaje() + "5): ");
		String h5Text = sc.nextLine();
		String h5Content = "<h5>" + h5Text + "</h5>";
		h5.setTexto(h5Content);
		return h5;
	}

}
