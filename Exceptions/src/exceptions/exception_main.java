package exceptions;

public class exception_main {

	public static void main(String[] main) {
		int[] arr = {3, 4, 6};
		
		try {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i+1] == arr[i]) System.out.println(arr[i]);
			}
			
			int i = 0;
			int j = 5;
			int k = j/i;
			
		} catch(Exception ex){
			System.out.println("Exception occured....  " + ex);
		}
	}
}
