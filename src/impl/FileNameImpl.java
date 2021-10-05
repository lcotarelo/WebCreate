package impl;

import java.util.Scanner;

import interfaces.ICreable;
import model.FileName;

public class FileNameImpl implements ICreable{

	Scanner sc = new Scanner(System.in);
	FileName fileName = new FileName();
	
//	/Users/leandrocotarelo/eclipse-workspace/WebCreator/
	@Override
	public FileName create() {
		System.out.println("Ingrese el nombre del archivo (Sin la extension)");
		fileName.setFileName(sc.nextLine()+".html");
		System.out.println("file name: "+fileName.getFileName());
		return fileName;
	}

}
