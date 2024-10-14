package pages;

import com.codeborne.selenide.SelenideElement;
import pages.componenents.CalendarComponent;
import pages.componenents.RegistrationResultModal;
import pages.componenents.UploadPicture;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultModal registrationResultModal = new RegistrationResultModal();
    UploadPicture uploadPicture = new UploadPicture();

    private final String TITLE_TEXT = "Student Registration Form";
    private final SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmailInput = $("#userEmail"),
            userNumberInput = $("#userNumber");

    public RegistrationPage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        return this;
    }


    public RegistrationPage setFirstName(String value){
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value){
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value){
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value){
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage setNumber(String value){
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day,month, year);

        return this;
    }

    public RegistrationPage setUserSubjects(String value){
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setUserHobbie(String value1, String value2, String value3){
        $(byText(value1)).click();
        $(byText(value2)).click();
        $(byText(value3)).click();

        return this;
    }

    public RegistrationPage setUserPicture(String value){
        uploadPicture.setPicture(value);

        return this;
    }

    public RegistrationPage setUserAddres(String value){
        $("#currentAddress").setValue(value);

        return this;
    }

    public RegistrationPage setUserState(String value){
        $(byText("Select State")).click();
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage setUserCity(String value){
        $(byText("Select City")).click();
        $(byText(value)).click();

        return this;
    }

    public RegistrationPage submitUserData(){
        $("#submit").click();

        return this;
    }

    public RegistrationPage verifyResultModalAppears(){
        registrationResultModal.verifyModalAppears();

        return this;
    }

    public RegistrationPage verifyResultData(String key, String value){
        registrationResultModal.verifyResult(key, value);

        return this;
    }
}
