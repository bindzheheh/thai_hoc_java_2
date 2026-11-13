package chap2;

public class ConsLog implements ILog {
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
	public double totalDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
