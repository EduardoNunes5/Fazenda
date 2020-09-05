package entities;

/**
 * Interface que obriga qualquer classe que a implemente, sobrescreva seu metodo de voar.
 */
public interface Voador {
    /**
     * Metodo que retorna uma String representando o voo de um objeto capaz de voar.
     * @return String - cadeira de caracteres representativa de um objeto voador.
     */
    String voar();
}
