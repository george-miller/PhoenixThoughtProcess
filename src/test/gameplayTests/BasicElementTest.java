import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import phoenix.gameplay.BasicElement;
import phoenix.gameplay.enemies.*;

@RunWith(Parameterized.class)
public class BasicElementTest {
   private BasicElement element;

   public BasicElementTest(BasicElement e) {
      this.element = e;
   }

   @Parameterized.Parameters
   public static Collection testObjects() {
      return Arrays.asList(new Object[][] {
         { new BasicEnemy(4, 5) }
      });
   }

   @Test
   public void testDraw(){
      
   }

}