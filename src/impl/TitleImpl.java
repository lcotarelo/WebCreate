package impl;

import java.util.Scanner;

import interfaces.ITitle;
import model.Title;

public class TitleImpl implements ITitle {

	Scanner sc = new Scanner(System.in);
	String headTag;
	Title title = new Title();

	@Override
	public Title create() {
		System.out.println("Que vas a escribir en el tag 'title'?");
		String titulo = sc.nextLine();
		String headTag = "<head><title>" + titulo + "</title></head>";
		title.setTitle(headTag);
		return title;
	}

}
