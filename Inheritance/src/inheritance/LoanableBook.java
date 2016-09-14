package inheritance;

public class LoanableBook extends Book implements Loanable{

	private boolean isLoanable = true;
	
	public LoanableBook(String title, String author, double price,
			int categoryNo, int subcategoryNo) {
		super(title, author, price, categoryNo, subcategoryNo);
	}

	@Override
	public boolean canLoan() {
		return isLoanable;
	}
	
	@Override
	public String toString(){
		return "Book [title=" + title + ", author=" + author + ", price="
				+ price + ", Classification Code=" + categoryNo + "." + subcategoryNo + "]" + "This book is loanable.";
	}
	
}
