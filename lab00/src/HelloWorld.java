import objectdraw.*;

public class HelloWorld extends WindowController {

	private String yourName = "rwoll";

	public void begin() {
		new Text("Hello, " + yourName, 10, 10, canvas);
	}
}