import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.NoSuchElementException;

public abstract class Page {
    protected WebDriver driver;

    public Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By locator){
        return driver.findElements(locator).size()>0;
    }

    public boolean isElementPresent(WebElement webElement)
    {
        int flag = 0;
        try {

            webElement.getTagName();

        } catch (NoSuchElementException e) {
            flag = 1;
        }
        if (flag == 1){
            return false;
        }
        else{
            return true;
        }
    }
}
