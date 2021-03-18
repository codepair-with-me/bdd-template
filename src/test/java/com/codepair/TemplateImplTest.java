package com.codepair;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TemplateImplTest {

    @Autowired
    TemplateImpl templateImpl;

    @Test
    @Description("Testing Get Response for Hello")
    public void getResponseHello() {
        Assert.assertEquals("Hi",templateImpl.getResponse("Hello"));
    }

    @Test
    @Description("Testing Get Response for Bye")
    public void getResponseBye() {
        Assert.assertEquals("Bye Bye!!",templateImpl.getResponse("Bye"));
    }

    @Test
    @Description("Testing Get Response for Others")
    public void getResponseOthers() {
        Assert.assertEquals("Undefined",templateImpl.getResponse("Any Text"));
    }
}