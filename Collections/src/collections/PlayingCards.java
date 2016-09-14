package collections;

public class PlayingCards implements Comparable<PlayingCards>{

	Suite suite;
	CardValue value;
	
	public PlayingCards(Suite suite, CardValue value) {
		super();
		this.suite = suite;
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((suite == null) ? 0 : suite.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayingCards other = (PlayingCards) obj;
//		if (suite != other.suite)
//			return false;
		if (value != other.value)
			return false;
		return true;
	}


	@Override
	public int compareTo(PlayingCards arg0) {
		
		if(this.value == arg0.value)
			return this.suite.compareTo(arg0.suite); 
		else
			return this.value.compareTo(arg0.value);
	}
	
}
