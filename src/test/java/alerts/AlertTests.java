package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertsPage;

public class AlertTests extends BaseTests {
    @Test
    public void testacceptAlert(){
        AlertsPage alertspage=homePage.clickAlertsPage();
        alertspage.setTriggerAlertBtn();
        alertspage.acceptAlert();
        Assert.assertEquals(alertspage.checkAlertStatus(),"You successfully clicked an alert","alert failed");
    }
    @Test
    public void testrejectConfirmation(){
        AlertsPage alertspage=homePage.clickAlertsPage();
        alertspage.setTriggerConfirmBtn();
        alertspage.rejectAlert();
        Assert.assertEquals(alertspage.checkAlertStatus(),"You clicked: Cancel","confirmation failed");
    }
//    @Test
//    public void testPromptInput() throws InterruptedException {
//        AlertsPage alertspage=homePage.clickAlertsPage();
//        alertspage.setTriggerPromptbtn();
//        alertspage.promptSetInput("this is input");
//        Assert.assertEquals(alertspage.checkAlertStatus(),"this is input","input prompt failed");
//    }

}
