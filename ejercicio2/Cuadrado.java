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
  
  public void setLado(int lado) {
    setAncho(lado);
    setAlto(lado);
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long temp;
    temp = Double.doubleToLongBits(getLado());
    result = prime * result + (int) (temp ^ (temp >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Cuadrado other = (Cuadrado) obj;
    if (Double.doubleToLongBits(getLado()) != Double.doubleToLongBits(other.getLado()))
      return false;
    return true;
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
