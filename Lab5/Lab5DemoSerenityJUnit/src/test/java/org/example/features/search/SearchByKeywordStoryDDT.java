package org.example.features.search;


import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.example.steps.serenity.EndUserSteps;
import org.example.steps.serenity.NewEndUserSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("src/test/resources/WikiTestData.csv")
public class SearchByKeywordStoryDDT {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @Steps
    public NewEndUserSteps endUser;
    public String type;
    public String title;

    @Qualifier
    public String getQualifier() {
        return type;
    }


    @Issue("#WIKI-1")
    @Test
    public void functionalities() {

        endUser.is_the_home_page();
        String tempType = getType();
        if (Objects.equals(tempType, "Lang")){
            endUser.switchLang();
        } else {
            endUser.goToPage();
        }
        endUser.shouldSeeTitle(getTitle());
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
