package com.selenium.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownExample2 {
	public static void main(String[] args) throws InterruptedException {
		// Open browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Maximize
		driver.manage().window().maximize();

		// Loading url in the browser
		driver.get("https://www.ebay.com/sch/ebayadvsearch");

		WebElement catDropdown = driver.findElement(By.id("LH_SORT_BY"));
		Select catSelectDropdwn = new Select(catDropdown);

		// Retrieve all values of dropdown
		List<WebElement> listOfOption = catSelectDropdwn.getOptions();

		for (WebElement option : listOfOption) {
			System.out.println(option.getText());
			catSelectDropdwn.selectByVisibleText(option.getText());
			Thread.sleep(1000);
		}

	}
}
