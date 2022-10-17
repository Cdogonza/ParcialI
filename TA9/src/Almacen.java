
public class Almacen implements IAlmacen {

    private String nombre;
    private String direccion;
    private String telefono;

    private TArbolBB<Producto> productos;

    public Almacen(String nombre) {
        this.nombre = nombre;
        this.productos = new TArbolBB<Producto>();
    }

    @Override
    public void insertarProducto(Producto unProducto) {
        this.productos.insertar(new TElementoAB(unProducto.getEtiqueta(), unProducto));
    }

    @Override
    public String imprimirProductos() {
        
        ILista<Producto> productos = this.productos.inOrden();
        ArrayList<String> toReturn = new ArrayList();
        INodo<Producto> aux = productos.getPrimero();
        while(aux != null) {
            Producto p = aux.getDato();
            toReturn.add(p.getEtiqueta() + p.getNombre() + p.getStock() + p.getPrecio()+ "\n");
            aux = aux.getSiguiente();
        }
        return toReturn.toString();
    }

    @Override
    public Boolean agregarStock(Comparable clave, Integer cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer restarStock(Comparable clave, Integer cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Producto buscarPorCodigo(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarProducto(Comparable clave) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
