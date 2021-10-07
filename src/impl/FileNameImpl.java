package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IFileName;
import model.FileName;

public class FileNameImpl implements IFileName {

	Scanner sc = new Scanner(System.in);
	FileName fileName = new FileName();

	@Override
	public FileName create() {
		System.out.println(Mensajes.FILENAME.getMensaje());
		fileName.setFileName(sc.nextLine() + ".html");
		return fileName;
	}

}
