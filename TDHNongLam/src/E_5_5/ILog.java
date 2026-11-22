package E_5_5;
/**
 * This is an interface Information about the runner's log
 *@author NguyenVanThai
 *ID:2611130213
 */
public interface ILog {
	/**
	 * Compute the total distance of the runs in the given month and year
	 * @param month
	 * @param year
	 * @return totalDistance--(double)
	 */
	public double totalDistance(int month, int year);
	/**
	 * Compute the maximum distance of a run in this log (0 if the log is empty)
	 * @return maxDistance--(double)
	 */
	public double maxDistance();
	/**
	 * Sort this log by speed (distance per minute) from the fastest to the slowest
	 * @return sortedLog--(ILog)
	 */
	public ILog sortByDistanceOnMinute();
	/**
	 * Insert the entry into this sorted log, keeping the order from the fastest to the slowest
	 * @param e
	 * @return sortedLog--(ILog)
	 */
	public ILog insertInDistanceOrderOnMinute(Entry e);
}