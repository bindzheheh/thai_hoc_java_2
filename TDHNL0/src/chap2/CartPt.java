package chap2;

public class CartPt {
	private int x;
	private int y;
	public CartPt(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public double distanceToO() {
		return Math.sqrt(this.x * this.x + this.y * this.y);
	}
	public CartPt translate(int dx, int dy) {
		return new CartPt(this.x + dx, this.y + dy);
		}

}
