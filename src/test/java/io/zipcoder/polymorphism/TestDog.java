package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class TestDog {
    @Test
    public void DogSpeak(){
        String speak = "Bark!";
        Dog dog = new Dog();
        Assert.assertEquals(speak, dog.speak());
    }

    @Test
    public void NameTest(){
        String name = "Tiger";
        Dog dog = new Dog();
        dog.setName(name);
        Assert.assertEquals(name,dog.getName());
    }

    @Test
    public void TestInheritance(){
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Pet);

    }
}
