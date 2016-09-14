package objects.classes;

public class StringBuilder_Main {
	
	StringBuilder str = new StringBuilder("The quick brown fox jumps over the lazy dog.");
	
	public int subStrExist(StringBuilder s1, String s2) {
		
		if(s1.indexOf(s2) != -1) {
			s1.replace(s1.indexOf(s2), s1.indexOf(s2) + s2.length(), s2.toUpperCase());
			System.out.println(s1);
			return 1;
		} 
		return 0;
	}
}
