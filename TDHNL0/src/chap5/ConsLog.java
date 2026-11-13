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
		if (obj == null || !(obj instanceof ConsLog)) {
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

	@Override
	public double totalDistance() {
		// TODO Auto-generated method stub
		return this.first.getdistance()+this.rest.totalDistance();
	}

	@Override
	public double totalEvenDayDistance() {
		// TODO Auto-generated method stub
		if (this.first.isEvenDay()) 
			return this.first.getdistance()+this.rest.totalEvenDayDistance();
		else {
			return this.rest.totalEvenDayDistance();
		}
		
	}

	@Override
	public double totalDistanceInMonth(int month,int year) {
		// TODO Auto-generated method stub
		if (this.first.isMonth(month,year))
			return this.first.getdistance()+this.rest.totalDistanceInMonth(month,year);
		else {
			return this.rest.totalDistanceInMonth(month,year);
			}
		}

	

	@Override
	public ILog LogHistory(int month, int year) {
		// TODO Auto-generated method stub
				if (this.first.isMonth(month, year))
					return new ConsLog(first, rest.LogHistory(month, year));
				else {
					return this.rest.LogHistory(month, year);
				}
			}

	@Override
	public String LogHistoryComment(int month, int year) {
		if (this.first.isMonth(month,year))
			return this.first.getComment(month, year)+this.rest.LogHistoryComment(month,year);
		else {
			return this.rest.LogHistoryComment(month,year);
			}
	}

	@Override
	public ILog isDuration(int numOfTime) {
		// TODO Auto-generated method stub
		if (this.first.rightDuration(numOfTime))
			return new ConsLog(first, rest.isDuration(numOfTime));
		else {
			return this.rest.isDuration(numOfTime);
		}
	}

	
	}

	
	
	


