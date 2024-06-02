package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.GoogleSearchPage;

public class SearchTest extends BaseClass{

@Test
public void test1()
{
	/* driver.get("https://www.google.com/");
// find search box web element
	 WebElement searchbox = driver.findElement(By.name("q"));
searchBox.sendKeys("Noida");
searchBox.sendKeys("Keys.RETURN");*/
	GoogleSearchPage pg = new GoogleSearchPage(driver);
	driver.get("https://www.google.com/");
	pg.EnterSearchData("Noida");
	pg.PressEnterKeyOnSearchBox();
	
}
}
