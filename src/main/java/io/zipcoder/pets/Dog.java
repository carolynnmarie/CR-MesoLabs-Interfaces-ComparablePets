package io.zipcoder.pets;

public class Dog extends Pets {



    public Dog(){
        this.name = "";
        this.type = "dog";
    }

    public Dog(String name) {
        super(name);
        this.type = "dog";
    }


    public void setType(String type) {
        this.type = "dog";
    }


    public String getType() {
        return type;
    }


    @Override
    public String speak() {
        return "Woof";
    }
}
