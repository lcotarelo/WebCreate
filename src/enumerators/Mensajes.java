package enumerators;

public enum Mensajes {
	CONTENIDOHTLM("Que queres agregar?\n1- Un parrafo\n2- Una imagen\n3- Terminar"),
	FILELOCATION("¿Donde vas a guardar el archivo?"),
	FILENAME("Ingrese el nombre del archivo (Sin la extension)"),
	H1("Ingrese el titulo primario (H1)"),
	IMAGEN("Introduzca la ruta absoluta de la imagen: "),
	PARRAFO("Ingrese el contenido del parrafo: "),
	SITE_CANTIDAD_DE_PAGINAS("¿Cuantas paginas queres?"),
	SITE_COMIENZO_DE_PAGINA("Comienzo de la pagina "),
	SITE_FIN_DE_PAGINA("Fin de pagina ")
	;

	private final String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	private Mensajes(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
