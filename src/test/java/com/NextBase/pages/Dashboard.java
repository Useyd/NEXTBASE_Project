package com.NextBase.pages;

import com.NextBase.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Dashboard {

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement message;

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement task;

    @FindBy(id="feed-add-post-form-tab-calendar")
    public WebElement event;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement poll;

    @FindBy(id ="feed-add-post-form-link-more")
    public WebElement more;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[1]")
    public WebElement file;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[2]")
    public WebElement appreciation;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[3]")
    public WebElement announcement;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-feed-add-post-form-popup\"]/div/div/span[4]")
    public WebElement workflow;

    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm_calendar']")
    public WebElement uploadfilesLink;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[1]/td[1]/div/input)[2]")
    public WebElement uploadFileOption;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[1]/td[3]/span/span/span[1]/span)[2]")
    public WebElement bitrix24;

    @FindBy(xpath = "//a[contains(text(),'file.txt')]")
    public WebElement selecttheFile;

    @FindBy(xpath = "//body/div[@id='DiskFileDialog']/div[1]/span[1]")
    public WebElement selectDocument;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[3]/td[1]/span/span/span[1]/span)[2]")
    public WebElement downloadfrExDrive;

    @FindBy(xpath = "//body/div[@id='DiskFileDialog']/div[1]/span[1]")
    public WebElement cancel;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[3]/td[3]/span/span/span[1]/span/span[1]/span[1])[2]")
    public WebElement googleDocs;

    @FindBy(xpath = "(//body/div[7]/div[1]/div/div/a[1])")
    public WebElement desktopApps;

    @FindBy(xpath = "(//body/div[7]/div[1]/div/div/a[2])")
    public WebElement googleDocs2;

    @FindBy(xpath = "(//body/div[7]/div[1]/div/div/a[3])")
    public WebElement office365;

    @FindBy(xpath = "(//body/div[7]/div[1]/div/div/a[4])")
    public WebElement msOfficeOnline;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[3]/td[3]/span/span/span[2]/a[1]/span[2])[2]")
    public WebElement createDocument;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[3]/td[3]/span/span/span[2]/a[2]/span[2])[2]")
    public WebElement createSpreadSheet;

    @FindBy(xpath = "(//*/div[2]/table/tbody/tr[3]/td[3]/span/span/span[2]/a[3]/span[2])[2]")
    public WebElement createPresentation;

    @FindBy(xpath = "(//body/div[9]/div[2]/span[2])")
    public WebElement cancelForCreate;

    @FindBy(xpath = "//*[@id=\"bx-disk-select-doc-service\"]/div[3]/span[1]")
    public WebElement save;

    @FindBy(xpath = "//*[@id=\"bx-gedit-convert-confirm\"]/div[2]/span[1]")
    public WebElement downloadButton;

    @FindBy(xpath = "//*[@id=\"bx-b-link-blogPostForm_calendar\"]/span/i")
    public WebElement linkIcon;

    @FindBy(xpath = "(//input[@id='linkoCalEditorcal_3Jcl-text'])[1]")
    public WebElement textInput;

    @FindBy(xpath = "(//input[@id='linkoCalEditorcal_3Jcl-href'])[1]")
    public WebElement linkInput;

    @FindBy(xpath = "(//input[@id='undefined'])[1]")
    public WebElement saveLinkButton;

    @FindBy(xpath = "(//input[@id='cancel'])[1]")
    public WebElement cancelLinkButton;

    @FindBy(xpath = "//*[@id=\"bx-b-video-blogPostForm_calendar\"]/span/i")
    public WebElement videoButton;

    @FindBy(xpath = "//*[@id=\"video_oCalEditorcal_3Jcl-source\"]")
    public WebElement videoSource;

    @FindBy(xpath = "//*[@id=\"undefined\"]")
    public WebElement saveVideoSource;

    @FindBy(xpath = "//*[@id=\"video_oCalEditorcal_3Jcl-size\"]")
    public WebElement videoSize;

    @FindBy(xpath = "//*[@id=\"bx-b-quote-blogPostForm_calendar\"]/span/i")
    public WebElement quoteButton;

    @FindBy(xpath = "//*[@id=\"feed-cal-event-namecal_3Jcl\"]")
    public WebElement eventName;

    @FindBy(xpath = "//blockquote[1]")
    public WebElement quoteBlock;

    @FindBy(xpath = "(//*[@class=\"bx-editor-iframe\"])[1]")
    public WebElement iFrame;



    public Dashboard(){

        PageFactory.initElements(Driver.get(), this);

    }




}



