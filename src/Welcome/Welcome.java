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
		
		if(input.contains(",")) {
			String[] noms = input.split(",");
			
			for (int i = 0; i<noms.length; i++) {
				res.append(Character.toUpperCase(noms[i].charAt(0)));
				res.append(noms[i].substring(1));
				res.append(", ");
			}
	
			return res.substring(0, res.length() - 2);
		}
		
		res.append(Character.toUpperCase(input.charAt(0)));
		res.append(input.substring(1));
		return res.toString();
	}
}
