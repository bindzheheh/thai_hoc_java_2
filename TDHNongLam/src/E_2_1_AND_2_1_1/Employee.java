package E_2_1_AND_2_1_1;
/**
 * This is a class that stores information and working hours for employees.
 *@author NguyenVanThai
 *ID:2611130213
 */
public class Employee {
	/**
	 * properties
	 */
	String name;
	int hours;
	/**
	 * constructor
	 */
	public Employee(String name,int hours) {
		this.name=name;
		this.hours=hours;
	}
	/**
	 * methods
	 */
	/**
	 * This method is used to check the hourly wage.
	 * return wage(int)
	 * Example:
	 * assertEquals(new Employee("Nam", 20).wage(), 240) =>true
	 * Employee aEmployee1 = new Employee("Mai", 30);
	 * assertEquals(aEmployee1.wage(),360)
	 * =>true
	 */
	int wage () {
		return(this.hours*12);
	}
	/**
	 * Determines the tax of an employee from the wage
	 * return tax(doblue)
	 * Example:
	 * assertEquals(new Employee("Nam", 40).tax(), 72.0, 0.001) =>true
	 * Employee aEmployee1 = new Employee("Mai", 30)
	 * assertEquals(aEmployee1.tax(),54.0, 0.001) =>true
	 */
	
	double tax() {
		return(this.wage()*0.15);
	}
	/**
	 * This method is used to check the netpay.
	 * @return netpay--(double)
	 * Example:
	 * assertEquals(new Employee("Nam",40).netpay(),408.0, 0.001)=>true
	 * Employee aEmployee1 = new Employee("Mai", 30)
	 * assertEquals(aEmployee1.netpay(), 306.0, 0.01) =>true
	 */
	double netpay() {
		return(this.wage()-this.tax());
	}
	/**
	 * This method is used to check the raise wage.
	 * @return raisedWage--(double)
	 * Example:
	 * Employee aEmployee1 = new Employee("Mai", 30)
	 * Employee aEmployee2 = new Employee("Minh", 102)
	 * assertEquals(aEmployee1.raisedWage(), 374.0, 0.001) =>true
	 * assertEquals(aEmployee2.raisedWage(), 1238.0, 0.001) =>true
	 */
	double raisedWage() {
		return(this.wage()+14);
	}
	/**
	 * This method is used to check the number of working hours per week.
	 * return checkOverTime--(boolean)
	 * Example:
	 * Employee aEmployee1 = new Employee("Mai", 30)
	 * Employee aEmployee2 = new Employee("Minh", 102)
	 * assertTrue(aEmployee1.checkOverTime()) =>false
	 * assertTrue(aEmployee2.checkOverTime()) =>true
	 * assertFalse(aEmployee1.checkOverTime()) =>true
	 */
	boolean checkOverTime() {
		return(this.hours>100);
	}
	/**
	 * this method to check tax, which consumes the gross pay and produces the amount of tax owed.
	 * @return taxWithRate--(double)
	 * Example:
	 * assertEquals(new Employee("Nam", 20).taxWithRate(),0.0, 0.001) =>true
	 * Employee aEmployee1 = new Employee("Mai", 30)
	 * assertEquals(aEmployee1.taxWithRate(), 54.0, 0.001) => true
	 */
	double taxWithRate() {
		double grossPay = this.wage();
		if(grossPay<=240)
			return 0.0;
		if(grossPay<=480)
			return grossPay*0.15;
		return grossPay * 0.28;
		
	}
	/**
	 * This is the method for calculating net pay after tax deductions.
	 * @return netpayWithRate--(double)
	 * Example:
	 * assertEquals(new Employee("Nam", 20).netpayWithRate(),240.0, 0.001) => true
	 * Employee aEmployee2 = new Employee("Minh", 102)
	 * assertEquals(aEmployee2.netpayWithRate(), 881.28, 0.001) =>true
	 */
	double netpayWithRate() {
		return this.wage() - this.taxWithRate();
		
	}

}
