package arrays;

public class createArray {
	
	int[] array;
	public createArray(int n) {
		array = new int[n];
		
		for(int j=0; j<n;j++) array[j]=j;
	}
	
	public int[] getArray() {
		return array;
	}
}
