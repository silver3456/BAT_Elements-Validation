package core;

import java.util.concurrent.TimeUnit;

import java.util.logging.Level;

import java.util.logging.Logger;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.htmlunit.*;

public class GetParameters {
	static WebDriver driver;

	static final String url = "http://alex.academy/exercises/signup/v1/index.php";

	static String browser = "chrome";

	public static void main(String[] args) throws InterruptedException {

		Logger logger = Logger.getLogger("");
		logger.setLevel(Level.OFF);

		if (browser.equalsIgnoreCase("chrome"))

		{
			System.setProperty("webdriver.chrome.driver", "C:/workspace50/BAT_EV/src/resources/browsers/chromedriver.exe");

			System.setProperty("webdriver.chrome.silentOutput", "true");

			ChromeOptions option = new ChromeOptions();

			option.addArguments("-start-fullscreen");

			driver = new ChromeDriver(option);

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}

		else {
			driver = new HtmlUnitDriver();
			((HtmlUnitDriver) driver).setJavascriptEnabled(true);
		}

		driver.get(url);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

		//TC-001.01 Parameters id_quotes

		Dimension quotesSize = driver.findElement(By.id("id_quotes")).getSize();

		System.out.println("quotes Size Width: " + quotesSize.getWidth());

		System.out.println("quotes Size Height: " + quotesSize.getHeight());

		System.out.println("quotes Size: " + quotesSize.toString());

		Point quoteLocation = driver.findElement(By.id("id_quotes")).getLocation();

		System.out.println("quotes Location X: " + quoteLocation.getX());

		System.out.println("quotes Location Y: " + quoteLocation.getY());

		System.out.println("quotes Location: " + quoteLocation.toString());
		
		
		//TC-001.02 Parameters id_f_title

				Dimension fTitileSize = driver.findElement(By.id("id_f_title")).getSize();

				System.out.println("f_title Size Width: " + fTitileSize.getWidth());

				System.out.println("f_title Size Height: " + fTitileSize.getHeight());

				System.out.println("f_title Size: " + fTitileSize.toString());

				Point fTitleLocation = driver.findElement(By.id("id_f_title")).getLocation();

				System.out.println("f_title Location X: " + fTitleLocation.getX());

				System.out.println("f_title Location Y: " + fTitleLocation.getY());

				System.out.println("f_title Location: " + fTitleLocation.toString());
				
				//TC-001.03 Parameters id_current_location

				Dimension locationSize = driver.findElement(By.id("id_current_location")).getSize();

				System.out.println("id_current_location Size Width: " + locationSize.getWidth());

				System.out.println("id_current_location Size Height: " + locationSize.getHeight());

				System.out.println("id_current_location Size: " + locationSize.toString());

				Point locationCurrentLocation = driver.findElement(By.id("id_f_title")).getLocation();

				System.out.println("id_current_location Location X: " + locationCurrentLocation.getX());

				System.out.println("id_current_location Location Y: " + locationCurrentLocation.getY());

				System.out.println("id_current_location Location: " + locationCurrentLocation.toString());

		driver.close();
		
	}

}
