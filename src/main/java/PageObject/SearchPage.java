package PageObject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchPage {

    public SelenideElement

             SearchButton = $(byClassName("waves-effect")),
             Search = $(byClassName("form_group")),
             SearchName = $(byName("search")),
             SearchBtnClick = $(byClassName("search_button")),
             SearchResult = $(byLinkText("https://officemart.ge/product/schneider-%E1%83%99%E1%83%90%E1%83%9A%E1%83%9B%E1%83%94%E1%83%91%E1%83%98/%E1%83%99%E1%83%90%E1%83%9A%E1%83%90%E1%83%9B%E1%83%98-%E1%83%91%E1%83%A3%E1%83%A0%E1%83%97%E1%83%A3%E1%83%9A%E1%83%98%E1%83%90%E1%83%9C%E1%83%98-%E1%83%A8%E1%83%9C%E1%83%90%E1%83%98%E1%83%93%E1%83%94%E1%83%A0%E1%83%98-schneider-tops-%E1%83%9A%E1%83%A3%E1%83%A0%E1%83%AF%E1%83%98"));

}
