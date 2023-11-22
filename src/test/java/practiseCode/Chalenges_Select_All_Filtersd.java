package practiseCode;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chalenges_Select_All_Filtersd {
	static WebDriver driver;
	static WebDriverWait wait;

	static List<WebElement> allSubFiltersList;
	static List<WebElement> filter;
	public static void main(String[] args) throws InterruptedException  {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setBrowserVersion("119");
		driver= new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		driver.get("https://www.t-mobile.com/tablets");
		wait= new WebDriverWait(driver, Duration.ofSeconds(10000));
//		selectFilter("Deals", "New");
//		selectFilter("Operating System", "all");
		selectFilter("Brand", "Samsung", "TCL","Apple");//improper order
	}




	public static void selectFilter(String... filters) throws InterruptedException {

		int filterlength = filters.length;
		System.out.println(filterlength);

		Thread.sleep(10000);

		System.out.println("ihyhik");

		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//fieldset//mat-expansion-panel-header[@role='button']")));
		//System.out.println("aaaaa");
		By deal= By.xpath("//fieldset//mat-expansion-panel-header[@role='button']//mat-panel-title");
		System.out.println("bbbb");
		filter = driver.findElements(deal);


//		filter.get(2).click();
//		Thread.sleep(1000);
//		allSubFiltersList = driver.findElements(By.xpath("//fieldset//div[@role='region']//span[@class='filter-display-name']"));
//		System.out.println(allSubFiltersList.size());
//		if (filterlength==2) 
//		{
//			System.out.println("length is 2");
//			if (filters[1].equalsIgnoreCase("all")) 
//			{
//				for (int i = 0; i < allSubFiltersList.size(); i++) 
//				{
//					allSubFiltersList.get(i).click();
//					System.out.println(allSubFiltersList.get(i).getText());
//				}
//			}
//			else 
//			{
//
//				for (int i = 0; i <allSubFiltersList.size(); i++) 
//				{
//					String text = allSubFiltersList.get(i).getText();
//					if (text.contains(filters[1])) {
//						allSubFiltersList.get(i).click();
//					}	
//				}
//			}
//		}
//		if (filterlength>2) {System.out.println("Value is not All");
//		for (int i = 1; i <filterlength; i++) {
//			for (int j = 0; j < allSubFiltersList.size(); j++) {
//				String text = allSubFiltersList.get(j).getText();
//				if (text.contains(filters[i])) {
//					allSubFiltersList.get(j).click();
//				}	
//			}
//
//		}		
//		}

		////		filter.get(0).click();
		//		System.out.println("ccccccc");
		//		 allSubFiltersList = driver.findElements(By.xpath("//fieldset//div[@role='region']//span[@class='filter-display-name']"));

		//System.out.println(filter.size());
		//		filter.get(0).click();
		//		if (length==2) 
		//		{
		//			if (filters[1].equalsIgnoreCase("all")) {
		//				for (int i = 0; i < allSubFiltersList.size(); i++) {
		//					allSubFiltersList.get(i).click();
		//				}
		//			}else {
		//				for (int i = 1; i < allSubFiltersList.size(); i++) {
		//					String text = allSubFiltersList.get(i).getText();
		//					if (text.contains(filters[i])) {
		//						allSubFiltersList.get(i).click();
		//					}
		//				}
		//			}
		//		}if (length>2) {
		//			for (int i = 1; i < allSubFiltersList.size(); i++) {
		//				String text = allSubFiltersList.get(i).getText();
		//				if (text.contains(filters[i])) {
		//					allSubFiltersList.get(i).click();
		//				}
		//			}
		//		}



		System.out.println(filters[0].toLowerCase());
		switch (filters[0].toLowerCase()) {
		case "deals":
			filter.get(0).click();
			Thread.sleep(1000);
			allSubFiltersList = driver.findElements(By.xpath("//fieldset//div[@role='region']//span[@class='filter-display-name']"));
			System.out.println(allSubFiltersList.size());
			if (filterlength==2) 
			{
				System.out.println("length is 2");
				if (filters[1].equalsIgnoreCase("all")) 
				{
					for (int i = 0; i < allSubFiltersList.size(); i++) 
					{
						allSubFiltersList.get(i).click();
						System.out.println(allSubFiltersList.get(i).getText());
					}
				}
				else 
				{

					for (int i = 0; i <allSubFiltersList.size(); i++) 
					{
						String text = allSubFiltersList.get(i).getText();
						if (text.contains(filters[1])) {
							allSubFiltersList.get(i).click();
						}	
					}
				}
			}
			if (filterlength>2) {System.out.println("Value is not All");
			for (int i = 1; i <filterlength; i++) {
				for (int j = 0; j < allSubFiltersList.size(); j++) {
					String text = allSubFiltersList.get(j).getText();
					if (text.contains(filters[i])) {
						allSubFiltersList.get(j).click();
					}	
				}

			}		
			}

			break;
		case "brands":
			filter.get(1).click();
			Thread.sleep(1000);
			allSubFiltersList = driver.findElements(By.xpath("//fieldset//div[@role='region']//span[@class='filter-display-name']"));
			System.out.println(allSubFiltersList.size());
			if (filterlength==2) 
			{
				System.out.println("length is 2");
				if (filters[1].equalsIgnoreCase("all")) 
				{
					for (int i = 0; i < allSubFiltersList.size(); i++) 
					{
						allSubFiltersList.get(i).click();
						System.out.println(allSubFiltersList.get(i).getText());
					}
				}
				else 
				{

					for (int i = 0; i <allSubFiltersList.size(); i++) 
					{
						String text = allSubFiltersList.get(i).getText();
						if (text.contains(filters[1])) {
							allSubFiltersList.get(i).click();
						}	
					}
				}
			}
			if (filterlength>2) {System.out.println("Value is not All");
			for (int i = 1; i <filterlength; i++) {
				for (int j = 0; j < allSubFiltersList.size(); j++) {
					String text = allSubFiltersList.get(j).getText();
					if (text.contains(filters[i])) {
						allSubFiltersList.get(j).click();
					}	
				}

			}		
			}
			break;
		case "operating system": 
			filter.get(2).click();
			Thread.sleep(1000);
			allSubFiltersList = driver.findElements(By.xpath("//fieldset//div[@role='region']//span[@class='filter-display-name']"));
			System.out.println(allSubFiltersList.size());
			if (filterlength==2) 
			{
				System.out.println("length is 2");
				if (filters[1].equalsIgnoreCase("all")) 
				{
					for (int i = 0; i < allSubFiltersList.size(); i++) 
					{
						allSubFiltersList.get(i).click();
						System.out.println(allSubFiltersList.get(i).getText());
					}
				}
				else 
				{

					for (int i = 0; i <allSubFiltersList.size(); i++) 
					{
						String text = allSubFiltersList.get(i).getText();
						if (text.contains(filters[1])) {
							allSubFiltersList.get(i).click();
						}	
					}
				}
			}
			if (filterlength>2) {System.out.println("Value is not All");
			for (int i = 1; i <filterlength; i++) {
				for (int j = 0; j < allSubFiltersList.size(); j++) {
					String text = allSubFiltersList.get(j).getText();
					if (text.contains(filters[i])) {
						allSubFiltersList.get(j).click();
					}	
				}

			}		
			}	

			break;

		default:
			System.err.println("Pleas Enter the correct Filters Order like Filter then Sub-filter/All ");
			break;
		}



	}
}