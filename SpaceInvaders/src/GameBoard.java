import edu.princeton.cs.algs4.StdDraw;;
public class GameBoard {
	
	
	@SuppressWarnings("deprecation")
	public void play() {
		InvaderArray ia = new InvaderArray();
		Spaceship jess = new Spaceship();
		Bullet bullet = new Bullet(jess);

		while(true) {
			StdDraw.clear(StdDraw.BLACK);
			bullet.step();

			ia.step();
			checkCollision(bullet, ia);
			checkPlayerHit(jess, ia);
			jess.step(10);

			StdDraw.show(10);
		}

	}
	

	
	public static void main(String[] args) {
		GameBoard board = new GameBoard();
		board.play();

	}
	
	public static void checkCollision(Bullet bullet, InvaderArray array) {
		for (int i = 0; i < 11; i++) {
			for (int j = 4; j >= 0; j--) {
				if (!bullet.available &&array.aliens[i][j].type!=0 && Math.sqrt(Math.abs(bullet.x-array.aliens[i][j].x)*Math.abs(bullet.x-array.aliens[i][j].x)+Math.abs(bullet.y-array.aliens[i][j].y)*Math.abs(bullet.y-array.aliens[i][j].y)) < .03) {
					array.aliens[i][j].explode();
					bullet.available = true;
				}
				
			}
		}

	}
	
	public static void checkPlayerHit(Spaceship s, InvaderArray array)		{
		for (int i = 0; i < 11; i++) {
		for (int j = 4; j >= 0; j--) {
			if (array.aliens[i][j].type!=0 && Math.sqrt(Math.abs(s.x-array.aliens[i][j].x)*Math.abs(s.x-array.aliens[i][j].x)+Math.abs(s.y-array.aliens[i][j].y)*Math.abs(s.y-array.aliens[i][j].y)) < .03) {
				//array.aliens[i][j].explode();
				s.explode();
			}
			
		}
	}

}
	
	
	

}
