//package tests;
//
//import base.BaseTests;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import pages.LoginPage;
//import pages.SecureArea;
//
//import static org.testng.Assert.assertEquals;
//
//public class LoginTest extends BaseTests {
//    @Test
//    public void testSuccessfulLogin(){
//    LoginPage loginPage =homePage.clickFormAuthentication();
//   SecureArea secureAreaPage= loginPage.loginHandler("tomsmith","SuperSecretPassword!");
//    String statusAlert = secureAreaPage.StatusCheck();
//        assertEquals(statusAlert,"You logged into a secure area!\n" +
//                "×","Alert text is incorrect");
//    }
//
//}
