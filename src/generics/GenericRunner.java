package generics;

import java.util.List;

public class GenericRunner {

	public GenericRunner() {

	}
	// TODO: Buscar donde usarlo
	public static <E> void runner(List<E> lista) {
		for (E elemento : lista)
			System.out.println(elemento);
		
	}
	
}
