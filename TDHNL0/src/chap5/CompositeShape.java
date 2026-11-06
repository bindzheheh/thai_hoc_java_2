package chap5;

public class CompositeShape implements IShape {
	private IShape top;
	private IShape bottom;
	/**
	 * @param top
	 * @param bottom
	 */
	public CompositeShape(IShape top, IShape bottom) {
		this.top = top;
		this.bottom = bottom;
	}
	

}
