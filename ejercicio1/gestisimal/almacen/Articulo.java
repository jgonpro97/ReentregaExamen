package gestisimal.almacen;

import java.util.InputMismatchException;

/**
 * Clase Articulo con los atributos principales
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Articulo {
  private static int cont = 1;
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;
  private TipoIva iva;

  /**
   * Constructor de Articulo
   * 
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @param iva
   * @throws ValorNoValidoException
   * @throws IvaInvalidoException
   */
  Articulo(String descripcion, double precioCompra, double precioVenta, int stock, TipoIva iva)
      throws ValorNoValidoException, IvaInvalidoException {
    setDescripcion(descripcion);
    setPrecioCompra(precioCompra);
    setPrecioVenta(precioVenta);
    setStock(stock);
    setIva(iva);
    setCodigo(codigo);
  }

  /**
   * Constructor solo pasandole el codigo
   * 
   * @param codigo
   */
  Articulo(int codigo) {
    this.codigo = codigo;
  }

  int getCodigo() {
    return codigo;
  }

  void setCodigo(int codigo) {
    this.codigo = Articulo.cont++;
  }

  String getDescripcion() {
    return descripcion;
  }

  public TipoIva getIva() {
    return iva;
  }

  public void setIva(TipoIva iva) throws IvaInvalidoException {
    if (iva == null) {
      throw new IvaInvalidoException("\nNo ha introducido el iva\n");
    }

    this.iva = iva;
  }

  void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  double getPrecioCompra() {
    return precioCompra;
  }

  void setPrecioCompra(double precioCompra) throws ValorNoValidoException {
    if (precioCompra < 0) {
      throw new ValorNoValidoException("\nEl precio de compra no puede ser menor de 0\n");
    }

    this.precioCompra = precioCompra;

  }

  double getPrecioVenta() {
    return precioVenta;
  }

  void setPrecioVenta(double precioVenta) throws ValorNoValidoException {
    if (precioVenta < 0) {
      throw new ValorNoValidoException("\nEl precio de venta no puede ser menor de 0\n");
    }

    this.precioVenta = precioVenta;
  }

  int getStock() {
    return stock;
  }

  void setStock(int stock) throws ValorNoValidoException {
    if (stock < 0) {
      throw new ValorNoValidoException("\nEl stock no puede ser menor de 0\n");
    }

    this.stock = stock;
  }

  /**
   * Metodo para aumento del stock
   * 
   * @param num
   * @throws ValorNoValidoException
   */
  void aumentarStock(int num) throws ValorNoValidoException {
    if (num < 0) {
      throw new ValorNoValidoException("\nEl stock no puede ser menor de 0\n");
    }

    setStock(stock + num);
  }

  /**
   * Metodo para decremento del stock
   * 
   * @param num
   * @throws ValorNoValidoException
   */
  void decrementarStock(int num) throws ValorNoValidoException {
    if (num < 0) {
      throw new ValorNoValidoException("\nEl stock no puede ser menor de 0\n");
    }

    setStock(stock - num);
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + codigo;
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
    Articulo other = (Articulo) obj;
    if (codigo != other.codigo)
      return false;
    return true;
  }

  /**
   * Metodo set para modificar el articulo
   * 
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @param iva
   * @throws ValorNoValidoException
   * @throws IvaInvalidoException
   */
  void set(String descripcion, double precioCompra, double precioVenta, int stock, TipoIva iva)
      throws ValorNoValidoException, IvaInvalidoException {
    setDescripcion(descripcion);
    setPrecioCompra(precioCompra);
    setPrecioVenta(precioVenta);
    setStock(stock);
    setIva(iva);
  }

  @Override
  public String toString() {

    StringBuilder sb = new StringBuilder();

    sb.append("\n****************************");
    sb.append("\nCódigo: " + this.codigo);
    sb.append("\nDescripcion: " + this.descripcion);
    sb.append("\nPrecio de compra: " + this.precioCompra);
    sb.append("\nPrecio de venta: " + this.precioVenta);
    sb.append("\nStock: " + this.stock);
    sb.append("\nTipo de iva: " + this.iva);
    sb.append("\n****************************\n");

    return sb.toString();

  }
}
