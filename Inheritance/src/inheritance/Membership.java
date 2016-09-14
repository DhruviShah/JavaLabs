package inheritance;

public abstract class Membership {
	
	private String Member;
	public Membership(String m) {
		super();
		Member = m;
	}
	
	public abstract int borrowLimit();
	public abstract int borrowVideoLimit();
	
	public boolean canBorrow(){
		return true;
	}
	
	public String memberCategory() {
		return Member;
	}
}
