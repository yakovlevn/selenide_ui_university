package lv.bvef.ui.pageobjects;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
    public AuthenticationPage signIn() {
        $(By.className("login")).click();
        return page(AuthenticationPage.class);
    }
}