package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCases.AddUserTest;
import common.WebDriverFactory;

public class AdminPage {
	@FindBy(id="btnAdd")
	private WebElement buttenadd;
	
	private WebDriverWait wait;
	
	public 	AdminPage() {
		PageFactory.initElements(WebDriverFactory.localchrome.get(), this);
		wait=new WebDriverWait(WebDriverFactory.localchrome.get(), 20);
	}
	
	public AddUserpage adduserNevigate() {
		buttenadd.click();
		return new AddUserpage().isPageLoaded();
	}
	
	public AdminPage isPageLoaded() {
		wait.until(ExpectedConditions.visibilityOf(buttenadd));
		return this;
	}

}
