package com.darlan.exam.container_dependency_ioc.ambiguity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class })
public class AmbiguityTest {

    @Autowired
    @QualifierA
    private Pojo pojo;

    @Test
    public void testAmbiguity() {
        Assert.assertEquals("PojoA{}", pojo.toString());
    }

}
