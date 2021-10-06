package impl;

import java.util.Scanner;

import interfaces.IImagen;
import model.Imagen;

public class ImagenImpl implements IImagen {

	Scanner sc = new Scanner(System.in);
	Imagen img = new Imagen();

	@Override
	public Imagen create() {
		System.out.println("Introduzca la ruta absoluta de la imagen: ");
		String location = "<img src="+sc.nextLine()+" style='width:200px; height: auto'; >";
		img.setImagenLocation(location);
		return img;
	}

}
