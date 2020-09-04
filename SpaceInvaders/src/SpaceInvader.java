import edu.princeton.cs.algs4.StdDraw;

public class SpaceInvader extends GameObject {

	int phase;
	int phaseCount;
	int type; //if 0, it is dead
	int explodeCount = 5;
	
	
	
	public SpaceInvader(double x, double y, int type) {
		phase = 1;
		this.setX(x);
		this.setY(y);
		this.type = type;
		phaseCount = 0;
	}
	
	public void draw() {
		if (type != 0) {
	        String fileName = "/Users/jessicagray/eclipse-workspace/SpaceInvaders/lib/sprites/spacemen/spaceman"+type + "p" + phase +".png";
			StdDraw.picture(this.x, this.y, fileName, .05, .05);
			if (phaseCount == 100){
		        phase = (phase + 2) % 2  + 1;
		        phaseCount = 0;
			}
			phaseCount ++;
		}else if (explodeCount > 0) {
			explodeCount --;	        
			String fileName = "/Users/jessicagray/eclipse-workspace/SpaceInvaders/lib/sprites/spacemen/explode.png";
			StdDraw.picture(this.x, this.y, fileName, .05, .05);

		}
		
	}
	
	public void move (double xVel, double yVel) {
		this.x += xVel;
		this.y += yVel;

	}
	public void explode() {
		this.type = 0;
	}
	
}
