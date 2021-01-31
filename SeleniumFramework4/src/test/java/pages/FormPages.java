package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPages {
	public WebDriver driver;
	


	
	
	
	
	public FormPages (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy( xpath= "/html[1]/body[1]/jb-app[1]/jb-basic-template[1]/div[1]/div[1]/jb-section-header-container[1]/div[1]/div[1]/div[1]/div[1]/jb-section-container[1]/div[1]/div[1]/jb-book-trip-container[1]/jb-pattern-block[1]/div[1]/div[2]/div[1]/jb-booker-tabs-container[1]/div[1]/jb-tabs[1]/section[1]/div[1]/jb-tab-panel[1]/jb-booker-tabs-wrapper[1]/div[1]/jb-booker-air-wrapper[1]/div[1]/jb-booker-air[1]/form[1]/div[1]/jb-city-pair-selector[1]/div[1]/jb-city-selector[2]/div[1]/div[1]/div[1]/input[1]")
	 public WebElement click;

	public WebElement getClick() {
		return click;
	}
//new push
	
	
	
}
