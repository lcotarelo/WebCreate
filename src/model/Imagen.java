package model;

public class Imagen {

	private String imagenLocation;

//	"/Users/leandrocotarelo/Desktop/F1538D17-4A5B-42B6-AA59-1AD5158F3EDF.jpeg";

	public Imagen() {
	}

	public Imagen(String imagenLocation) {
		this.imagenLocation = imagenLocation;
	}

	public String getImagenLocation() {
		return imagenLocation;
	}

	public void setImagenLocation(String imagenLocation) {
		this.imagenLocation = imagenLocation;
	}

}
