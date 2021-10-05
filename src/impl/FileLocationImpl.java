package impl;

import java.util.Scanner;

import interfaces.ICreable;
import model.FileLocation;
import model.FileName;

public class FileLocationImpl implements ICreable {

//	/Users/leandrocotarelo/eclipse-workspace/WebCreator
	Scanner sc = new Scanner(System.in);
	FileLocation fileLocation = new FileLocation();
	FileName fileName = new FileNameImpl().create();

	@Override
	public FileLocation create() {
		System.out.println("Donde vas a guardar el archivo?");
		String ruta = sc.nextLine();
		fileLocation.setLocation(ruta + fileName.getFileName());
		return fileLocation;
	}

}
