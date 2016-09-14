package inheritance;

public class ReferenceBook extends Book{

	private boolean isLoanable = false;
	
	public ReferenceBook(String title, String author, double price,
			int categoryNo, int subcategoryNo) {
		super(title, author, price, categoryNo, subcategoryNo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean canLoan() {
		return isLoanable;
	}

	@Override
	public String toString(){
		return "Book [title=" + title + ", author=" + author + ", price="
				+ price + ", Classification Code=" + categoryNo + "." + subcategoryNo + "]" + "This book is a reference book and is not loanable.";
	}
}
