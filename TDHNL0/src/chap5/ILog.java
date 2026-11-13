package chap5;

public interface ILog {
	public double totalDistance();
	public double totalEvenDayDistance();
	public double totalDistanceInMonth(int month,int year);
	public String LogHistoryComment(int month,int year);
	public ILog LogHistory(int month,int year);
	public ILog isDuration(int numOfTime);

}

