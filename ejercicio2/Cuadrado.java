package ejercicio2;

/**
 * Clase Cuadrado, hereda de Rectangulo.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 *
 */
public class Cuadrado extends Rectangulo implements Comparable<Cuadrado> {
  
  /**
   * Constructor de Cuadrado
   * @param lado
   */
  public Cuadrado(int lado) {
    super(lado, lado);
  }

  public int getLado() {
    return this.getAncho();
  }

  public String toString() {
    return super.toString();
  }
  
  /**
   * Metodo compareTo para la comparacion de Cuadrados
   */
  @Override
  public int compareTo(Cuadrado other) {
    if (this.getLado() < other.getLado()) {
      return -1;
    }

    else if (this.getLado() > other.getLado()) {
      return 1;
    }

    else {
      return 0;
    }

  }

}
