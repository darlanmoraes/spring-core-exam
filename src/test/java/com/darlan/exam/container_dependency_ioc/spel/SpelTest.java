package com.darlan.exam.container_dependency_ioc.spel;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class SpelTest {

    @Value("#{T(java.lang.Math).random()}")
    private Float random;
    @Value("#{T(java.lang.Math).PI ge 2}")
    private Boolean piGreaterThan2;
    @Value("#{null ?: 'Simple String'}")
    private String simpleString;
    @Value("#{'Simple String'[2]}")
    private String thirdyCharacter;

    @Test
    public void testValues() {
        Assert.assertNotNull(random);
        Assert.assertTrue(piGreaterThan2);
        Assert.assertEquals("Simple String", simpleString);
        Assert.assertEquals("m", thirdyCharacter);
    }

}
