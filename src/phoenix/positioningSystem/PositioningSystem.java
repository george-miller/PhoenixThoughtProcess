package phoenix.positioningSystem;

import phoenix.gameplay.Enemy;

public abstract class PositioningSystem{
	public Enemy[] enemies;

	abstract public void initializePositions();

	abstract public void moveEnemies();

}