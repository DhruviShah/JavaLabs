package inheritance;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Dhruvi", new juniorMember());
		Book rb = new ReferenceBook("Kane and Ebel", "Jeffery", 350, 123, 456);
		Book lb = new LoanableBook("Time will tell", "Archer", 230, 112, 122);
		
		Video v = new Video("Sunburn");
		
		p.Borrow(rb);
		p.Borrow(lb);
		p.Borrow(v);
		
		for(int i=0; i<p.books.size(); i++) {
			System.out.println(p.books.get(i));
		}
	}
}
