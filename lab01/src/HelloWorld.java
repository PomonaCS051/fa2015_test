import objectdraw.*;

public class HelloWorld extends WindowController {

	private String yourName = "<YourNameHere>";

	public void begin() {
		new Text("Hello, " + yourName, 10, 10, canvas);
	}
}
