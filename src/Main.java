import exceptions.CustomException;
import impl.SiteImpl;

public class Main {

	public static void main(String[] args) throws CustomException {
		SiteImpl si = new SiteImpl();
		si.create();
	}

}
