package ejercicio2;

/**
 * Clase para prueba con la clase Rectangulo.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class TestRectangulo {

  public static void main(String[] args) {
    try {

      Rectangulo rectangulo = new Rectangulo(5, 4);
      
      System.out.println("Rectangulo de ancho " + rectangulo.getAncho() + " y alto de " + rectangulo.getAlto());
      System.out.println("\n" + rectangulo);

    } catch (ArithmeticException e) {
      System.err.println(e.getMessage());
    }
  }
}
