package Listenerclass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {
	//onStart==>It will run only once before the case start
	 public  void onStart(ITestContext context) {
		   System.out.println("The test case is going to start");
	 }
	 //onTestStart==>It will run for before the each @Test run 
	 public  void onTestStart(ITestResult result) {
		 System.out.println("The test case is started to run");
		  }
	 //onTestSuccess==>It will run after each @Test success
	 public  void onTestSuccess(ITestResult result) {
		 System.out.println("The test case run successfully");
		  }
    //onTestFailure==>It will run after each @Test Failure
	 public	   void onTestFailure(ITestResult result) {
		 System.out.println("The test case got failure");
		  }
	//onTestSkipped==>It will run after each @Test skipped where the method depends is failure
	 public   void onTestSkipped(ITestResult result) {
		 System.out.println("The test case is in skipped due to the failure exectuion before method");
		  }
}
