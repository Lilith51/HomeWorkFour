package Facebook;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationVariables {
    SelenideElement regButton = $(byText("Create New Account"));
    SelenideElement firstName = $(byAttribute("placeholder", "First name"));
    SelenideElement surname = $(byAttribute("aria-label", "Surname"));
    SelenideElement email = $(byAttribute("aria-label", "Mobile number or email address"));
    SelenideElement repeatEmail = $(byAttribute("aria-label", "Re-enter email address"));
    SelenideElement newPass = $(byAttribute("aria-label", "New password"));
    SelenideElement birthDay = $(byAttribute("title", "Day"));
    SelenideElement birthMonth = $(byAttribute("title", "Month"));
    SelenideElement birthYear = $(byAttribute("title", "Year"));
    SelenideElement customGender = $(byText("Custom"));
    SelenideElement customPronoun = $(byAttribute("aria-label", "Select your pronoun"));
    SelenideElement genderOptional = $(byAttribute("aria-label", "Gender (optional)"));


    public void customGenderCheckTrue() {
        $(byText("Custom")).click();
        customPronoun.shouldBe(Condition.visible);
        genderOptional.shouldBe(Condition.visible);
    }

    public void customGenderCheckFalse() {
        customPronoun.shouldNotBe(Condition.visible);
        genderOptional.shouldNotBe(Condition.visible);
    }
}
