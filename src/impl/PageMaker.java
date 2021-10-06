package impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import impl.PageImpl;
import model.Page;

public class PageMaker {

	public static Page Maker() {
		Page page = new PageImpl().create();

		try {
			String fileName = page.getFileLocation().getLocation();
			String route = page.getFileLocation().toString();
			String content = page.getBody().toString();
			File file = new File(route);
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return page;
	}

}
