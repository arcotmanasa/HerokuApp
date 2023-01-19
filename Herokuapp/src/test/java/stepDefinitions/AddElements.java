package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class AddElements {

	WebDriver driver;

	@Given("a page path {string}")
	public void a_page_path(String url) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(1000);
	}

	@When("click on AddElement button add {int} buttons")
	public void click_on_AddElement_button_add_buttons(int n) {
		WebElement AddBtn =  driver.findElement(By.xpath("//*[@id='content']/div/button"));
		System.out.println("number of clicks: "+n);
		for(int i = 0; i < n; i++) {
			AddBtn.click();
		}
		
	}

	@Then("count and validate number of elements should be {int}")
	public void count_and_validate_number_of_elements_should_be(int  n) {
		//WebElement AddBtn =  driver.findElement(By.xpath("//*[@id='elements']/div/button"));
		List<WebElement> DeleteBtn = driver.findElements(By.xpath("//button[@class = 'added-manually']"));
		System.out.println("number of delete buttons: "+DeleteBtn.size());
		Assert.assertEquals(n, DeleteBtn.size());
		//driver.close();
	}
	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
	    driver.quit();
	}


}
