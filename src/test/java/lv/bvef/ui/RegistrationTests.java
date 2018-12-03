package lv.bvef.ui;

import lv.bvef.ui.pageobjects.AuthenticationPage;
import lv.bvef.ui.pageobjects.MainPage;
import lv.bvef.ui.pageobjects.RegistrationPage;
import org.apache.log4j.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.*;
import org.junit.runner.Description;

import static com.codeborne.selenide.Selenide.open;
import static lv.bvef.ui.utils.RandomGenerator.*;
import static testHelpers.GlobalConstants.WEB_URL;
import static testHelpers.StringValues.*;

public class RegistrationTests {

    private static Logger logger = Logger.getLogger(RegistrationTests.class);

    @Rule
    public TestRule watcher = new TestWatcher() {
        protected void starting(Description description) {
            logger.info("Starting test: " + description.getMethodName());
        }
    };

    @Test
    public void accountRegistration() throws IllegalAccessException {
        MainPage mainPage = open(WEB_URL, MainPage.class);
        AuthenticationPage authenticationPage = mainPage.signIn();
        RegistrationPage registrationPage = authenticationPage.createAccountWithEmail(randomEmail(5));
        registrationPage.selectTitle(MRS)
                .enterFirstNamePI(randomString(NAME, 10))
                .enterLastNamePI(randomString(SURNAME, 10))
                .checkEmailField(authenticationPage.getEmail())
                .enterPassword(randomString(PASSWORD, 8))
                .selectDateOfBirth(
                        randomInt(DAY_OF_BIRTH, 1, 20),
                        randomMonthPicker(MONTH_OF_BIRTH),
                        randomInt(YEAR_OF_BIRTH, 1990, 1994))
                .enterFirstName(randomString(NAME, 10))
                .enterLastname(randomString(SURNAME, 10));
    }
}