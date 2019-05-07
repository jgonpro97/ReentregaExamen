package ejercicio2;

/**
 * Clase Rectangulo del Ejercicio 2 del examen de Java. Crea un rectangulo con
 * dimensiones entre 1 y 10, y con el metodo toString se dibuja.
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 *
 */
public class Rectangulo {
  private int ancho;
  private int alto;

  public Rectangulo(int ancho, int alto) {
    setAncho(ancho);
    setAlto(alto);
  }

  public int getAncho() {
    return ancho;
  }

  private void setAncho(int ancho) {
    if (ancho <= 0 || ancho > 10) {
      throw new ArithmeticException("Valores del alto y ancho entre 1 y 10");
    }

    this.ancho = ancho;

  }

  public int getAlto() {
    return alto;
  }

  private void setAlto(int alto) {
    if (alto <= 0 || alto > 10) {
      throw new ArithmeticException();
    }

    this.alto = alto;
  }

  public String toString() {
    int i, espacios;
    String resultado = "";
    
    for (i = 0; i < this.ancho; i++) {
      resultado += "*";
    }
    
    resultado += "\n";
    
    for (i = 1; i < this.alto - 1; i++) {
      resultado += "*";
      
      for (espacios = 1; espacios < this.ancho - 1; espacios++) {
        resultado += " ";
      }
      
      resultado += "*\n";
    }
    
    for (i = 0; i < this.ancho; i++) {
      resultado += "*";
    }
    
    resultado += "\n";

    return resultado;
  }
}
