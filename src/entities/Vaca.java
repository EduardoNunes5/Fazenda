package entities;

/**
 * Classe representando uma Vaca. Vaca estende mamifero,
 * portanto, possui idade, tamanho e cor de pelos.
 */
public class Vaca extends Mamifero{
    /**
     * Construtor de Vaca atraves de sua idade, tamanho e cor de pelo.
     * @param age int - idade
     * @param size String - tamanho
     * @param furColor String - cor do pelo
     */
    public Vaca(int age, String size, String furColor) {
        super(age, size, furColor);
    }

    /**
     * Metodo que retorna a representacao textual da emicao de som de uma Vaca
     * @return String - representacao textual do som de vaca.
     */
    @Override
    public String emitirSom() {
        return "~~mugido....";
    }
}
