package MVNTestProjectPackage;

import org.junit.Assert;
import org.junit.Test;

public class MyTest extends ChromeDriverSettings {

    @Test
    public void Test1() {
        driver.get("https://www.toolsqa.com/");
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertTrue(title.equals("QA Automation Tools Tutorial"));
    }
}
