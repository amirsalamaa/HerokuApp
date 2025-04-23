package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KeyPresses;

public class KeysTests extends BaseTests {
    @Test
    public void testBackspace(){
        KeyPresses keyPage=homePage.clickKeyPresses();
        keyPage.enterText("A"+Keys.BACK_SPACE);
        Assert.assertEquals(keyPage.getEnteredText(), "You entered: BACK_SPACE", "Assertion failed message");

    }


}
