package lv.bvef.ui.pageobjects;

import lv.bvef.ui.utils.YamlFile;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.hamcrest.Matchers.is;

public class UserPanel {

    private YamlFile yamlFile = YamlFile.getInstance();

    public UserPanel checkIfUserIsLoggedIn() {
        assertThat(getWebDriver().getCurrentUrl(), is(equalTo(yamlFile.config.getLoggedInUrl())));
        return this;
    }
}
