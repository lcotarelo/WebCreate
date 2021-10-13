package impl;

import java.util.Scanner;

import enumerators.Mensajes;
import interfaces.IALink;
import model.ALink;

public class ALinkImpl implements IALink {

	Scanner sc = new Scanner(System.in);
	ALink alink = new ALink();

	@Override
	public ALink create() {
		System.out.println(Mensajes.LINK.getMensaje());
		String aText = sc.nextLine();
		System.out.println(Mensajes.LINK_VISUAL.getMensaje());
		String nombreVisual = sc.nextLine();
		String aContent = "<a href='https://" + aText + "'>" + nombreVisual + "</a>";
		alink.setLink(aContent);
		return alink;
	}

}
