package enums;

import java.util.Calendar;

public enum Membership {

	JuniorMember(1),
	StandardMember(6){
		public boolean canBorrow() {
			Calendar date = Calendar.getInstance();
			if(date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || 
					date.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)
				return false;
			
			else return true;
		}
	},
	OAP(Integer.MAX_VALUE);
	
	private int limit;
	private Membership(int num){
		limit = num;
	}
	
	public int borrowLimit() {
		return limit;
	}
	
	public boolean canBorrow() {
		return true;
	}
}
