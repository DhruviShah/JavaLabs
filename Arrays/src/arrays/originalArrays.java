package arrays;

import java.util.Arrays;

public class originalArrays {
	
	int[] array;
	public originalArrays(int[] arr) {
		array = arr;
	}
	
	public boolean hasDuplicates(int[] arr) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length - 1; i++) {
			if(arr[i+1] == arr[i]) return true;
		}
		return false;
	}
	
	public boolean hasDuplicatesInsertion(int[] arr) {
		insertion(arr);
		for(int i=0; i<arr.length - 1; i++) {
			if(arr[i+1] == arr[i]) return true;
		}
		return false;
	}
	
	public void insertion(int[] arr) {
		int i, key, j;
		for(i=1; i<arr.length; i++) {
			key = arr[i];
			j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j= j-1;
			}
			
			arr[j+1] = key;
		}
	}
}
