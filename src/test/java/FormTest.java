import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.Text;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FormTest {
    @BeforeAll
    static void beForeAll() {
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void getForm() {
        open("/automation-practice-form");
        $("#firstName").setValue("Svetlana");
        $("#lastName").setValue("Ryabova");
        $("#userEmail").setValue("1@mail.ru");
        $("#genterWrapper").$(byText("Female")).click();
        //$("#gender-radio-3").parent().$(byText("Female")).click();
        $("#userNumber").setValue(("89378388889"));
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("1984");
        $(".react-datepicker__month-select").selectOption(("November"));
        $(".react-datepicker__day--005").click();
        //$$("label.custom-control-label").filter(text("Famale")).get(0).click();
        //$x("//div[contains[@aria-label,\"November 05th6 1984\")]").click();
        $("#subjectsInput").setValue("Hindi").pressEnter();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("img/1.jpeg");
        $("#currentAddress").setValue("Ufa");
        $("#submit").scrollTo();
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();
        $("#submit").click();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").$(byText("Student Name")).parent().shouldHave(text("Svetlana Ryabova"));
        $(".table-responsive").$(byText("Student Email")).parent().shouldHave(text("1@mail.ru"));
        $(".table-responsive").$(byText("Gender")).parent().shouldHave(text("Female"));
        $(".table-responsive").$(byText("Mobile")).parent().shouldHave(text("8937838888"));
        $(".table-responsive").$(byText("Date of Birth")).parent().shouldHave(text("05 November,1984"));
        $(".table-responsive").$(byText("Subjects")).parent().shouldHave(text("Hindi"));
        $(".table-responsive").$(byText("Hobbies")).parent().shouldHave(text("Music"));
        $(".table-responsive").$(byText("Picture")).parent().shouldHave(text("1.jpeg"));
        $(".table-responsive").$(byText("Address")).parent().shouldHave(text("Ufa"));
        $(".table-responsive").$(byText("State and City")).parent().shouldHave(text("NCR Delhi"));
    }


}
