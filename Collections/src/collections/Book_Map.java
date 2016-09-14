package collections;

import java.util.HashMap;
import java.util.Map;
import inheritance.Book;

public class Book_Map {
	public Map<Book, Integer> Stock = new HashMap<Book, Integer>();
	public Map<Book, Integer> availableForLoan = new HashMap<Book, Integer>();
	
	public void addStock(Book b, int n) {
		if(Stock.containsKey(b)) {
			Stock.put(b, Stock.get(b) + n);
			if(b.canLoan()) {
				availableForLoan.put(b, availableForLoan.get(b) + n);
			} else {
				System.out.println("This book cannot be loaned");
			}
			
		} else {
			Stock.put(b, n);
			if(b.canLoan()) {
				availableForLoan.put(b, n);
			}
		}
	}
	
	public void takeLoan(Book b) {
		if(availableForLoan.containsKey(b) && availableForLoan.get(b) > 0){
			availableForLoan.put(b, availableForLoan.get(b) - 1);
		} else {
			System.out.println("Book cannot be loaned or all the books have been loaned");
		}
	}
}
