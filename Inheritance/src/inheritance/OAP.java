package inheritance;

import java.util.Calendar;

public class OAP extends Membership{

	public OAP() {
		super("Old Age Member");
	}
	
	@Override
	public int borrowLimit() {
		return Integer.MAX_VALUE;
	}
	
	@Override
	public boolean canBorrow() {
		Calendar date = Calendar.getInstance();
		if(date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || 
				date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
			return false;
		
		else return true;
	}

	@Override
	public int borrowVideoLimit() {
		// TODO Auto-generated method stub
		return 1;
	}

}
