package entities;

public class Pato extends Ave{

    public Pato(int age, String size, String featherColor){
        super(age,size,featherColor);
    }

    @Override
    public String emitSound() {
        return "Pato está grasnindo!!!";
    }
}
