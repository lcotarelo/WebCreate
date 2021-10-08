package enumerators;

public enum Mensajes {
	CONTENIDOHTLM("Que queres agregar?\n1- Un parrafo\n2- Una imagen\n3- Terminar"),
	FILE_LOCATION("¿Donde vas a guardar el archivo?. "), 
	FILE_NAME("Ingrese el nombre del archivo (Sin la extension): "),
	H1("Ingrese el titulo primario (H1): "), 
	IMAGEN("Introduzca la ruta absoluta de la imagen: "),
	PARRAFO("Ingrese el contenido del parrafo: "), 
	SITE_CANTIDAD_DE_PAGINAS("¿Cuantas paginas queres?"),
	SITE_COMIENZO_DE_PAGINA("Comienzo de la pagina "), 
	SITE_FIN_DE_PAGINA("¡Pagina creada con exito!"),
	FILE_NAME_EXTENSION(".html"),
	PROGRAMA_FINALIZADO_EXITO("El proceso acabo con exito"),
//	Valores utilizados para comunicar excepciones
	VALOR_INVALIDO("Se ha introducido un valor no valido. Fin del programa."),
	CIERRE_POR_EL_USUARIO("Has cerrado el programa. No se guardan cambios."),
	ARCHIVO_NO_GENERADO("Ha ocurrido un problema. El archivo no fue generado."),
	MENSAJE_ERROR_DEFAULT("Se ha producido un error inesperado. Se cierra el programa.\n ");

	private final String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	private Mensajes(String mensaje) {
		this.mensaje = mensaje;
	}

}
