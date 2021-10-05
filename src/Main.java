import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PageMaker hi = new PageMaker();
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas paginas queres");
		int paginas = sc.nextInt();
		int i;
		for (i = 0; i < paginas; i++) {
			System.out.println("Comienzo de la pagina " + (i + 1));
			hi.Maker();
			System.out.println("Fin de pagina " + (i + 1));
		}
//		/Users/leandrocotarelo/eclipse-workspace/WebCreator
	}

}
