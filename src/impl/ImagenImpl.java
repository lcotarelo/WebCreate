package impl;

import java.util.Scanner;

import interfaces.ICreable;
import model.Imagen;

public class ImagenImpl implements ICreable {

	Scanner sc = new Scanner(System.in);
	Imagen img = new Imagen();
//	/Users/leandrocotarelo/Desktop/img.jpeg
//	/Users/leandrocotarelo/eclipse-workspace/WebCreator/

	@Override
	public Imagen create() {
		System.out.println("Introduzca la ruta absoluta de la imagen: ");
		String location = "<img src="+sc.nextLine()+" style='width:200px; height: auto'; >";
		img.setImagenLocation(location);
		return img;
	}

}
