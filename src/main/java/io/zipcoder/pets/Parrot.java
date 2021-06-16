package io.zipcoder.pets;

public class Parrot extends Pets {



    public Parrot() {
        this.type = "parrot";
        this.name = "";
    }

    public Parrot(String name) {
        super(name);
        this.type = "parrot";
    }


    public void setType(String type) {
        this.type = "parrot";
    }

    public String getType() {
        return type;
    }


    @Override
    public String speak() {
        return "Hello";
    }


}
