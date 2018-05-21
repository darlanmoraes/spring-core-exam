package com.darlan.exam.container_dependency_ioc.conditions;

import com.darlan.exam.container_dependency_ioc.conditionals.Bean;
import com.darlan.exam.container_dependency_ioc.conditionals.Config;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class })
@TestPropertySource(properties = { "condition.a = true" })
public class ConditionsTest {

    @Autowired
    private Bean bean;

    @Test
    public void testProfile() {
        Assert.assertEquals("BeanA{}", bean.toString());
    }

}
