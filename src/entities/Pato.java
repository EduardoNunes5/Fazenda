package entities;

/**
 * Representacao de um pato estendendo Ave e implementando Voador.
 * Todo pato possui pena, idade e tamanho.
 */
public class Pato extends Ave implements Voador{

    /**
     * Constroi um pato a partir de sua idade, tamanho e cor de pena.
     * @param age int - Idade.
     * @param size String - Tamanho.
     * @param featherColor String - Cor da pena.
     */
    public Pato(int age, String size, String featherColor){
        super(age,size,featherColor);
    }

    /**
     * Implementacao do metodo voar imposto pela interface Voador.
     * @return String - representacao textual de um pato voando.
     */
    @Override
    public String voar(){
       return "*voando*";
    }

    /**
     * Retorna a representacao textual da emicao de som de um pato.
     * @return String - representacao textual do som de pato.
     */
    @Override
    public String emitirSom() {
        return String.format("~~grasnido !!!");
    }
}
