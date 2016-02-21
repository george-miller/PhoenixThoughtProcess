import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import phoenix.positioningSystem.*;
import phoenix.gameplay.enemies.*;

@RunWith(Parameterized.class)
public class PositioningSystemTest{
	private PositioningSystem ps;

	public PositioningSystemTest(PositioningSystem ps){
		this.ps = ps;
	}

	@Parameterized.Parameters
	public static Collection testObjects() {
		return Arrays.asList(new Object[][] {
			{ new BasicPositioning(new BasicEnemy[]{new BasicEnemy(4, 5), new BasicEnemy(6, 7)}) }
		});
	}

	@Test
	public void testEnterScreen(){
		int x = ps.enemies[0].position.x;
		ps.initializePositions();
		assertNotSame(x, ps.enemies[0].position.x);
	}


}