import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.beans.PropertyEditor;

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

        //$("#submit").click();


    }


}
