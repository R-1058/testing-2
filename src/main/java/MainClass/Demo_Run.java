package MainClass;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class Demo_Run {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Create object of TestNG Class
        TestNG runner=new TestNG();

        // Create a list of String
        List<String> suitefiles=new ArrayList<String>();

        // Add xml file which you have to execute
        suitefiles.add("C:\\Users\\a1354\\eclipse-workspace\\Shriam_General_Insurance\\Git_Integration\\testng.xml");

        // now set xml file for execution
        runner.setTestSuites(suitefiles);

        // finally execute the runner using run method
        runner.run();
    }

}

