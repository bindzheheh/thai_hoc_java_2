package chap5;

public class ConsLog implements ILog {
	/**
	 * properties
	 */
	private Entry first;
	private ILog rest;
	/**
	 * @param first
	 * @param rest
	 */
	public ConsLog(Entry first, ILog rest) {
		this.first = first;
		this.rest = rest;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null || (obj instanceof ConsLog)) {
			return false;
		}
		else {
			ConsLog that = (ConsLog) obj;
				return (this.first.equals(that.first)
						&&this.rest.equals(that.rest));
						
			}
		}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "|"+this.first.toString()+"|\n"+this.rest.toString();
	}
	
	

}
