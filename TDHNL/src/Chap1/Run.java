package Chap1;

public class Run {

	public static void main(String[] args) {     // điểm bắt đầu của chương trình
	        Star aStar1 = new Star("Abba", "John", "vocals", 12200);   // tạo ngôi sao 1
	        Star aStar2 = new Star("Elton", "John", "guitar", 20000);  // tạo ngôi sao 2
	
	        System.out.println(aStar1.firstName);                       // in nội dung aStar1 (nhờ toString)
	        System.out.println(aStar2.instrument);                       // in nội dung aStar2
	        System.out.println(aStar2.sales);
	        double a = aStar2.sales + aStar1.sales;
	        System.out.println(a);
	        System.out.println(aStar2);
	        System.out.println(aStar2.biggerSales(aStar1));   // true, vì 20000 > 12200
	        System.out.println(aStar1.equals(new Star("Abba", "John", "vocals", 12200))); // true, nội dung giống nhau
	    }
	}


