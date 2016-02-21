package phoenix.gameplay.enemies;

import phoenix.gameplay.Enemy;
import phoenix.gameplay.Position;
import java.awt.Graphics;

public class BasicEnemy extends Enemy{
	public BasicEnemy(int x, int y){
		position = new Position(x, y);
	}
	public void createProjectile(Position [] targets){

	}

	public void draw(Graphics g){
		g.drawLine(1, 2, 3, 4);
	}
}