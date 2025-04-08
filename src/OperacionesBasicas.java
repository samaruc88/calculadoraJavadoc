/**
 * Classe que implementa operacions matemàtiques bàsiques.
 * <p>
 * Aquesta classe proporciona les quatre operacions bàsiques:
 * suma, resta, multiplicació i divisió.
 * </p>
 * 
 * <h2>@author Antonio</h2>
 * @version 1.0
 */
public class OperacionesBasicas {

    /**
     * Fa la suma de dos nombres.
     * 
     * @param a Primer número
     * @param b Segon número
     * @return Resultat de la suma
     */
    public double sumar(double a, double b) {
        return a + b;
    }

    /**
     * Fa la resta de dos números.
     * 
     * @param a Prímer número
     * @param b Segon número
     * @return Resultat de la resta
     */
    public double restar(double a, double b) {
        return a - b;
    }

    /**
     * Fa la multiplicació de dos números.
     * 
     * @param a Primer número
     * @param b Segon número
     * @return Multiplicació dels dos números
     */
    public double multiplicar(double a, double b) {
        return a * b;
    }

    /**
     * Fa la divisió de dos números.
     * 
     * @param a Dividend
     * @param b Divisor
     * @return Resultat de la divisió
     * @throws ArithmeticException Si el divisor és zero (no és pot dividir)
     */
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
