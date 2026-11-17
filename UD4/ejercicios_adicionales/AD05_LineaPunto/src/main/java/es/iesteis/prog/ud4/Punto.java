package es.iesteis.prog.ud4;

/**
 * Representa a un punto en el espacio bidimensional
 * 
 * @author 
 * @version 
 */
public class Punto 
{
	private int x;
	private int y;

	/**
	 * Constructor de la clase Punto
	 */
	public Punto(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * Accesor para el atributo x
	 * @return  El valor de la coordenada x   
	 */
	public int getX() 
	{
		return x;
	}

	/**
	 * Accesor para el atributo y
	 * @return  El valor de la coordenada y   
	 */
	public int getY()
	{
		return y;
	}

	/**
	 * 
	 *  Mutador para la coordenada x
	 * @param x es el nuevo valor de x
	 */
	public void setX(int x)
	{
		this.x = x;
	}

	/**
	 * Mutador para la coordenada y
	 * @param  y es el nuevo de y  
	 */
	public void setY(int y) 
	{
		this.y = y;
	}
	
	
	/**
	 * @return  Devuelve una cadena con la representación del 
	 *          punto
	 */
	public String toString() 
	{
		String str = "";
		str = str + "Valor de x = " + x + "\n" + "Valor de y = " + y + "\n";
		return str;
	}

    /**
	 * Devuelve la distancia del punto al origen (0,0)
	 */
	public double getDistanciaDesdeOrigen(){
		return Math.sqrt(x*x + y*y);
	}

	/**
	 * Devuelve la distancia entre el punto actual y el punto p
	 */
	public double getDistanciaDesde(Punto p){
		//Uso variables para simplificar la expresión de la fórmula
		int diferenciasX = this.x - p.getX();
		int diferenciasY = this.y - p.getY();

		//Esta vez uso Math.pow
		return Math.sqrt(Math.pow(diferenciasX,2) + Math.pow(diferenciasY,2));
	}

	/**
	 * Añadido AD05: Permite desplazar el punto en el plano las distancia
	 * indicada por los parámetros
	 */
	public void desplaza(int distanciaX, int distanciaY){
		x += distanciaX;
		y += distanciaY;
	}

	static void main(String[] args) {
		//Podéis hacer las pruebas de esta clase aquí, creando una instancia de Punto.
		Punto punto1 = new Punto(5, 10);
		Punto punto2 = new Punto(-3, 12);

		System.out.println("Punto 1: ");
		System.out.println(punto1); //Como tiene toString, no hace falta indicar explícitamente la llamada

		System.out.println("Punto 2: ");
		System.out.println(punto2);
	}

}
