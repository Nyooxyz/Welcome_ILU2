package Welcome;

public class Welcome {
	
	private static final String HELLO = "Hello, ";

	
	public static String welcome(String input) {

		StringBuilder res = new StringBuilder();
		res.append(HELLO);
		res.append(Character.toUpperCase(input.charAt(0)));
		res.append(input.substring(1));
		return res.toString();
	}
}
