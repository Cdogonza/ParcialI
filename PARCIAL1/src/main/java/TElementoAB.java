
import java.util.LinkedList;


public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB<T> hijoIzq;
    private TElementoAB<T> hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
        hijoIzq = null;
        hijoDer = null;
    }

    public TElementoAB<T> getHijoIzq() {
        return hijoIzq;
    }

    public TElementoAB<T> getHijoDer() {
        return hijoDer;
    }

    @Override
    public Comparable getEtiqueta() {
        return etiqueta;
    }

    /**
     * @return
     */
    public String imprimir() {
        return (etiqueta.toString());
    }

    @Override
    public T getDatos() {
        return datos;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;

    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (unaEtiqueta.equals(etiqueta)) {
            return this;
        } else if (unaEtiqueta.compareTo(etiqueta) < 0) {
            if (hijoIzq != null) {
                return hijoIzq.buscar(unaEtiqueta);
            } else {
                return null;
            }
        } else if (hijoDer != null) {
            return hijoDer.buscar(unaEtiqueta);
        } else {
            return null;
        }
    }

    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        if(elemento.getEtiqueta().compareTo(etiqueta)<0){
            if(hijoIzq!= null){
                return getHijoIzq().insertar(elemento); 
            }else{
                hijoIzq=elemento; 
                return true; 
            }
        }else if (elemento.getEtiqueta().compareTo(etiqueta)>0){
            if(hijoDer!=null){
                return getHijoDer().insertar(elemento); 
            }else{
                hijoDer= elemento; 
                return true; 
            }
        }else{
            return false; 
        }
    }

       @Override
    public void inOrden(LinkedList<T> unaLista) {
        if (hijoIzq != null) {
            hijoIzq.inOrden(unaLista);

        }
        unaLista.add(this.getDatos());
        if (hijoDer != null) {
            hijoDer.inOrden(unaLista);
        }

    }
       @Override
    public void preOrden(LinkedList<T> unaLista) {
        unaLista.add(this.getDatos());
        if (hijoIzq != null) {
            hijoIzq.preOrden(unaLista);
        }

        if (hijoDer != null) {
            hijoDer.inOrden(unaLista);
        }

    }

    @Override
    public void postOrden(LinkedList<T> unaLista) {

        if (hijoIzq != null) {
            hijoIzq.preOrden(unaLista);
        }

        if (hijoDer != null) {
            hijoDer.inOrden(unaLista);
        }
        unaLista.add(this.getDatos());
    }
 

}
