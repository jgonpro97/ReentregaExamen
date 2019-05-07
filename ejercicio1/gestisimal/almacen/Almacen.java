package gestisimal.almacen;

import java.util.ArrayList;

/**
 * Clase Almacen gestionar el funcionamiento del almacen
 * 
 * @author Juan Manuel Gonzalez Profumo
 * @version 1.0
 */
public class Almacen {

  private ArrayList<Articulo> arraylist = new ArrayList<Articulo>();

  /**
   * Metodo para añadir un articulo al almacen
   * 
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @param iva
   * @throws ArticuloExisteException
   * @throws ValorNoValidoException
   * @throws IvaInvalidoException
   */
  public void annadirArticulo(String descripcion, double precioCompra, double precioVenta, int stock, TipoIva iva)
      throws ArticuloExisteException, ValorNoValidoException, IvaInvalidoException {
    Articulo articulo = new Articulo(descripcion, precioCompra, precioVenta, stock, iva);

    if (arraylist.contains(articulo)) {
      throw new ArticuloExisteException("\nEl articulo ya existe en el almacen\n");
    }

    arraylist.add(articulo);
  }

  /**
   * Metodo para borrar un articulo segun su codigo
   * 
   * @param codigo
   * @return
   */
  public boolean borrarArticulo(int codigo) {
    return arraylist.remove(new Articulo(codigo));
  }

  /**
   * Metodo para la modificacion del articulo
   * 
   * @param articulo
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @param iva
   * @throws ValorNoValidoException
   * @throws IvaInvalidoException
   */
  public void modificarArticulo(Articulo articulo, String descripcion, double precioCompra, double precioVenta,
      int stock, TipoIva iva) throws ValorNoValidoException, IvaInvalidoException {
    articulo.set(descripcion, precioCompra, precioVenta, stock, iva);
    arraylist.set(arraylist.indexOf(articulo), arraylist.get(arraylist.indexOf(articulo)));
  }

  /**
   * Metodo para obtener el codigo del articulo
   * 
   * @param codigo
   * @return
   * @throws CodigoNoValidoException
   */
  public Articulo get(int codigo) throws CodigoNoValidoException {
    try {

      return arraylist.get(arraylist.indexOf(new Articulo(codigo)));

    } catch (IndexOutOfBoundsException e) {
      throw new CodigoNoValidoException("\nEl codigo del articulo no esta en el almacen\n");
    }
  }

  /**
   * Metodo para el aumento del stock
   * 
   * @param codigo
   * @param numero
   * @throws ValorNoValidoException
   */
  public void aumentarStock(int codigo, int numero) throws ValorNoValidoException {
    Articulo articulo = arraylist.get(arraylist.indexOf(new Articulo(codigo)));
    articulo.aumentarStock(numero);
  }

  /**
   * Metodo para el decremento del stock
   * 
   * @param codigo
   * @param numero
   * @throws ValorNoValidoException
   */
  public void decrementarStock(int codigo, int numero) throws ValorNoValidoException {
    Articulo articulo = arraylist.get(arraylist.indexOf(new Articulo(codigo)));
    articulo.decrementarStock(numero);
  }

  @Override
  public String toString() {
    return "Almacen: \n" + arraylist;
  }

}
