
public class InvaderArray {
	public SpaceInvader[][] aliens;
	public double xVel, yVel;
	
	
	public InvaderArray() {
		aliens = new SpaceInvader[11][5];
		xVel = .001;
		yVel = (double) 0;

		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 5; j++) {
				int type = j / 2 + 1;
				aliens[i][j] = new SpaceInvader(.225 + i * .05, .95-  j * .05, type);
			}
		}
	}
	
	
	public void step() {
		
		if (aliens[10][4].getX() > .975) {
			xVel = xVel *-1 - .0002;
			yVel = -.02;
		}else if (aliens[0][0].getX() < 0.025) {
			xVel = xVel *-1 +.0002;

			yVel = -.02;
			

		}
		
		
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 5; j++) {

				aliens[i][j].move(xVel, yVel);
				aliens[i][j].draw();
			}
		}
		yVel = (double)0;

	}
	
	
}
