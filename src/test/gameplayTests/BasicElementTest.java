import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BasicElementTest {
   // For now this is simply an example to make sure everything works
   private Integer i;

   @Before
   public void initialize() {
   }

   public BasicElementTest(Integer i) {
      this.i = i;
   }

   @Parameterized.Parameters
   public static Collection testObjects() {
      return Arrays.asList(new Object[][] {
         { 4 },
         { 5 }
      });
   }

   @Test
   public void testExample(){
      assertEquals(i, new Integer(5));
   }

}