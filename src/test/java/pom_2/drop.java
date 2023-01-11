package pom_2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class drop {
public static void HandleDropDown_text(WebElement element,String text) {
		
		Select select=new Select(element);
		select.selectByVisibleText(text);
		
		
	}

}
