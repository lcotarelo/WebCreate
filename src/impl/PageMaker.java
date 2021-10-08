package impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import enumerators.Mensajes;
import model.Page;

public class PageMaker {

	public static Page Maker() {
		Page page = new PageImpl().create();
	//	/Users/leandrocotarelo/git/WebCreator/
		try {
			String fileName = page.getFileLocation().getLocation();
			String content = page.getBody().toString();
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			} 
		catch (Exception e) {
			System.out.println(Mensajes.ARCHIVO_NO_GENERADO);
			e.printStackTrace();
		}
		return page;
	}

}
