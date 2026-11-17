package es.iesteis.prog.ud4;

/**
 * Modela una línea de un plano representada por dos puntos
 */
public class Linea {
    private Punto punto1, punto2;

    /**
     * Crea la línea con los dos puntos en (0,0)
     */
    public Linea(){
        punto1 = new Punto(0,0);
        punto2 = new Punto(0,0);
    }

    /**
     * Crea la línea usando los dos puntos recibidos
     */
    public Linea(Punto p1, Punto p2){
        punto1 = p1;
        punto2 = p2;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    /**
     * Desplaza la línea hacia la derecha la distancia indicada
     * derecha => sumando en el eje x
     */
    public void moverDerecha(int distancia){
        //Sumamos a cada punto la distancia indicada en el eje x.
        punto1.desplaza(distancia, 0);
        punto2.desplaza(distancia, 0);
    }

    /**
     * Desplaza la línea hacia la izquierda la distancia indicada
     * izquierda => restando en el eje x
     */
    public void moverIzquierda(int distancia){
        //Restamos a cada punto la distancia indicada en el eje x (desplazamos con x negativo).
        punto1.desplaza(-distancia, 0);
        punto2.desplaza(-distancia, 0);
    }

    /**
     * Desplaza la línea hacia arrina la distancia indicada
     * arriba => sumar al eje y
     */
    public void moverArriba(int distancia){
        punto1.desplaza(0, distancia);
        punto1.desplaza(0, distancia);
    }

    /**
     * Desplaza la línea hacia abajo la distancia indicada
     */
    public void moverAbajo(int distancia){
        punto1.desplaza(0, -distancia);
        punto2.desplaza(0, -distancia);
    }

    public void printLinea(){
        //Lo hago con IO en lugar de System.out (ya explicado)
        IO.println("Punto 1 - " + punto1);
        IO.println("Punto 2 - " + punto2);
    }
}
