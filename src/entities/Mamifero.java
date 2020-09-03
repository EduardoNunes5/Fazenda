package entities;

/**
 * Classe abstrata que representa um mamifero.
 * Estende animal, portanto possui idade e tamanho. Por ser um animal,
 * possui pelos e tambem capacidade de amamentar.
 */
public abstract class Mamifero extends Animal{

    /**
     * Cor dos pelos.
     */
    private String furColor;

    /**
     * Constroi um mamifero a partir da sua idade, tamanho e cor de pelo.
     * @param age int - Idade do mamifero.
     * @param size String - tamanho do mamifero.
     * @param furColor String - cor dos pelos do mamifero.
     */
    public Mamifero(int age, String size, String furColor){
        super(age, size);
        this.furColor = furColor;
    }

    /**
     * Metodo que retorna a representacao textual de um mamifero amamentando.
     * @return String - Texto representativo de amamentacao.
     */
    public String amamentar(){
        return "Mamífero amamentando...";
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cor do pelo:  ");
        sb.append(this.furColor);
        return super.toString() + sb.toString();
    }
}
