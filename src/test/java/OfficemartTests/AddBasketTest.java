package OfficemartTests;
import StepObject.AddBasketPageSteps;
import StepObject.SearchButtonSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.AddBasketObject.NotificationText;
import static DataObject.SearchButtonObject.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class AddBasketTest extends Utils.ChromeRunner {

    AddBasketPageSteps steps = new AddBasketPageSteps();

    @Test
    @Description("Test Case 4 Add Product to the basket ")
    @Severity(SeverityLevel.CRITICAL)

    public void AddBasketBtn (){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart();
        sleep(200);
      Assert.assertTrue(steps.AddText.isDisplayed());
    }


    @Test
    @Description("Test Case 5 Check Product Title")
    @Severity(SeverityLevel.CRITICAL)

    public void CheckTitle(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductTitle.is(Condition.not(Condition.empty)));

    }

    @Test
    @Description("Test Case 6 Check Product Color")
    @Severity(SeverityLevel.CRITICAL)

    public void CheckColor(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductColor.isDisplayed());
    }


    @Test
    @Description("Test Case 7 Check Product Code")
    @Severity(SeverityLevel.CRITICAL)

    public void CheckCode(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductColor.isDisplayed());
    }


    @Test
    @Description("Test Case 8 Check Product Quantity ")
    @Severity(SeverityLevel.CRITICAL)

    public void CheckQuantity(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductQuantity.isDisplayed());
    }

    @Test
    @Description ("Test Case 9 Check Product Price")
    @Severity(SeverityLevel.CRITICAL)

    public void CheckPrice(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductPrice.isDisplayed());
    }


    @Test
    @Description ("Test Case 10 Check Prduct Full Price ")
    @Severity(SeverityLevel.CRITICAL)

    public void CheckFullPrice(){
        steps.SearchBtn()
                .ClickSearch()
                .SearchText(Text)
                .ClickEnter()
                .AddCart()
                .GoToCart();
        Assert.assertTrue(steps.ProductFullPrice.isDisplayed());

    }



}
