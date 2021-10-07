package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IImagen;
import model.Imagen;

public class ImagenImpl implements IImagen {

	Scanner sc = new Scanner(System.in);
	Imagen img = new Imagen();

	@Override
	public Imagen create() {
		System.out.println(Mensajes.IMAGEN.getMensaje());
		String imagenUrl = "<img src="+sc.nextLine()+" style='width:200px; height: auto'; >";
		img.setImagenLocation(imagenUrl);
		return img;
	}

}
