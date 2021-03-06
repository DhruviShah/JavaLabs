package inheritance;

import java.util.Date;

public class Loan {

	private Book book;
	private Person person;
	private Date date;
	
	public Loan(Book book, Person person) {
		super();
		this.book = book;
		this.person = person;
		this.date = new Date();
	}

	@Override
	public String toString() {
		return "Loan [book=" + book.toString() + ", person=" + person.toString() + ", date=" + date.toString()
				+ "]";
	}
	
}
