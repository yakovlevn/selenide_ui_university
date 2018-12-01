package lv.bvef.ui.pageobjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static testHelpers.StringValues.MR;
import static testHelpers.StringValues.MRS;

public class RegistrationPage {


    @FindBy(how = How.NAME, using = "id_gender")
    private SelenideElement selectGender;

    @FindBy(how = How.NAME, using = "customer_firstname")
    private SelenideElement customerFirstName;

    @FindBy(how = How.NAME, using = "customer_lastname")
    private SelenideElement customerLastName;

    @FindBy(how = How.NAME, using = "email")
    private SelenideElement emailField;

    @FindBy(how = How.NAME, using = "passwd")
    private SelenideElement passwordField;

    @FindBy(how = How.NAME, using = "days")
    private SelenideElement calendarDay;

    @FindBy(how = How.NAME, using = "months")
    private SelenideElement calendarMonth;

    @FindBy(how = How.NAME, using = "years")
    private SelenideElement calendarYear;

    @FindBy(how = How.NAME, using = "firstname")
    private SelenideElement firstNameField;

    @FindBy(how = How.NAME, using = "lastName")
    private SelenideElement lastNameField;


    public RegistrationPage selectTitle(String title) throws IllegalAccessException {
        switch (title) {
            case MR:
                selectGender.selectRadio("1");
                break;
            case MRS:
                selectGender.selectRadio("2");
                break;
            default:
                throw new IllegalAccessException("Incorrect value " + title);
        }
        return this;
    }

    public RegistrationPage enterFirstNamePI(String firstName) {
        customerFirstName.sendKeys(firstName);
        return this;
    }

    public RegistrationPage enterLastNamePI(String lastName) {
        customerLastName.sendKeys(lastName);
        return this;
    }

    public RegistrationPage checkEmailField(String email) {
        assertThat(email, is(equalTo(emailField.getValue())));
        return this;
    }

    public RegistrationPage enterPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public RegistrationPage selectDateOfBirth(String day, String month, String year) {
        calendarDay.selectOptionContainingText(day);
        calendarMonth.selectOptionContainingText(month);
        calendarYear.selectOptionContainingText(year);
        return this;
    }

    public RegistrationPage enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
        return this;
    }

    public RegistrationPage enterLastname(String lastName) {
        firstNameField.sendKeys(lastName);
        return this;
    }
}