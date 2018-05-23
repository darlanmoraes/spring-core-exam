package com.darlan.exam.aspect_oriented_programming.around;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { Config.class })
public class AroundTest {

    @Autowired
    private Pojo pojo;
    @Autowired
    private AspectA aspectA;

    @Test
    public void testAround() {
        pojo.toString("s1");
        pojo.toString("s1");
        pojo.toString("s2");
        pojo.toString("s1");
        pojo.toString("s3");
        pojo.toString("s3");

        Assert.assertEquals(Integer.valueOf(3), aspectA.getCount("s1"));
        Assert.assertEquals(Integer.valueOf(1), aspectA.getCount("s2"));
        Assert.assertEquals(Integer.valueOf(2), aspectA.getCount("s3"));

    }

}
