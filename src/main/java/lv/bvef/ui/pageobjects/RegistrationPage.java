package lv.bvef.ui.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static testHelpers.StringValues.MR;
import static testHelpers.StringValues.MRS;

public class RegistrationPage {

    public RegistrationPage selectTitle(String title) throws IllegalAccessException {
        SelenideElement el = $(By.name("id_gender"));
        switch (title) {
            case MR:
                el.selectRadio("1");
                break;
            case MRS:
                el.selectRadio("2");
                break;
            default:
                throw new IllegalAccessException("Incorrect value " + title);
        }
        return this;
    }

    public RegistrationPage enterFirstNamePI(String firstName) {
        $(By.name("customer_firstname")).sendKeys(firstName);
        return this;
    }

    public RegistrationPage enterLastNamePI(String lastName) {
        $(By.name("customer_lastname")).sendKeys(lastName);
        return this;
    }

    public RegistrationPage checkEmailField(String email) {
        assertThat(email, is(equalTo($(By.name("email")).getValue())));
        return this;
    }

    public RegistrationPage enterPassword(String password) {
        $(By.name("passwd")).sendKeys(password);
        return this;
    }

    public RegistrationPage selectDateOfBirth(String day, String month, String year) {
        $(By.name("months")).selectOptionContainingText(month);
        $(By.name("years")).selectOptionContainingText(year);
        $(By.name("days")).selectOptionContainingText(day);
        return this;
    }

    public RegistrationPage enterFirstName(String firstName) {
        $(By.name("firstname")).sendKeys(firstName);
        return this;
    }

    public RegistrationPage enterLastname(String lastName) {
        $(By.name("lastname")).sendKeys(lastName);
        return this;
    }

    public RegistrationPage checkFirstNameField(String savedValueBefore) {
        assertThat(savedValueBefore, is(equalTo($(By.name("firstname")).getValue())));
        return this;
    }

    public RegistrationPage checkLastNameField(String savedValueBefore) {
        assertThat(savedValueBefore, is(equalTo($(By.name("lastname")).getValue())));
        return this;
    }

    public RegistrationPage enterAddress(String address) {
        $(By.name("address1")).sendKeys(address);
        return this;
    }

    public RegistrationPage enterCity(String city) {
        $(By.name("city")).sendKeys(city);
        return this;
    }

    public RegistrationPage selectState(String state) {
        $(By.name("id_state")).selectOptionContainingText(state);
        return this;
    }

    public RegistrationPage enterPostCode(String postCode) {
        $(By.name("postcode")).sendKeys(postCode);
        return this;
    }

    public RegistrationPage selectCountry(String country) {
        $(By.name("id_country")).selectOptionContainingText(country);
        return this;
    }

    public RegistrationPage enterMobileNumber(String mobileNumber) {
        $(By.name("phone_mobile")).sendKeys(mobileNumber);
        return this;
    }

    public RegistrationPage addressAlias(String alias) {
        $(By.name("alias")).clear();
        $(By.name("alias")).sendKeys(alias);
        return this;
    }

    public UserPanel submitRegistration() {
        $(By.name("submitAccount")).click();
        return page(UserPanel.class);
    }
}