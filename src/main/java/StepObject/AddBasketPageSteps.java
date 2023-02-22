package StepObject;
import PageObject.AddBasketPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.w3c.dom.Text;
import java.time.Duration;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class AddBasketPageSteps extends AddBasketPage {


    @Step ("Search Button")
    public AddBasketPageSteps SearchBtn (){
        SearchButtonn.click();
        return this;
    }

    @Step("Click On The Search Field ")
    public  AddBasketPageSteps ClickSearch(){
        Search.click();
        return this;
    }

    @Step("Search With Valid Text")
    public AddBasketPageSteps SearchText(String text){
        SearchName.setValue(text);
        return this;
    }

    @Step("Click Search Button")
    public AddBasketPageSteps ClickEnter(){
        SearchBtnClick.pressEnter();
        return this;
    }
    @Step("Add Cart Button")
    public AddBasketPageSteps AddCart() {
        AddCartBtn.click();
        return this;
    }

    @Step("Go To Cart")
    public AddBasketPageSteps GoToCart(){
        CartBtn.click();
        return this;
    }




}


