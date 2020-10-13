package com.NextBase.tests;

import com.NextBase.pages.Dashboard;
import com.NextBase.pages.LoginPage;
import com.NextBase.utilities.BrowserUtils;
import com.NextBase.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AC3 extends TestBase{

    @Test
    public void loginAshelpDesk35() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as HelpDesk35 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("helpdesk35_username");
        String password = ConfigurationReader.get("helpdesk35_password");

        extentLogger.info("Enter Username: helpdesk35@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        Dashboard dashboard = new Dashboard();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Insert Video");
        BrowserUtils.waitForVisibility(dashboard.videoButton,20).click();

        extentLogger.info("Enter Video Source then click Save");
        BrowserUtils.waitForVisibility(dashboard.videoSource,20);
        dashboard.videoSource.sendKeys("https://www.vimeo.com/461057104");
        Thread.sleep(3000);
        //BrowserUtils.waitForVisibility(dashboard.videoSize,20);
        dashboard.saveVideoSource.click();


    }

    @Test
    public void loginAshelpDesk36() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as HelpDesk36 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("helpdesk36_username");
        String password = ConfigurationReader.get("helpdesk36_password");

        extentLogger.info("Enter Username: helpdesk36@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        Dashboard dashboard = new Dashboard();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Insert Video");
        BrowserUtils.waitForVisibility(dashboard.videoButton,20).click();

        extentLogger.info("Enter Video Source then click Save");
        BrowserUtils.waitForVisibility(dashboard.videoSource,20);
        dashboard.videoSource.sendKeys("https://www.vimeo.com/461057104");
        Thread.sleep(3000);
        //BrowserUtils.waitForVisibility(dashboard.videoSize,20);
        dashboard.saveVideoSource.click();
    }

    @Test
    public void loginAsmarketing35() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as Marketing35 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("marketing35_username");
        String password = ConfigurationReader.get("marketing35_password");

        extentLogger.info("Enter Username: marketing35@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        Dashboard dashboard = new Dashboard();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Insert Video");
        BrowserUtils.waitForVisibility(dashboard.videoButton,20).click();

        extentLogger.info("Enter Video Source then click Save");
        BrowserUtils.waitForVisibility(dashboard.videoSource,20);
        dashboard.videoSource.sendKeys("https://www.vimeo.com/461057104");
        Thread.sleep(3000);
        //BrowserUtils.waitForVisibility(dashboard.videoSize,20);
        dashboard.saveVideoSource.click();


    }

    @Test
    public void loginAsmarketing36() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as Marketing36 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("marketing36_username");
        String password = ConfigurationReader.get("marketing36_password");

        extentLogger.info("Enter Username: marketing36@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        Dashboard dashboard = new Dashboard();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Insert Video");
        BrowserUtils.waitForVisibility(dashboard.videoButton,20).click();

        extentLogger.info("Enter Video Source then click Save");
        BrowserUtils.waitForVisibility(dashboard.videoSource,20);
        dashboard.videoSource.sendKeys("https://www.vimeo.com/461057104");
        Thread.sleep(3000);
        //BrowserUtils.waitForVisibility(dashboard.videoSize,20);
        dashboard.saveVideoSource.click();

    }

    @Test
    public void loginAshr35() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as Hr35 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("hr35_username");
        String password = ConfigurationReader.get("hr35_password");

        extentLogger.info("Enter Username: hr35@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        Dashboard dashboard = new Dashboard();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Insert Video");
        BrowserUtils.waitForVisibility(dashboard.videoButton,20).click();

        extentLogger.info("Enter Video Source then click Save");
        BrowserUtils.waitForVisibility(dashboard.videoSource,20);
        dashboard.videoSource.sendKeys("https://www.vimeo.com/461057104");
        Thread.sleep(3000);
        //BrowserUtils.waitForVisibility(dashboard.videoSize,20);
        dashboard.saveVideoSource.click();


    }

    @Test
    public void loginAshr36() throws InterruptedException {
        //name of the test
        extentLogger = report.createTest("Login as Hr36 User Test");

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.get("hr36_username");
        String password = ConfigurationReader.get("hr36_password");

        extentLogger.info("Enter Username: hr36@cybertekschool.com");
        loginPage.usernameInput.sendKeys(username);

        extentLogger.info("Enter Password: UserUser");
        loginPage.passwordInput.sendKeys(password);

        extentLogger.info("Click Login Button");
        loginPage.loginBtn.click();

        extentLogger.info("Verify page URL");
        Assert.assertEquals(driver.getCurrentUrl(), "https://login2.nextbasecrm.com/stream/?login=yes");

        Dashboard dashboard = new Dashboard();

        extentLogger.info("Click Event");
        dashboard.event.click();

        extentLogger.info("Click Insert Video");
        BrowserUtils.waitForVisibility(dashboard.videoButton,20).click();

        extentLogger.info("Enter Video Source then click Save");
        BrowserUtils.waitForVisibility(dashboard.videoSource,20);
        dashboard.videoSource.sendKeys("https://www.vimeo.com/461057104");
        Thread.sleep(3000);
        //BrowserUtils.waitForVisibility(dashboard.videoSize,20);
        dashboard.saveVideoSource.click();

    }
}
