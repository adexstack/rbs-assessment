package page.objects.com;




import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageLocators {
	
	public AndroidDriver driver;
	
	By get_image_button = By.className("android.widget.ImageButton");
	By new_list = By.xpath("//android.widget.TextView[@text='New list']");
	By clear_text = By.id("org.openintents.shopping:id/edittext");
	By create_list = By.id("org.openintents.shopping:id/edittext");
	By confirm_button = By.id("android:id/button1");
	By create_item = By.id("org.openintents.shopping:id/autocomplete_add_item");
	By confirm_add_item = By.id("org.openintents.shopping:id/button_add_item");
	By get_grocery_list = By.id("//android.widget.FrameLayout[1]/android.widget.TextView");
	By get_electronics_list = By.id("//android.widget.FrameLayout[2]/android.widget.TextView");
	By delete_permanent_text = By.xpath("//android.widget.TextView[@text='Delete item permanently']");
	By get_settings = By.xpath("//android.widget.TextView[@text='Settings']");
	By sort_order = By.xpath("//android.widget.TextView[@text='Sort order']");
	By choose_bottom_layout = By.id("org.openintents.shopping:id/image_bottom");
	By image_view = By.className("android.widget.ImageView");
	
				
	public PageLocators(AndroidDriver driver) {  
		
		this.driver = driver; 
	}
	

	public WebElement get_image_button()
	{
		return driver.findElement(get_image_button);
	}
	
	public WebElement new_list()
	{
		return driver.findElement(new_list);
	}
	
	public WebElement clear_text()
	{
		return driver.findElement(clear_text);
	}
	
	public WebElement create_list()
	{
		return driver.findElement(create_list);
	}
	
	public WebElement confirm_button()
	{
		return driver.findElement(confirm_button);
	}
	
	public WebElement create_item()
	{
		return driver.findElement(create_item);
	}
	
	public WebElement confirm_add_item()
	{
		return driver.findElement(confirm_add_item);
	}
	
	public WebElement get_grocery_list()
	{
		return driver.findElement(get_grocery_list);
	}
	
	public WebElement get_electronics_list()
	{
		return driver.findElement(get_electronics_list);
	}
	
	public WebElement delete_permanent_text()
	{
		return driver.findElement(delete_permanent_text);
	}
	
	public WebElement get_settings()
	{
		return driver.findElement(get_settings);
	}
	
	public WebElement sort_order()
	{
		return driver.findElement(sort_order);
	}
	
	public WebElement choose_bottom_layout()
	{
		return driver.findElement(choose_bottom_layout);
	}
	
	public WebElement image_view()
	{
		return driver.findElement(image_view);
	}
																
}


