package E_5_5;
/**
 * This is a class Information about the empty log
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MTLog implements ILog {
	/**
	 * Check whether the given object is also an empty log
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * ILog l0 = new MTLog();
	 * l0.equals(new MTLog()) => true
	 * l0.equals(new ConsLog(new Entry(new Date(23, 10, 2008), 0, "a", new Time(1, 0)), l0)) => false
	 */
	@Override
	public boolean equals(Object obj) {
		return obj instanceof MTLog;
	}
	/**
	 * Convert this empty log to a String
	 * @return text--(String)
	 * Example:
	 * ILog l0 = new MTLog();
	 * l0.toString() => "None"
	 */
	@Override
	public String toString() {
		return "None";
	}
	/**
	 * Compute the total distance of the runs in the given month and year (an empty log has none)
	 * @param month
	 * @param year
	 * @return totalDistance--(double)
	 * Example:
	 * ILog l0 = new MTLog();
	 * l0.totalDistance(10, 2008) => 0.0
	 */
	@Override
	public double totalDistance(int month, int year) {
		return 0;
	}
	/**
	 * Compute the maximum distance of this empty log
	 * @return maxDistance--(double)
	 * Example:
	 * ILog l0 = new MTLog();
	 * l0.maxDistance() => 0.0
	 */
	@Override
	public double maxDistance() {
		return 0;
	}
	/**
	 * Sort this empty log (nothing to sort)
	 * @return sortedLog--(ILog)
	 * Example:
	 * ILog l0 = new MTLog();
	 * l0.sortByDistanceOnMinute() => new MTLog()
	 */
	@Override
	public ILog sortByDistanceOnMinute() {
		return new MTLog();
	}
	/**
	 * Insert the entry into this empty log
	 * @param e
	 * @return sortedLog--(ILog)
	 * Example:
	 * Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", new Time(1, 0));
	 * ILog l0 = new MTLog();
	 * l0.insertInDistanceOrderOnMinute(e1) => new ConsLog(e1, new MTLog())
	 */
	@Override
	public ILog insertInDistanceOrderOnMinute(Entry e) {
		return new ConsLog(e, new MTLog());
	}
}