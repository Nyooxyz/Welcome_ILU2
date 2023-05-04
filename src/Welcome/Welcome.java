package Welcome;

public class Welcome {
	
	private static final String HELLO = "Hello";
	private static final String FRIEND = "my friend";
	private static final String HELLO2 = "AND HELLO";
	private static final String VIRGULE = ", ";
	private static final String EXCL = " !";
	private static final String POINT = ". ";
	private static final String AND = " and ";
	
	public static String welcome(String input) {

		StringBuilder res = new StringBuilder(HELLO);
		StringBuilder resCaps = new StringBuilder(HELLO2);
		int capsCounter = 0;
		int counter = 0;
		
		if(input == null) {
			res.append(VIRGULE);
			return res.append(FRIEND).toString();
		} 
		
		input = input.trim();
		
		if (input.isEmpty()) {
			res.append(VIRGULE);
			return res.append(FRIEND).toString();
		} 
		
		if (input.equals(input.toUpperCase())) {
			res.append(VIRGULE);
			res.append(input);
			res.append(EXCL);
			return res.toString().toUpperCase();
		} 
		
		if(input.contains(",")) {
			String[] noms = input.split(",");
			
			for (int i = 0; i<noms.length; i++) {
				if(noms[i].equals(noms[i].toUpperCase())) {
					resCaps.append(VIRGULE);
					resCaps.append(noms[i]);
					capsCounter++;
				} else {
					res.append(VIRGULE);
					res.append(Character.toUpperCase(noms[i].charAt(0)));
					res.append(noms[i].substring(1));
					counter++;
				}
			}
			
			if(counter > 0) {
				int lastIndexRes = res.lastIndexOf(VIRGULE);
				
			    res = new StringBuilder(res.toString().substring(0, lastIndexRes) + AND + res.toString().substring(lastIndexRes + 2));
			}
			
			if(capsCounter > 0) {
				if(capsCounter > 1) {
					int lastIndexResCaps = resCaps.lastIndexOf(VIRGULE);
					
				    resCaps = new StringBuilder(resCaps.toString().substring(0, lastIndexResCaps) + AND.toUpperCase() + resCaps.toString().substring(lastIndexResCaps + 2));
				}

			    res.append(POINT);
			    res.append(resCaps.toString());
				return res.append(EXCL).toString();
			}
			
			return res.toString();
		}
		
		res.append(VIRGULE);
		res.append(Character.toUpperCase(input.charAt(0)));
		res.append(input.substring(1));
		return res.toString();
	}
}
