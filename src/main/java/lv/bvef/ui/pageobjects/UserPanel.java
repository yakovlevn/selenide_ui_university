package lv.bvef.ui.pageobjects;

import static lv.bvef.ui.utils.YamlReader.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class UserPanel {

    public UserPanel checkIfUserIsLoggedIn() {
        assertThat(getWebDriver().getCurrentUrl(), is(equalTo(config.getLoggedInUrl())));
        return this;
    }
}
