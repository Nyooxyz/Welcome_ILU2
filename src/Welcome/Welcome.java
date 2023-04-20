package Welcome;

public class Welcome {
	
	private static final String HELLO = "Hello, ";
	private static final String FRIEND = "my friend";

	
	public static String welcome(String input) {

		StringBuilder res = new StringBuilder();
		res.append(HELLO);
		
		if(input == null) {
			res.append(FRIEND);
			return res.toString();
		} 
		
		input = input.trim();
		
		if (input.isEmpty()) {
			res.append(FRIEND);
		} else {
			res.append(Character.toUpperCase(input.charAt(0)));
			res.append(input.substring(1));
		}
	
		return res.toString();
	}
}
