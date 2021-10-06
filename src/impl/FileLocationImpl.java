package impl;

import java.util.Scanner;

import interfaces.IFileLocation;
import model.FileLocation;
import model.FileName;

public class FileLocationImpl implements IFileLocation {

//	/Users/leandrocotarelo/eclipse-workspace/WebCreator
	Scanner sc = new Scanner(System.in);

	@Override
	public FileLocation create() {
		FileLocation fileLocation = new FileLocation();
		FileName fileName = new FileNameImpl().create();
		System.out.println("Donde vas a guardar el archivo?");
		String ruta = sc.nextLine();
		fileLocation.setLocation(ruta + fileName.getFileName());
		return fileLocation;
	}

}
