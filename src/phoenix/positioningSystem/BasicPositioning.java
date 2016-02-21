package phoenix.positioningSystem;

import phoenix.gameplay.Enemy;

public class BasicPositioning extends PositioningSystem{
	public BasicPositioning(Enemy[] enemies){
		this.enemies = enemies;
	}
	public void initializePositions(){
		for (Enemy enemy : enemies){
			enemy.position.x = 0;
			enemy.position.y = 0;
		}
	}
	public void moveEnemies(){
		for (Enemy enemy : enemies){
			enemy.position.x++;
			enemy.position.y++;
		}
	}
}