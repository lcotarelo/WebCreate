package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IFileLocation;
import model.FileLocation;
import model.FileName;

public class FileLocationImpl implements IFileLocation {

	Scanner sc = new Scanner(System.in);

	@Override
	public FileLocation create() {
		FileLocation fileLocation = new FileLocation();
		FileName fileName = new FileNameImpl().create();
		System.out.println(Mensajes.FILELOCATION.getMensaje());
		String ruta = sc.nextLine();
		fileLocation.setLocation(ruta + fileName.getFileName());
		return fileLocation;
	}

}
