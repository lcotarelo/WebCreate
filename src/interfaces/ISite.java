package interfaces;

import java.util.InputMismatchException;

import model.Site;

public interface ISite {
	Site create() throws InputMismatchException;
}
