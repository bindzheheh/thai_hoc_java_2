package chap5;

public class MTLog implements ILog {
	public MTLog() {
		
	}
	

	@Override
	// MTLog: mọi MTLog đều bằng nhau
	public boolean equals(Object obj) {
		return obj instanceof MTLog;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "None";
	}


	@Override
	public double totalDistance() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double totalEvenDayDistance() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public double totalDistanceInMonth(int month,int year) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public ILog LogHistory(int month, int year) {
		// TODO Auto-generated method stub
		return new MTLog();
	}


	@Override
	public String LogHistoryComment(int month, int year) {
		// TODO Auto-generated method stub
		return "";
	}


	@Override
	public ILog isDuration(int numOfTime) {
		// TODO Auto-generated method stub
		return new MTLog();
	}


	


	


	
	

}
