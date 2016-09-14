package objects.classes;

import java.lang.String;

public class String_Main {

	String str = "The quick brown fox jumps over the lazy dog.";
	
	public int subStrExist(String s1, String s2) {
		if(s1.contains(s2)) {
			return s1.indexOf(s2);
		} else {
			return -1;
		}
	}
	
}
