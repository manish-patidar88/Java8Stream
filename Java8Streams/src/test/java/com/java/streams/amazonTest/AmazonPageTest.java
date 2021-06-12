package com.java.streams.amazonTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPageTest {
	static WebDriver driver;
	public static void main(String[] args) {		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		List<WebElement> list = driver.findElements(By.xpath("//a"));
		/*List<String> ls = new ArrayList<>();
		String product = "";
		for(int i=0;i<list.size();i++) {
			 product = list.get(i).getText();
			//if(!ls.contains(product)) {
				if(!product.isEmpty()) {
					if(product.startsWith("S") || product.startsWith("P")) {
						ls.add(product);
						System.out.println(product);
					}
					
				}
			//}
		}

		System.out.println("------------------------");
		HashSet<String> hs = new HashSet<>(ls);

		hs.stream().forEach(a->System.out.println(a));
		*/
		
		//Using Java 8
		list.stream().map(x->x.getText())
			.filter(x->!x.isEmpty())
				.distinct()
						.sorted()
							.filter(x->x.startsWith("S") || x.startsWith("P"))
								.forEach(x->System.out.println(x));
		
		
		driver.close();
	}
}
