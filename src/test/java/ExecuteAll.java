import org.demo.LoginPage;
import org.hdemo.SearchHotel;
import org.hrm.oMain;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.login.Main;
import org.test.Testing;

@RunWith(Suite.class)
@SuiteClasses({Testing.class,oMain.class})
public class ExecuteAll {
	
	/*@Test
	public void report() {
		Result rc = JUnitCore.runClasses(Testing.class);
		int runCount = rc.getRunCount();
		System.out.println(runCount);
	
		int failureCount = rc.getFailureCount();
		System.out.println(failureCount);
int passCount=	rc.getRunCount()-rc.getFailureCount();
		
		System.out.println(passCount);
		
		*/
	}	
	
	
	
	
	


