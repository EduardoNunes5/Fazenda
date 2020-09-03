package entities;

public abstract class Ave extends Animal{

    private String featherColor;

    public Ave(int age, String size, String featherColor){
        super(age,size);
        this.featherColor = featherColor;
    }

    public String layEgg(){
        return "Ave pondo ovo...";
    }
}
