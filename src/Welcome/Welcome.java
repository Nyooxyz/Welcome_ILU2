package Welcome;

public class Welcome {
	
	private static final String HELLO = "Hello, ";

	
	public static String welcome(String input) {
		StringBuilder res = new StringBuilder();
		res.append(HELLO);
		if (input.equals("bob")) {
			res.append("Bob");
		}
		return res.toString();
	}
}
