package es.iesteis.prog.ud4;

/**
 * La clase modela un número racional, una fracción
 * representada por su numerador y denominador
 *
 */
public class Fraccion {
    private int numerador;
    private int denominador;

    /**
     *
     * Constructor
     */
    public Fraccion() {
        numerador = 0;
        denominador = 0;
    }

    /**
     * constructor para los objetos de la clase Fraccion
     */
    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }


    /**
     * Accesor para el numerador
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Accesor para el denominador
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Mutador para el numerador
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * Mutador para el denominador
     */
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    /**
     * Suma la fracción actual por la que
     * se recibe como parámetro
     *
     * @param otra fracción con la que sumar
     * @return la suma de dos fracciones
     */
    public Fraccion sumar(Fraccion otra) {
        //Para sumar, multiplico los denominadores para buscar un denominador común (aunque no sea mínimo)
        int denominadorResultado = this.denominador * otra.getDenominador();
        int numeradorResultado = this.numerador * otra.getDenominador() + otra.getNumerador() * this.denominador;
        return new Fraccion(numeradorResultado, denominadorResultado);
    }

    /**
     * Resta la fracción actual por la que
     * se recibe como parámetro
     *
     * @param otra fracción con la que se resta
     * @return la resta  de dos fracciones
     */
    public Fraccion restar(Fraccion otra) {
        int denominadorResultado = this.denominador * otra.denominador;
        int numeradorResultado = this.numerador * otra.getDenominador() - otra.getNumerador() * this.getDenominador();
        return new Fraccion(numeradorResultado, denominadorResultado);
    }

    /**
     * Multiplica la fracción actual por la que
     * se recibe como parámetro
     *
     * @param otra fracción por la que se multiplica
     * @return el producto de dos fracciones
     */
    public Fraccion multiplicar(Fraccion otra) {
        return new Fraccion(this.numerador * otra.getNumerador(),
                this.denominador * otra.getDenominador());
    }

    /**
     * Divide la fracción actual entre la que
     * se pasa como parámetro
     *
     * @param otra fracción entre la que se dividirá
     * @return el cociente de dos fracciones
     */
    public Fraccion dividir(Fraccion otra) {
        //Para dividir, multiplicamos en cruz (por la inversa de la Fracción otra)
        return new Fraccion(this.numerador * otra.getDenominador(),
                this.denominador * otra.getNumerador());
    }

    /**
     * Compara dos fracciones, la actual y
     * la recibida como parámetro
     *
     * @param otra la fracción con la que comparar
     * @return true si son iguales
     */
    public boolean igualQue(Fraccion otra) {
        //Fuerzo al casting a double de alguno de los componentes, para asegurar el resultado con decimales
        double esta = (double) numerador / denominador;
        double laOtra = (double) otra.getNumerador() / otra.denominador;

        return  esta == laOtra;
    }

    /**
     * Compara dos fracciones, la actual y
     * la recibida como parámetro
     *
     * @param otra la fracción con la que comparar
     * @return true si la fracción actual es menor que la recibida como parámetro
     */
    public boolean menorQue(Fraccion otra) {
        double esta = (double) numerador / denominador;
        double laOtra = (double) otra.getNumerador() / otra.denominador;

        return  esta < laOtra;
    }

    /**
     *
     * @return la fracción actual clonada
     */
    public Fraccion clonar() {
        return new Fraccion(numerador, denominador);
    }

    /**
     * Representación textual de la fracción
     */

    public String toString() {
        String tmp = numerador + " / " + denominador;
        return tmp;
    }

}
