package entities;

/**
 * Classe concreta que representa um morcego.
 * Sendo mamifero, possui idade, tamanho e tambem pelos.
 * Implementa interface voador, forcando a implementacao do metodo de voar.
 */
public class Morcego extends Mamifero implements Voador{

    /**
     * Constroi um objeto do tipo Morcego a partir de sua idade, tamanho e cor de peloos.
     * @param age int - idade
     * @param size String - tamanho
     * @param furColor String - cor do pelo
     */
    public Morcego(int age, String size, String furColor) {
        super(age, size, furColor);
    }

    /**
     * Metodo que retorna a representacao textual da emicao de som de um morcego.
     * @return String - representacao textual do som do morcego.
     */
    @Override
    public String emitirSom() {
        return String.format("~farfalhando!", this.getClass());
    }

    /**
     * Implementacao do metodo voar imposto pela interface Voador.
     * @return String - representacao textual do morcego voando.
     */
    @Override
    public String voar() {
        return "~voando";
    }
}
