package entities;

public abstract class Mamifero extends Animal{

    private String furColor;

    public Mamifero(int age, String size, String furColor){
        super(age, size);
        this.furColor = furColor;
    }

    public String amamentar(){
        return "Mamífero amamentando...";
    }
}
