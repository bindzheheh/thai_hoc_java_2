package E_5_5;
/**
 * This is a class Information about the log that has at least one entry
 *@author NguyenVanThai
 *ID:2611130213
 */
public class ConsLog implements ILog {
	/**
	 * properties
	 */
	private Entry first;
	private ILog rest;
	/**
	 * constructor
	 * @param first
	 * @param rest
	 */
	public ConsLog(Entry first, ILog rest) {
		this.first = first;
		this.rest = rest;
	}
	/**
	 * Check whether the given object is a log with the same entries in the same order
	 * @param obj
	 * @return isEqual--(boolean)
	 * Example:
	 * Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", new Time(1, 0));
	 * ILog l1 = new ConsLog(e1, new MTLog());
	 * l1.equals(new ConsLog(e1, new MTLog())) => true
	 * l1.equals(new MTLog()) => false
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsLog)) {
			return false;
		} else {
			ConsLog that = (ConsLog) obj;
			return this.first.equals(that.first)
					&& this.rest.equals(that.rest);
		}
	}
	/**
	 * Convert this log to a String, each entry is between two | and on a new line
	 * @return text--(String)
	 * Example:
	 * Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", new Time(1, 0));
	 * ILog l1 = new ConsLog(e1, new MTLog());
	 * l1.toString() => "|" + e1.toString() + "|\nNone"
	 */
	@Override
	public String toString() {
		return "|" + this.first.toString() + "|\n" + this.rest.toString();
	}
	/**
	 * Compute the total distance of the runs in the given month and year
	 * @param month
	 * @param year
	 * @return totalDistance--(double)
	 * Example:
	 * Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", new Time(1, 0));
	 * Entry e2 = new Entry(new Date(24, 10, 2008), 10, "b", new Time(0, 30));
	 * ILog l2 = new ConsLog(e2, new ConsLog(e1, new MTLog()));
	 * l2.totalDistance(10, 2008) => 10.0
	 * l2.totalDistance(11, 2008) => 0.0
	 */
	@Override
	public double totalDistance(int month, int year) {
		if (this.first.isMonth(month, year)) {
			return this.first.getDistance() + this.rest.totalDistance(month, year);
		} else {
			return this.rest.totalDistance(month, year);
		}
	}
	/**
	 * Compute the maximum distance of a run in this log
	 * @return maxDistance--(double)
	 * Example:
	 * Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", new Time(1, 0));
	 * Entry e2 = new Entry(new Date(24, 10, 2008), 10, "b", new Time(0, 30));
	 * ILog l2 = new ConsLog(e2, new ConsLog(e1, new MTLog()));
	 * l2.maxDistance() => 10.0
	 * new ConsLog(e1, new MTLog()).maxDistance() => 0.0
	 */
	@Override
	public double maxDistance() {
		return Math.max(this.first.getDistance(), this.rest.maxDistance()); 
	}
	/**
	 * Sort this log by speed (distance per minute) from the fastest to the slowest
	 * @return sortedLog--(ILog)
	 * Example:
	 * Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", new Time(1, 0));
	 * Entry e2 = new Entry(new Date(24, 10, 2008), 10, "b", new Time(0, 30));
	 * ILog l = new ConsLog(e1, new ConsLog(e2, new MTLog()));
	 * l.sortByDistanceOnMinute() => new ConsLog(e2, new ConsLog(e1, new MTLog()))
	 */
	@Override
	public ILog sortByDistanceOnMinute() {
		return this.rest.sortByDistanceOnMinute().insertInDistanceOrderOnMinute(this.first);
	}
	/**
	 * Insert the entry into this sorted log, keeping the order from the fastest to the slowest
	 * @param e
	 * @return sortedLog--(ILog)
	 * Example:
	 * Entry e1 = new Entry(new Date(23, 10, 2008), 0, "a", new Time(1, 0));
	 * Entry e2 = new Entry(new Date(24, 10, 2008), 10, "b", new Time(0, 30));
	 * Entry e4 = new Entry(new Date(26, 10, 2008), 15, "d", new Time(0, 30));
	 * ILog l = new ConsLog(e2, new ConsLog(e1, new MTLog()));
	 * l.insertInDistanceOrderOnMinute(e4) => new ConsLog(e4, new ConsLog(e2, new ConsLog(e1, new MTLog())))
	 */
	@Override
	public ILog insertInDistanceOrderOnMinute(Entry e) {
		if (e.hasDistanceOnMinuteLarger(this.first))
			return new ConsLog(e, this);
		else
			return new ConsLog(this.first, this.rest.insertInDistanceOrderOnMinute(e));
	}
}