package PageObject;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class AddBasketPage {
    public SelenideElement

            SearchButtonn = $(byClassName("waves-effect")),
            Search = $(byClassName("form_group")),
            SearchName = $(byName("search")),
            SearchBtnClick = $(byClassName("search_button")),
            AddCartBtn = $(By.className("add_cart")),

            AddText = $(By.id("toast-container")),

            CartBtn = $(By.className("cart_info")),

            ProductTitle = $(byClassName("item_title")),

            ProductColor = $(By.className("item_col")),

            ProductQuantity = $(By.name("quantity")),

           ProductPrice = $(By.xpath("/html/body/div[5]/div/div[3]/div[6]/div[2]/span[1]")),

           ProductFullPrice= $(By.xpath("/html/body/div[5]/div/div[3]/div[7]/div[2]/span[1]"));






}
