package review;

public class Circle extends Shape{
	private int radius;
	
	
	public Circle() {}
	
	public Circle(int radius, String name) {
		super(name);
		this.radius = radius;
	}
	
	public void draw() {
		super.draw();
		System.out.println("반지름이"+radius+"인 원을 그립니다.");
	
	}

	@Override
	public void calculateArea() {
		System.out.println("반지름"+radius+"인 원의 넓이는"+(radius*radius*PI)+"입니다.");
		
		
	}

	@Override
	public void calculateRound() {
		System.out.println("반지름"+radius+"인 원의 둘레는"+(2*radius+PI)+"입니다.");
		
		
	}
	
}
