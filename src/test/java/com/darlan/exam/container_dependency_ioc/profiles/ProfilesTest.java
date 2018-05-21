package com.darlan.exam.container_dependency_ioc.profiles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ActiveProfiles("component-a")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class })
public class ProfilesTest {

    @Autowired
    private Component component;

    @Test
    public void testProfile() {
        Assert.assertEquals("ComponentA{}", component.toString());
    }

}
