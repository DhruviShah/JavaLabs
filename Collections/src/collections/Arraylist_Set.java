package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Arraylist_Set {

	public static void sortedArrayList(int[] arr) {
		List<Integer> al = new ArrayList<>();
		
		for(int i=0; i<6; i++) {
			if(al.isEmpty()) al.add(arr[i]);
			else if(al.contains(arr[i])){
				System.out.println("Duplicate Entry");
				break;
			} else al.add(arr[i]);
		}
		
		int i, key, j;
		for(i=1; i<al.size(); i++) {
			key = al.get(i);
			j=i-1;
			
			while(j>=0 && al.get(j)>key) {
				al.set(j+1, al.get(j));
				//arr[j+1] = arr[j];
				j= j-1;
			}
			
			al.set(j+1, key);
		}
		
		for(i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
	
	public static void sortedSet(int[] arr) {
		Set<Integer> al = new TreeSet<Integer>();
		for(int i=0; i<6; i++) {
			al.add(arr[i]);
		}
		
		Iterator<Integer> it  = al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 45, 7, 6, 21, 23};
		
		System.out.println("Sorted array using arraylist");
		sortedArrayList(arr);
		
		System.out.println("Sorted array using treeset");
		sortedSet(arr);
	}
}
