package inheritance;

public class juniorMember extends Membership{
	
	private String Member;
	public juniorMember() {
		super("Junior Member");
	}
	
	@Override
	public int borrowLimit() {
		return 1;
	}

	@Override
	public String memberCategory() {
		// TODO Auto-generated method stub
		return Member;
	}

	@Override
	public int borrowVideoLimit() {
		// TODO Auto-generated method stub
		return 0;
	}
}
