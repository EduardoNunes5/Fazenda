package entities;

/**
 * Classe abstrata que representa um animal.
 * Todo animal deve ter uma idade e um tamanho
 */
public abstract class Animal {

    /**
     * Idade do animal.
     */
    private int age;
    /**
     * Tamanho do animal.
     */
    private String size;

    /**
     * Constroi um objeto do tipo animal com seu respectivo tamanho e sua idade.
     * @param age int - idade do animal.
     * @param size String - tamanho do animal.
     */
    public Animal(int age, String size){
        this.age = age;
        this.size = size;
    }

    /**
     * TODO
     * @return String - Representa o som emitido pelo animal.
     */
    public abstract String emitirSom();

    /**
     * Representacao textual de um objeto do tipo animal.
     * @return String - Representa o texto de um animal.
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Idade: ");
        sb.append(this.age + "\n");
        sb.append("Tamanho: ");
        sb.append(this.size + "\n");
        return sb.toString();
    }
}
