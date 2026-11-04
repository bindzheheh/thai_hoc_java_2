package chap5;

import junit.framework.TestCase;

public class ILogTest extends TestCase {
	/**
	 * testing constructor
	 */
	public void testConstructor() {
		Date d1 = new Date (23,10,2008);
		Date d2 = new Date (24,10,2008);
		Date d3 = new Date (25,10,2008);
		/**
		 * testing list
		 */
		Entry E1 = new Entry (d1,0,"vua sinh nen chua chay",0);
		Entry E2 = new Entry (d2,100,"1 ngày tuổi chạy",1);
		Entry E3 = new Entry (d3,500,"2 ngày tuổi chạy",2);
		ILog L0 = new MTLog();
		ILog L1 = new ConsLog(E1,L0);
		ILog L2 = new ConsLog(E2,L1);
		ILog L3 = new ConsLog(E3,L2);
		/**
		 * print
		 */
		System.out.println(L3);
		
		
	}

}
