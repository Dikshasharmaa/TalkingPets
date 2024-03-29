package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestCat {
    @Test
    public void CatSpeak(){
        String speak = "Meow!";
        Cat cat = new Cat();
        Assert.assertEquals(speak, cat.speak());
    }

    @Test
    public void NameTest(){
        String name = "leo";
        Cat cat = new Cat();
        cat.setName(name);
        Assert.assertEquals(name,cat.getName());
    }

    @Test
    public void TestInheritance(){
        Cat cat = new Cat();
        Assert.assertTrue(cat instanceof Pet);

    }


}
