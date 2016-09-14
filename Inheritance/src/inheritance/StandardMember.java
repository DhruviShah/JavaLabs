package inheritance;

public class StandardMember extends Membership{

	public StandardMember() {
		super("Standard Member");
		// TODO Auto-generated constructor stub
	}

	@Override
	public int borrowLimit() {
		return 6;
	}
	
	@Override
	public int borrowVideoLimit() {
		// TODO Auto-generated method stub
		return 1;
	}

}
