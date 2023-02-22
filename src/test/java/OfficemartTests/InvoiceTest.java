package OfficemartTests;
import StepObject.AddBasketPageSteps;
import StepObject.InvoicePageSteps;
import StepObject.SearchButtonSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.SearchButtonObject.SearchIncorrect;
import static DataObject.SearchButtonObject.SearchText;
import static com.codeborne.selenide.Selenide.$;

public class InvoiceTest extends  Utils.ChromeRunner {


    InvoicePageSteps steps  = new InvoicePageSteps();


}
