package review;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	public Rectangle() {}
	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	public void draw() {
		super.draw();
		System.out.println("가로"+width+"세로"+height+"인 사각형을 그립니다.");
	
	}

	@Override
	public void calculateArea() {
		System.out.println("가로"+width+"세로"+height+"인 사각형의 넓이는"+width*height+"입니다.");
		
		
	}

	@Override
	public void calculateRound() {
		System.out.println("가로"+width+"세로"+height+"인 사각형의 둘레는"+2*width+2*height+"입니다.");
		
		
	}
	
}
