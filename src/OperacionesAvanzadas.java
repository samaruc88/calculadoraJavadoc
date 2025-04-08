/**
 * Classe que implementa operacions matemàtiques avançades.
 * <p>
 * Aquesta classe proporciona cuatre operacions avançades com 
 * potències, arrels quadrades,mòduls i valors absoluts.
 * </p>
 * 
 * <h2>@author Antonio</h2>
 * @version 1.0
 */
public class OperacionesAvanzadas {
    /**
     * Calcula la potència d'un número.
     * 
     * @param base Número base de la potència
     * @param exponente Número exponent de la potència
     * @return Resultat d'elevar la base a l'exponent
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
    /**
     * Calcula l'arrel quadrada d'un número.
     * 
     * @param numero Número que es vol calcular l'arrel quadrada
     * @return Arrel quadrada del número proporcionat
     * @throws IllegalArgumentException Si el número és negatiu (no existeix arrel)
     */
    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No existe raíz real de números negativos");
        }
        return Math.sqrt(numero);
    }
    /**
     * Calcula el residu de la divisió entre dos números.
     * 
     * @param dividendo Número que es dividirà
     * @param divisor Número pel que es dividirà
     * @return Residu de la divisió
     * @throws ArithmeticException Si el divisor és zero (no és pot dividir per zero)
     */
    public double modulo(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return dividendo % divisor;
    }
    /**
     * Calcula el valor absolut d'un número.
     * 
     * @param numero Número pel que es vol obtindre el valor absolut
     * @return Valor absolut del número proporcionat
     */
    public double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }
}
