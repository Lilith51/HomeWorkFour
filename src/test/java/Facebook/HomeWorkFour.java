package Facebook;

import org.junit.Test;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


import static com.codeborne.selenide.Selenide.open;

public class HomeWorkFour extends RegistrationVariables{

    @Test
    public void fbTest(){
        open("https://www.facebook.com/");
        String testEmail = "blah@gmail.com";
        String pass = "Test@123";
        regButton.click();
        firstName.sendKeys("blah");
        surname.sendKeys("blahblah");
        email.sendKeys(testEmail);
        repeatEmail.shouldBe(Condition.visible);
        repeatEmail.sendKeys(testEmail);
        newPass.sendKeys(pass);
        birthDay.selectOption(9);
        birthMonth.selectOption("Nov");
        birthYear.selectOption(19);
        customGenderCheckTrue();
        customPronoun.selectOption(2);
        $(byText("Male")).click();
        customGenderCheckFalse();
    }
}
