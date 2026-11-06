package chap4;

public class MTInventory implements Inventory {
	public MTInventory() {
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Empty";
	}

	@Override
	public boolean contains(String nameOfToy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isBelow(double priceOfToy) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int howMany() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ConsInventory raisePrice(double percent) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
