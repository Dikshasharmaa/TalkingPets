package io.zipcoder.polymorphism;

public class Hamster extends Pet {
    public Hamster(String name){
        super(name);
    }
    public Hamster(){
        super();
    }


    @Override
    public String speak() {
        return "cho cho";
    }

}
