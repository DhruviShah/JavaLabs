package objects.classes;

public class Book {
	private String title;
	private String author;
	private double price;
	private int categoryNo;
	private int subcategoryNo;
	
	public Book(String title, String author, double price, int categoryNo,
			int subcategoryNo) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.categoryNo = categoryNo;
		this.subcategoryNo = subcategoryNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public int getSubcategoryNo() {
		return subcategoryNo;
	}

	public void setSubcategoryNo(int subcategoryNo) {
		this.subcategoryNo = subcategoryNo;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price="
				+ price + ", Classification Code=" + categoryNo + "." + subcategoryNo + "]";
	}
	
	
}
