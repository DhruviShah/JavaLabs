package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private Membership member;
	List<Book> books = new ArrayList<>();
	List<Video> video = new ArrayList<>();
	
	public Person(String name, Membership m) {
		super();
		this.name = name;
		this.member = m;
	}

	public Membership getmember() {
		return member;
	}

	public void setmember(Membership member) {
		this.member = member;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "member of person is" + member.memberCategory() + "]";
	}
	
	public void Borrow(Book b) {
		if(isBorrowingAllowed() && b.canLoan())
			books.add(b);
		else
			System.out.println("Cannot borrow book");
	}
	
	public void Borrow(Video v) {
		if(member.borrowVideoLimit() > video.size())
			video.add(v);
		else
			System.out.println("Cannot borrow video");
	}
	private boolean isBorrowingAllowed() {
		if(member.borrowLimit() > books.size() && member.canBorrow()) return true;
		else return false;
	}
}
