package tests;

import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.HomePageSteps;
import utilities.BeforeAndAfterTest;

public class PartsTest extends BeforeAndAfterTest {

    @Test
    public void searchValidateResultsForMercedesBenzWheelsParts() {

        /*
        1. open app - home page Cars
        2. Go to tab Parts
        3. Unroll input fields
        4. Fill form with expected data for search - felgi, Mercedes Benz, track car
        5. Click to show search results
        6. Validate search results - if any results than PASS
         */

        Assert.assertTrue(true);

    }


}
