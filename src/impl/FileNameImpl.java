package impl;

import java.util.Scanner;

import interfaces.IFileName;
import model.FileName;

public class FileNameImpl implements IFileName {

	Scanner sc = new Scanner(System.in);
	FileName fileName = new FileName();

//	/Users/leandrocotarelo/eclipse-workspace/WebCreator/
	@Override
	public FileName create() {
		System.out.println("Ingrese el nombre del archivo (Sin la extension)");
		fileName.setFileName(sc.nextLine() + ".html");
		return fileName;
	}

}
