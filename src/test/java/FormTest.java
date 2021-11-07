import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.beans.PropertyEditor;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTest {
    @BeforeAll
    static  void beForeAll(){
        Configuration.startMaximized =true;
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void getForm(){
        open("/automation-practice-form");
        $("#firstName").setValue("Svetlana");
        $("#lastName").setValue("Ryabova");
        $("#userEmail").setValue("1@mail.ru");
        $("#genterWrapper").$(byText("Female")).click();
        //$("#gender-radio-3").parent().$(byText("Female")).click();
        $("#userNumber").setValue(("89371111111"));
        $("dateOfBirthInput").click();


        //$("#submit").click();


    }


}
