/**
 * Classe principal que representa una calculadora amb operacions bàsiques i avançades.
 * <p>
 * En aquesta classe es pot accedir a totes les funcionalitats
 * de la calculadora, agrupant-les en operacions bàsiques i avançades.
 * </p>
 * 
 * <h2>@author Antonio</h2>
 * @version 1.0
 * @see OperacionesBasicas
 * @see OperacionesAvanzadas
 */
public class Calculadora {
    private OperacionesBasicas basicas;
    private OperacionesAvanzadas avanzadas;
     /**
     * Inicialitza operacions bàsiques i avançades.
     */
    public Calculadora() {
        this.basicas = new OperacionesBasicas();
        this.avanzadas = new OperacionesAvanzadas();
    }
    /**
     * Obté l'objecte que conté les operacions bàsiques.
     * 
     * @return Instància de {@link OperacionesBasicas} amb les operacions bàsiques
     */
    public OperacionesBasicas getBasicas() {
        return basicas;
    }
    /**
     * Obté l'objecte que conté les operacions avançades.
     * 
     * @return Instància de {@link OperacionesAvanzadas} amb les operacions avançades
     */
    public OperacionesAvanzadas getAvanzadas() {
        return avanzadas;
    }
}