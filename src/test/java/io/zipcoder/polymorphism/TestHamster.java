package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestHamster {
    @Test
    public void HamsterSpeak(){
        String speak = "cho cho";
        Hamster hamster = new Hamster();
        Assert.assertEquals(speak, hamster.speak());
    }

    @Test
    public void NameTest(){
        String name = "leo";
        Hamster ham = new Hamster();
        ham.setName(name);
        Assert.assertEquals(name,ham.getName());
    }

    @Test
    public void TestInheritance(){
        Hamster ham = new Hamster();
        Assert.assertTrue(ham instanceof Pet);

    }
}
