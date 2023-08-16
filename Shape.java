package review;

public abstract class Shape {
	private String name;
	protected static final double PI = 3.14;
	protected static int shapeCnt;
	
	public Shape() {
		shapeCnt++;
	}
	public Shape(String name) {
		this();
		this.setName(name);
	}
	
	public void draw() {
		System.out.println(getName() + "도형 그리기");
	}
	
	public abstract void calculateArea();
	public abstract void calculateRound();
	
}