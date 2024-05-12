package org.example.steps.serenity;

import org.example.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.example.pages.EmagPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

public class NewEndUserSteps {

    EmagPage emagPage;

    @Step
    public void switchLang() {
        emagPage.switchLanguage();
    }

    @Step
    public void goToPage() {
        emagPage.specificPage();
    }

    @Step
    public void shouldSeeTitle(String definition) {
        assertThat(emagPage.getTitle(), containsString(definition));
    }

    @Step
    public void is_the_home_page() {
        emagPage.open();
    }
}