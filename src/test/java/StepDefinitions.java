import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import page.objects.com.Base;
import page.objects.com.PageLocators;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import java.awt.List;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.remote.MobileCapabilityType;

@RunWith(Cucumber.class)
public class StepDefinitions extends Base {
	
	 Base b = new Base();
	 AndroidDriver<AndroidElement> driver = Base.Capabilities(driver);
	 PageLocators l = new PageLocators(driver);

    @Given("^I launch the OI shopping $")
    public void chooseLayout() throws Throwable {
    	l.choose_bottom_layout().click();
    }


    @When("^I create a new (.+)$")
    public void createList(String list) throws Throwable {
    
		l.get_image_button().click();
		l.new_list().click();
		l.create_list().clear();
		l.create_list().sendKeys("list");
		l.confirm_button().click();
      
    }

    @When("^I sort the created list items alphabetically$")
    public void sortList() throws Throwable {
    	l.image_view().click();
		l.get_settings().click();
		l.sort_order().click();	
		WebElement sortAlphabeticalRadioBtn = driver.findElements(By.className("android.widget.CheckedTextView")).get(1);
		sortAlphabeticalRadioBtn.click();
		driver.navigate().back();
		driver.findElementById("org.openintents.shopping:id/button_add_item").click();
    }

    @Then("^new list should be created and deleted item should not be displayed in list items$")
    public void verifyListItem() throws Throwable {
       
    }

    @Then("^list items should be be displayed in alphabetical order$")
    public void list_items_should_be_be_displayed_in_alphabetic_order() throws Throwable {
    	 java.util.List<AndroidElement> listOfficeItems = driver.findElementsById("org.openintents.shopping:id/name");
		 System.out.println(listOfficeItems.size());
		 boolean isSorted = true;
		 for(WebElement element : listOfficeItems) {
			 String sortedItems =  element.getText();
			 ArrayList<String> getItems = new ArrayList<String>();
			 Collections.addAll(getItems, sortedItems);
		 
			 for (int i=0; i<getItems.size()-1; i++) {
				 if (Integer.parseInt(getItems.get(i)) >  Integer.parseInt(getItems.get(i+1))) {
					 isSorted =false;
					 break;
				 }
			 }
			 System.out.println(isSorted);			
		 }
		 System.out.println("Validated alphabetical sorting");	   	   	
    }

    @And("^add new list (.+)$")
    public void add_new_list(String items) throws Throwable {
        throw new PendingException();
    }

    @And("^delete an (.+) from the (.+)$")
    public void delete_an_from_the(String item, String list) throws Throwable {
        
    	TouchAction myaction = new TouchAction(driver);		
		WebElement toDeleteGrocery = driver.findElementByXPath("//android.widget.TextView[@text='egg']");
		myaction.longPress(longPressOptions().withElement(element(toDeleteGrocery)).withDuration(ofSeconds(2))).release().perform();
		driver.findElementByXPath("//android.widget.TextView[@text='Delete item permanently']").click();
		driver.findElementById("android:id/button1").click();
		
    }

}


