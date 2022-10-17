
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
        if(this.etiqueta.compareTo(unaEtiqueta) == 0){
            return this;
        }else{
            if(this.etiqueta.compareTo(unaEtiqueta) < 0){
                if(hijoDer != null){
                    return hijoDer.buscar(unaEtiqueta);
                }else{
                    return null;
                }
            }else{
                if(this.etiqueta.compareTo(unaEtiqueta) > 0){
                    if(hijoIzq != null){
                        return hijoIzq.buscar(unaEtiqueta);
                    }else{
                        return null;
                    }
                }else{
                    return null;
                }
            }
        }
    }

    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        if(this.getEtiqueta().equals(elemento.getEtiqueta())){
            return false;
        }else if(elemento.getEtiqueta().compareTo(this.getEtiqueta()) < 0){
            if(this.getHijoIzq()==null){
                this.setHijoIzq(elemento);
            }else{
                this.getHijoIzq().insertar(elemento);
            }
        }else{
            if(this.getHijoDer()==null){
                this.setHijoDer(elemento);
            }else{
                this.getHijoDer().insertar(elemento);
            }
        }
        return true;    
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

    @Override
    public TElementoAB<T> eliminar(Comparable unaEtiqueta) {
        if(unaEtiqueta.compareTo(this.getEtiqueta()) < 0)
        {
            if(this.getHijoIzq() != null)
            {
                this.setHijoIzq(this.getHijoIzq().eliminar(unaEtiqueta));
            }
            return this;
        }
        if(unaEtiqueta.compareTo(this.getEtiqueta()) > 0)
        {
            if(this.getHijoDer() != null)
            {
                this.setHijoDer(this.getHijoDer().eliminar(unaEtiqueta));
            }
            return this;
        }
        return this.quitaElNodo();
    }
    
    public TElementoAB<T> quitaElNodo()
    {
        if(this.getHijoIzq() == null)
        {
            return this.getHijoDer();
        }
        if(this.getHijoDer() == null)
        {
            return this.getHijoIzq();
        }
        TElementoAB elHijo = new TElementoAB(null, null);
        TElementoAB elPadre = new TElementoAB(null, null);
        elHijo = this.getHijoIzq();
        elPadre = this;
        while(elHijo.getHijoDer() != null)
        {
            elPadre = elHijo;
            elHijo = elHijo.getHijoDer();
        }
        if(elPadre != this)
        {
            elPadre.setHijoDer(elHijo.getHijoIzq());
            elHijo.setHijoIzq(this.getHijoIzq());
        }
        elHijo.setHijoDer(this.getHijoDer());
        return elHijo;
    }
    
 

}
