import edu.princeton.cs.algs4.StdDraw;

public class Bullet extends GameObject{
	
	public boolean available = true; 
	public int playerNumber;
	public Spaceship spaceship;
	
	public Bullet(Spaceship spaceship) {
		this.spaceship = spaceship;
		this.x = spaceship.x;
		this.y = spaceship.y;

	}
	
	public void step() {
		if (available) {
			if(ArcadeKeys.isKeyPressed(playerNumber, ArcadeKeys.KEY_UP) && x <= .95){
			available = false;
			this.yVel = .006;
			this.x = spaceship.x;
			this.y = spaceship.y;
			System.out.println(this.x);

			System.out.println("shot");
			}
		}
		if (this.y >1) {
			available = true; 
			this.yVel = 0;
		}
		this.y+= this.yVel;
		
		if (!available) {
			String fileName = "/Users/jessicagray/eclipse-workspace/SpaceInvaders/lib/sprites/bullet.png";
			StdDraw.picture(this.x, this.y, fileName, .05, .025);

		}
		
	}
	

}
