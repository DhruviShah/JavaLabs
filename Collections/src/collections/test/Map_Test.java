package collections.test;

import static org.junit.Assert.*;
import inheritance.Book;
import inheritance.LoanableBook;
import inheritance.ReferenceBook;

import org.junit.Test;

import collections.Book_Map;

public class Map_Test {

	@Test
	public void testMap() {
		Book_Map map = new Book_Map();
		Book rb = new ReferenceBook("Endless Night", "Agatha Christie", 345.0, 121, 234);
		Book lb = new LoanableBook("Hercule Poirot", "Agatha Christie", 315.0, 120, 231);
		
		map.addStock(rb, 5);
		map.addStock(lb, 6);
		map.takeLoan(rb);
		map.takeLoan(lb);
		map.addStock(lb, 4);
		
		assertEquals((int)map.Stock.get(lb), 10);
		assertEquals((int)map.availableForLoan.get(lb), 9);
	}
}
