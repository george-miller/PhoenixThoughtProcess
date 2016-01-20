import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

import phoenix.gameplay.BasicElement;
import javax.swing.DebugGraphics;

@RunWith(Parameterized.class)
public class BasicElementTest {
   private BasicElement element;

   public BasicElementTest(BasicElement e) {
      this.element = e;
   }

   @Parameterized.Parameters
   public static Collection testObjects() {
      return Arrays.asList(new Object[][] {
         { new Object() }
      });
   }

   @Test
   public void testDraw(){
      
   }

}