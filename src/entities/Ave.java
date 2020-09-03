package entities;

/**
 * Classe abstrata que representa uma Ave e estende animal.
 * Como todo animal, ave deve ter tamanho e idade, mas tambem possui cor de pena.
 * Objetos do tipo Ave são capazes de por ovo
 */
public abstract class Ave extends Animal{
    /**
     * Cor da pena da ave
     */
    private String featherColor;

    /**
     * Constroi um objeto do tipo ave com sua idade, tamanho e cor de pena.
     * @param age int - Idade da ave.
     * @param size String - Tamanho da ave.
     * @param featherColor String - cor da ave.
     */
    public Ave(int age, String size, String featherColor){
        super(age,size);
        this.featherColor = featherColor;
    }

    /**
     * Metodo que retorna uma string representando a ave pondo ovo
     * @return String - representacao da ave pondo ovo
     */
    public String porOvo(){
        return "Ave pondo ovo...";
    }

    /**
     * Representacao textual de uma ave
     * @return String - metodo que retorna a representação da ave em String
     */

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cor da pena: ");
        sb.append(this.featherColor + "\n");
        return super.toString() + sb.toString();
    }
}
