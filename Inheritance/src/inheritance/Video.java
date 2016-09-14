package inheritance;

public class Video implements Loanable{
	
	String name;
	
	public Video(String _name) {
		name = _name;
	}
	@Override
	public boolean canLoan() {
		// TODO Auto-generated method stub
		return true;
	}

}
