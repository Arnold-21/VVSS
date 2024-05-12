package org.example.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;
import java.util.stream.Collectors;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;

@DefaultUrl("https://www.cs.ubbcluj.ro/")
public class EmagPage extends PageObject {

    @FindBy(id="menu-item-8324-en")
    private WebElementFacade englishButton;

    @FindBy(id="menu-item-11165")
    private WebElementFacade despreButton;

    @FindBy(id="menu-item-11166")
    private WebElementFacade conducereButton;

    @FindBy(id="menu-item-96")
    private WebElementFacade facultateButton;

    @FindBy(name="go")
    private WebElementFacade lookupButton;

    public void switchLanguage() {
        englishButton.click();
    }

    public void specificPage() {
        despreButton.click();
        conducereButton.click();
        facultateButton.click();
    }

    public String getTitle() {
        WebElementFacade title = find(By.className("title"));
        return title.getText();
    }


}