package ejercicio2;

/**
 * Clase para llevar a cabo las pruebas con la clase Cuadrado.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 *
 */
public class TestCuadrado {

  public static void main(String[] args) {
    try {

      Cuadrado cuadrado = new Cuadrado(7);
      Cuadrado cuadrado2 = new Cuadrado(7);

      System.out.println("Primer cuadrado");
      System.out.println("\n" + cuadrado);
      System.out.println("Segundo cuadrado");
      System.out.println("\n" + cuadrado2);
      System.out.println("Comparacion de cuadrados: " + cuadrado.compareTo(cuadrado2));

    } catch (ArithmeticException e) {
      System.err.println(e.getMessage());
    }
  }
}
