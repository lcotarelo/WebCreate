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
		
		System.out.println(Mensajes.FILE_NAME.getMensaje());
		fileName.setFileName(sc.nextLine() + Mensajes.FILE_NAME_EXTENSION.getMensaje());
		return fileName;
	}

}
