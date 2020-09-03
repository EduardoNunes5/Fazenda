package entities;

/**
 * Classe concreta que representa uma galinha. Ela estende ave,
 * portanto possui todos os seus metodos e implementa seu metodo de emitir som.
 */
public class Galinha extends Ave{

    /**
     * Constroi um objeto Galinha com sua idade, tamanho e cor de pena
     * @param age int - Idade da galinha.
     * @param size int - Tamanho da galinha.
     * @param featherColor  String - cor da pena da galinha.
     */
    public Galinha(int age, String size, String featherColor){
        super(age, size, featherColor);
    }

    /**
     * Representacao textual do ato da galinha emitir som.
     * @return String - Representacao do som que a galinha faz.
     */
    @Override
    public String emitirSom() {
        return "~cacarejo...";
    }
}
