

public class GameObject {
	
	public double x, y, radius;
	public double xVel, yVel;
	public int team;

	
		
	public void draw() {
		
	}
	
	public void move() {
		this.x += this.xVel;
		this.y += this.yVel;
	};
	
	public void step() {
		
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getyVel() {
		return yVel;
	}

	public void setyVel(double yVel) {
		this.yVel = yVel;
	}

	public double getxVel() {
		return xVel;
	}

	public void setxVel(double xVel) {
		System.out.println(xVel);
		this.xVel = xVel;
	}

}
