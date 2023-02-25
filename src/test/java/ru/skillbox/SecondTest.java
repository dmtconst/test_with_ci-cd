package ru.skillbox;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SecondTest {
    public String exited = "111";

    @Test
    public void check(){
        Assertions.assertEquals(exited,"111");
    }

    @Test
    void amazon(){
        open("https://amazon.com");
        $("#twotabsearchtextbox").setValue("Harry Potter").pressEnter();
        $$("[data-component-type=s-search-result]").first()
                .shouldHave(text("Harry Potter"));
    }
}
