package lv.bvef.ui.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static testHelpers.GlobalConstants.LOGGED_IN_URL;


public class UserPanel {

    public UserPanel checkIfUserIsLoggedIn() {
        assertThat(getWebDriver().getCurrentUrl(), is(equalTo(LOGGED_IN_URL)));
        return this;
    }
}
