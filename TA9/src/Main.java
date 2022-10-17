
import ut3.ta2.ManejadorArchivosGenerico;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TArbolBB arbol = new TArbolBB();

      // cargar los productos desde el archivo "altasprueba.txt"
      Almacen almacen = new Almacen("Geant");
       String[] altas = ManejadorArchivosGenerico.leerArchivo("src/altasprueba.txt");
        for (String alta : altas) {
            String[] separado = alta.split(",");
            Producto nuevo = new Producto(separado[0],separado[1]);
            nuevo.setPrecio(Integer.parseInt(separado[2]));
            nuevo.setStock(Integer.parseInt(separado[3]));
            almacen.insertarProducto(nuevo);
            
        }
      // listar los productos ordenados por codigo, junto con su cantidad existente
      
        System.out.println(almacen.imprimirProductos());
      //emitir el valor del stock
      // simular las ventas a partir del archivo "ventaspruebas.txt"
      // simular la eliminación de productos a partir del archivo "elimPrueba.txt"
      // listar los productos ordenados por codigo, junto con su cantidad existente

    }
}

