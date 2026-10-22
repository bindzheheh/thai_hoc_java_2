package E_2_2;
/**
 * This is a class for calculating the profit of a movie theater.
 *@author NguyenVanThai
 *ID:2611130213
 */
public class MovieTheater {
	/**
	 * properties
	 */
	private double ticket;
	private double showCost;
	private double service;
	/**
	 * constructer
	 * dung de thay doi gia ve,chi phi co dinh,dich vu
	 */
	public MovieTheater(double ticket,double showCost,double service) {
		this.ticket=ticket;
		this.showCost=showCost;
		this.service=service;
	}
	/**
	 * method
	 */
	/**
	 * This is the method used to calculate revenue.
	 * @param numberPeople
	 * @return revenue ----(double)
	 * Example:
	 * MovieTheater mt1 = new MovieTheater(5,20,0.5)
	 * MovieTheater mt2 = new MovieTheater(10,50,1)
	 * mt1.revenue(40) => 200
	 * mt2.revenue(35)=>350
	 */
	double revenue(int numberPeople) {
		return this.ticket*numberPeople;
	}
	/**
	 * This is the method used to calculate the costs incurred by a movie theater.
	 * @param numberPeople
	 * @return cost---(double)
	 * Example:
	 * MovieTheater mt1 = new MovieTheater(5,20,0.5);
	 * MovieTheater mt2 = new MovieTheater(10,50,1);
	 * mt1.cost(40) =>40
	 * mt2.cost(35)=>85
	 */
	double cost(int numberPeople) {
		return this.showCost+numberPeople*this.service;
	}
	/**
	 * This is the method used to calculate profit.
	 * @param numberPeople
	 * @return totalProfit---(double)
	 * Example:
	 * MovieTheater mt1 = new MovieTheater(5,20,0.5);
	 * MovieTheater mt2 = new MovieTheater(10,50,1);
	 * mt1.totalProfit(40) =>160
	 * mt2.totalProfit(35) =>265
	 */
	double totalProfit(int numberPeople) {
		return this.revenue(numberPeople)-this.cost(numberPeople);
	}

}
