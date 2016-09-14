package inheritance;

public abstract class Book {
	
	String title;
	String author;
	double price;
	int categoryNo;
	int subcategoryNo;
	
	public Book(String title, String author, double price, int categoryNo,
			int subcategoryNo) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.categoryNo = categoryNo;
		this.subcategoryNo = subcategoryNo;
	}

	@Override
	public abstract String toString();
	
	public abstract boolean canLoan();
}
