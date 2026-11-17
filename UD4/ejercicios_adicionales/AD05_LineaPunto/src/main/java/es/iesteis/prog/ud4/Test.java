package es.iesteis.prog.ud4;


public class Test {
    static void main() {
        //Yo creo todo al vuelo, pero se puede hacer paso a paso
        Linea lineaPrueba = new Linea(new Punto(2, 2), new Punto(9, 2));
        lineaPrueba.printLinea();

        //Probamos a moverla y mostramos los resultados
        lineaPrueba.moverDerecha(10);
        IO.println("Movida a la derecha 10 posiciones");
        lineaPrueba.printLinea();


        lineaPrueba.moverAbajo(20);
        IO.println("Movida hacia abajo 20 posiciones");
        lineaPrueba.printLinea();
    }
}
