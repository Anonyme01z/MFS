package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;


public class mfstest {
    public static <T> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SEAMFIX-PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        // Test case 1: Go to "http://automationpractice.com/index.php" and click on Sign-in
        driver.get("http://automationpractice.pl/index.php");
        driver.findElement(By.linkText("Sign in")).click();

       //  Test case 2: Sign-In using following credentials
        driver.findElement(By.id("email")).sendKeys("testautomationmfs@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("TestAutomation@123");
        driver.findElement(By.id("SubmitLogin")).click();
        
        
        
        
       // Find the element using its CSS selector
        WebElement  user_name = driver.findElement(By.cssSelector(".header_user_info span"));
        

       
       // Get the text from the element
       String user_name_text = user_name.getText();

       // Print the text to the console
       System.out.println("TestCase1 : The Username is " + user_name_text);
       
       // Find the element using its CSS selector
       WebElement HomeBtn = driver.findElement(By.cssSelector("li > .btn > span"));

       // Get the text from the element
       String HomeBtnTxt = HomeBtn.getText();

       // Click on the element
       HomeBtn.click();

       // Print the text to the console with a message
       System.out.println("TestCase2 : I clicked on " + HomeBtnTxt);


       
       // Test case 3
       
       WebElement alertElement = driver.findElement(By.cssSelector(".alert"));
       
       //Get the text from the element 
       String Testcase3txt = alertElement.getText();
       
       // Print the text to the console
       System.out.println("TestCase3 : " + Testcase3txt);
       

        
        // Test Case 4
        // Find the "Women" link element
        WebElement womenLink = driver.findElement(By.linkText("Women"));

        // Click on the "Women" link
        womenLink.click();
        
        // Find the "Dresses" link element
        WebElement dressesLink = driver.findElement(By.linkText("Dresses"));

        // Click on the "Dresses" link
        dressesLink.click();
        
        WebElement mSizeCheckbox = driver.findElement(By.id("layered_id_attribute_group_2"));
        mSizeCheckbox.click();

 
        WebElement pinkColorOption = driver.findElement(By.id("layered_id_attribute_group_24"));
        pinkColorOption.click();
//
//						//        
//						//     // Find the price range slider element
//						//        WebElement priceSlider = driver.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/div"));
//						//        //WebElement priceSlider = driver.findElement(By.id("layered_price_slider"));
//						//       // Thread.sleep(2000);
//						//        
//						//        
//						//        // Get the minimum and maximum values of the slider
//						//        int minValue = Integer.parseInt(priceSlider.getAttribute("data-min"));
//						//        int maxValue = Integer.parseInt(priceSlider.getAttribute("data-max"));
//						//
//						//        // Calculate the positions of $50.00 and $52.28 on the slider
//						//        double minRange = (50.00 - minValue) * 100 / (maxValue - minValue);
//						//        double maxRange = (52.28 - minValue) * 100 / (maxValue - minValue);
//						//
//						//       
//						//        // Move the slider to the selected price range
//						//        Actions actions = new Actions(driver);
//						//        WebElement leftHandle = driver.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/a[1]"));
//						//
//						//        actions.dragAndDropBy(priceSlider.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/a[1]")), (int) minRange, 0).build().perform();
//						//        actions.dragAndDropBy(priceSlider.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/a[2]")), (int) maxRange, 0).build().perform();
//						//
//						//        
//        WebElement image = driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"));
//        Actions action = new Actions(driver);
//        action.moveToElement(image).build().perform();
        
        try {
            Thread.sleep(3000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement body = driver.findElement(By.cssSelector(".ajax_block_product"));
        Actions action = new Actions(driver);
        action.moveToElement(body).perform();
        
        try {
            Thread.sleep(3000); // Wait for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.findElement(By.xpath("//a[@class='button lnk_view btn btn-default']/span[text()='More']")).click();
         
        
        WebElement availabilityValElement = driver.findElement(By.cssSelector("#availability_value"));
        
        //Get the text from the element 
        String availabilityValue = availabilityValElement.getText();
        
        // Print the text to the console
        System.out.println(availabilityValue);
        
      WebElement  color_element = driver.findElement(By.id("color_7"));
        		color_element.click();

        // Find the "select" element for the dropdown
        
       WebElement dropdown = driver.findElement(By.id("group_1"));
       
       // Use the Select class to interact with the dropdown
       Select select = new Select(dropdown);

     // Select the option with the value of "2" (which corresponds to "M")
       	select.selectByValue("2");
       
       
       	WebElement inputField = driver.findElement(By.id("quantity_wanted"));
      	inputField.clear();
      	inputField.sendKeys("3");
       
       
       // Find the "button" element for "Add to cart"
      	WebElement addToCartBtn = driver.findElement(By.cssSelector("p#add_to_cart button.exclusive"));

     // Click on the "Add to cart" button
      addToCartBtn.click();
        
     
        
     // Find the "a" element for the "Pink" color
      	WebElement pinkColorLink = driver.findElement(By.id("color_24"));

 

       
        WebElement quantity_element = driver.findElement(By.id("layer_cart_product_quantity"));
        WebElement  size_color_element = driver.findElement(By.id("layer_cart_product_attributes"));
        //WebElement product_cost_element = driver.findElement(By.xpath("//span[@id='layer_cart_product_price']"));
        
        WebElement product_cost_element = driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div:nth-child(2) > span"));
        
        WebElement shipping_cost_element = driver.findElement(By.className("ajax_cart_shipping_cost"));
        WebElement total_element = driver.findElement(By.cssSelector(".ajax_block_cart_total"));
        
       

     // Extract the values
        String quantity =  quantity_element.getText();
        String sizeColor = size_color_element.getText();
        String total = total_element.getText();
        String Shipping = shipping_cost_element.getText();  
      //  String productCost = product_cost_element.getText();
        String product_cost_text = product_cost_element.getAttribute("innerHTML");

        

     // Print the values
     System.out.println("Quantity: " + quantity);
     System.out.println("Size/Color: " + sizeColor);
     System.out.println("Total: " + total);
     System.out.println("Shipping" + Shipping);
     System.out.println("Total cost:" + product_cost_text);
     
      
     driver.quit();
     
    }}

