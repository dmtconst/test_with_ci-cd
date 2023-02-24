package ru.skillbox;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SecondTest {
    public String exited = "111";

    @Test
    public void check(){
        Assertions.assertEquals(exited,"111");
    }
}
