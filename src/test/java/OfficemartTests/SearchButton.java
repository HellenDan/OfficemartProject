package OfficemartTests;
import StepObject.SearchButtonSteps;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import javax.naming.directory.SearchResult;
import static DataObject.SearchButtonObject.SearchIncorrect;
import static DataObject.SearchButtonObject.SearchText;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class SearchButton  extends Utils.ChromeRunner {

  SearchButtonSteps steps = new SearchButtonSteps();

   @Test
   @Description("Test Case 1 Click Search Button With Positive Case")
   @Severity(SeverityLevel.CRITICAL)

  public void ClickSearchButton(){
       steps.clickSearchBtn()
               .checkSearch();
       Assert.assertTrue(steps.Search.is(Condition.appear));
   }


    @Test
    @Description("Test Case 2  Search Text  With Positive Case")
    @Severity(SeverityLevel.CRITICAL)

    public void SearchCorrectInfo() {
        steps.clickSearchBtn()
                .clickSearchText()
                .searchText(SearchText)
                .searchBtnClick();
        Assert.assertTrue(steps.searchText(SearchText).SearchButton.is(Condition.matchText(SearchText)));

    }



    @Test
    @Description("Test Case 3 Search Text  With Negative Case")
    @Severity(SeverityLevel.CRITICAL)

    public void SearchIncorrectInfo() {
         steps.clickSearchBtn()
                  .clickSearchText()
                  .searchText(SearchIncorrect)
                  .searchBtnClick();

        }
    }
