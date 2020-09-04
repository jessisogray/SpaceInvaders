import java.awt.Color;

import edu.princeton.cs.algs4.StdDraw;


public class Spaceship extends GameObject {
	public double x;
	public double y;
	private double speed;
	private int playerNumber;
	

	/**
	 * This method has a frog do one "step." During this step, a frog will draw itself and change its x
	 * and y coordinates based on a player's inputs.
	 * Takes in a parameter stepCount to determine when the frog is allowed to go.
	 * StepCount is compared with a frog's "canGo" int, and while stepCount is smaller, the player
	 * cannot move and a message asking if the player's ready is displayed.
	 */
	public Spaceship(){
		x = .53;
		y = 0.05;
		playerNumber = 0;
		
	}
	
	public void draw() {
		String fileName = "/Users/jessicagray/eclipse-workspace/SpaceInvaders/lib/sprites/spaceship.png";
		StdDraw.picture(this.x, this.y, fileName, .1, .05);
	}
	public void step(int stepCount) {
		this.x += this.speed;
		if (stepCount < 10){
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.text(.55, .6, "Player " + (playerNumber + 1) +": Ready?");
		}
		else{
			
			this.draw();
			if(ArcadeKeys.isKeyPressed(playerNumber, ArcadeKeys.KEY_RIGHT) && x <= .95){
				x += .005;	
			}
			if(ArcadeKeys.isKeyPressed(playerNumber, ArcadeKeys.KEY_LEFT) && x >= .05){
				x -= .005;	
			}
		}
	}
	public void explode() {
		
		for(int i = 0; i < 100000; i++) {
			String fileName = "/Users/jessicagray/eclipse-workspace/SpaceInvaders/lib/sprites/spacemen/explode.png";
			StdDraw.picture(this.x, this.y, fileName, .05, .05);

		}
	}

}
