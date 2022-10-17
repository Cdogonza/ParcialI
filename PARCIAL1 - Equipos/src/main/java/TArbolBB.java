
import java.util.LinkedList;


public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    /**
     * @return recorrida en preOrden del arbol, null en caso de ser vacío
     */
    /**
     * @return
     */
    public boolean esVacio() {
        return (getRaiz() == null);
    }

    /**
     * @return the raiz
     */
    public TElementoAB<T> getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(TElementoAB<T> raiz) {
        this.raiz = raiz;
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if(raiz==null){
            raiz=unElemento;
        }else{
            raiz.insertar(unElemento);
        }
        return true;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if(raiz==null){
            return null;
        }else{
            return raiz.buscar(unaEtiqueta);
        }
    }

   @Override
    public LinkedList<T> inOrden() {
        LinkedList<T> listaInorden = null;
        if (!esVacio()) {
            listaInorden = new LinkedList<>();
            raiz.inOrden(listaInorden);
        }
        return listaInorden;

    }

 

    @Override
    public LinkedList<T> preOrden() {
         LinkedList<T> listaPreOrden = null;
        if (!esVacio()) {
            listaPreOrden = new LinkedList<>();
            raiz.preOrden(listaPreOrden);
        }
        return listaPreOrden;
    }

    @Override
    public LinkedList<T> postOrden() {
        LinkedList<T> listaPostOrden = null;
        if (!esVacio()) {
            listaPostOrden = new LinkedList<>();
            raiz.postOrden(listaPostOrden);
        }
        return listaPostOrden;

    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        if(raiz != null)
        {
            raiz = raiz.eliminar(unaEtiqueta);
        }
    }

   
}
