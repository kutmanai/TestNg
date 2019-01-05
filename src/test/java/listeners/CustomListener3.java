package listeners;

import org.testng.*;

public class CustomListener3 implements ISuiteListener {


    @Override
    public void onStart(ISuite iSuite) {
        // When the <suit> is start
        System.out.println("Before suit start "+iSuite);
    }

    @Override
    public void onFinish(ISuite iSuite) {
    // When the <suit> is finish
        System.out.println("After the suit completes "+iSuite);
    }
}
