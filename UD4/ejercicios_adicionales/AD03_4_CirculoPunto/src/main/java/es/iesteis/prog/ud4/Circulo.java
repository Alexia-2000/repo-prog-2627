package es.iesteis.prog.ud4;

/**
 * La clase representa círculos con un centro
 * y un valor determinado de radio
 * 
 * @author 
 * @version 
 */
public class Circulo
{
    //Ahora que conocemos static, lo definimos cmo constante de clase (el valor de PI no cambia entre instancias)
    private static final double PI = 3.14;
    private double radio;
    private Punto centro;

     /**
     * constructor para los objetos de la clase Circulo
     * Crea un círculo dado un radio y un centro ya existente
     */
    public Circulo(double radio, Punto centro)
    {
       //Podría ser interesante validar que el centro no es null con una aserción
       assert centro != null : "El punto centro debe estar inicializado";

       this.radio = radio;
       this.centro = centro;
    }

    /**
     * Crea un Círculo con el radio recibido y con centro en (0,0)
     */
    public Circulo(double radio){
        this.radio = radio;
        centro = new Punto(0,0);
    }
    
   
    /**
     * 
     * @return devuelve el radio del círculo
     */
    public double getRadio()
    {
        return radio;
    }

    /**
     * Devuelve el objeto Punto que representa el centro
     */
    public Punto getCentro(){
        return centro;
    }
    
        
      /**
     * 
     * @param nuevoRadio el nuevo valor del radio
     */
    public void setRadio(int nuevoRadio)
    {
        radio = nuevoRadio;
    }

    /**
     * Modifica el valor de la coordenada x del centro
     */
    public void setCentroX(int x){
        centro.setX(x);
    }

    public void setCentroY(int y){
        centro.setY(y);
    }
    
    /**
     * @return devuelve el área del círculo
     */
    public double calcularArea()
    {
        return 2 * PI * radio * radio;
    }
    
    /**
     * @return devuelve el perímetro del círculo
     */
    public double calcularPerimetro()
    {
        return 2 * PI * radio;
    }
    
    public String toString(){
        return "Radio: " + radio +
                "\nCentro: " + centro; //No es necesario poner explícita la llamada a toString.
    }

    /**
     * Visualiza el círculo por pantalla
     * Debería ir en otra clase (separar la vista del modelo)
     */
    public void printCirculo(){
        System.out.println(this); // equivale a System.out.println(this.toString), pero de nuevo no es necesaria la llamada

        //También valdría llamar a toString sin this. Por defecto, sin indicar instancia, es this
        //System.out.println(toString());
    }
}
