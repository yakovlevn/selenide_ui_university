package lv.bvef.ui.pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class AuthenticationPage {

    private String email;

    public RegistrationPage createAccountWithEmail(String email) {
        setEmail(email);
        $(By.id("email_create")).sendKeys(email);
        $(By.name("SubmitCreate")).click();
        return page(RegistrationPage.class);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}