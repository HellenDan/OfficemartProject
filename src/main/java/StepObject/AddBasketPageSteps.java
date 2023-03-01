package StepObject;
import PageObjectt.AddBasketPage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
public class AddBasketPageSteps implements AddBasketPage {

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
    @Step("Increase Product Quantity")
    public AddBasketPageSteps IncreaseQuantity(){
        IncreaseBtn.click();
        return this;
    }
    @Step("Get Actual Price ")
    public double GetActualPrice(){
        return Double.parseDouble(ProductPrice.getOwnText());
    }
    @Step("Get Increased Price ")
    public double GetFullPrice(){
        return Double.parseDouble(ProductFullPrice.getOwnText());
    }
    @Step("Decrease Product Quantity")
    public AddBasketPageSteps DecreaseQuantity(){
        DecreaseBtn.click();
        return this;
    }
    @Step("Delete Product")
    public AddBasketPageSteps DeleteProduct(){
        DeleteProductBtn.click();
        return this;
    }
    @Step("Get Total Price Of The Product")
    public double GetTotalPrice(){
        return Double.parseDouble(TotalPrice.getOwnText());
    }
    @Step("All Clear Basket")
    public AddBasketPageSteps ClearCartBtn(){
        ClearCartBtn.click();
        return this;
    }
    @Step("Continue Purchase")
    public AddBasketPageSteps ContinuePurchase(){
        ContinuePurchaseBtn.click();
        return this;
    }
}


