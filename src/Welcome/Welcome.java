package Welcome;

public class Welcome {
	
	private static final String HELLO = "Hello, ";
	private static final String FRIEND = "my friend";

	
	public static String welcome(String input) {

		StringBuilder res = new StringBuilder(HELLO);
		
		if(input == null) {
			return res.append(FRIEND).toString();
		} 
		
		input = input.trim();
		
		if (input.isEmpty()) {
			return res.append(FRIEND).toString();
		} 
		
		if (input.equals(input.toUpperCase())) {
			res.append(input);
			res.append(" !");
			return res.toString().toUpperCase();
		} 
		
		res.append(Character.toUpperCase(input.charAt(0)));
		res.append(input.substring(1));
		return res.toString();
	}
}
