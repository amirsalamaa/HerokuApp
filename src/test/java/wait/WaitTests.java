package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicExampleOne;

public class WaitTests extends BaseTests {
    @Test
    public void testWaitUntilHidden(){
        DynamicExampleOne loadingPage=homePage.clickDynamicLoadingPage().clickFirstExample();
        loadingPage.clickStart();
        Assert.assertEquals(loadingPage.getLoadedText(),"Hello World!","failed");
    }

}
