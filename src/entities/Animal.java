package entities;

public abstract class Animal {

    private int age;
    private String size;

    public Animal(int age, String size){
        this.age = age;
        this.size = size;
    }
    public abstract String emitSound();
}
