import org.junit.internal.TextListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.extensions.cpsuite.ClasspathSuite;
import org.junit.extensions.cpsuite.ClasspathSuite.*;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

@RunWith(ClasspathSuite.class)
public class TestSuite{
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(TestSuite.class);
        for (Failure failure : result.getFailures()) {
        	System.out.println(failure.getTestHeader() + " : " + failure.getException());
      	}
      	if (result.wasSuccessful()){
      		System.out.println("All Tests Successful!");
      	}
      	else{
      		System.out.println("FAILURES!");
      	}
    }
}
