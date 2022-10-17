package ut4_ta2;

class TElementoArbolBB<T> implements IElementoAB<T> {
    
    private Comparable etiqueta;
    private TElementoArbolBB<T> hijoIzq;
    private TElementoArbolBB<T> hijoDer;
    
    public TElementoArbolBB(Comparable etiqueta){
        this.etiqueta = etiqueta;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public TElementoArbolBB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public TElementoArbolBB<T> getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(TElementoArbolBB<T> elemento) {
        this.hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(TElementoArbolBB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoArbolBB<T> buscar(Comparable unaEtiqueta) {
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
    public boolean insertar(TElementoArbolBB<T> elemento) {
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
    public String preOrden() {
        String tempStr = "";
        tempStr = tempStr + this.getEtiqueta() + ",";
        if (hijoIzq != null) {
        tempStr = tempStr + hijoIzq.preOrden();
        }
        if (hijoDer != null) {
        tempStr = tempStr + hijoDer.preOrden();
        }
        return tempStr;
    }

    @Override
    public String inOrden() {
        String tempStr = "";
        if (hijoIzq != null) {
        tempStr = tempStr + hijoIzq.inOrden();
        }
        tempStr = tempStr + this.getEtiqueta() + ",";
        if (hijoDer != null) {
        tempStr = tempStr + hijoDer.inOrden();
        }
        return tempStr;
    }

    @Override
    public String postOrden() {
        String tempStr = "";
        if (hijoIzq != null) {
        tempStr = tempStr + hijoIzq.postOrden();
        }
        if (hijoDer != null) {
        tempStr = tempStr + hijoDer.postOrden();
        }
        tempStr = tempStr + this.getEtiqueta() + ",";
        return tempStr;
    }

    @Override
    public T getDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TElementoArbolBB eliminar(Comparable unaEtiqueta) {
       Comparable vacio = null;
       if(this.buscar(unaEtiqueta)!= null){
           this.etiqueta = vacio;
           System.out.print("elemento eliminado");
       }else{
            System.out.print("el elemento a elimainar no se encuentra en la lista");
           
       }
        return null;
      
    }

    @Override
    public int obtenerTamaño() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
     public int obtenerAltura() {
        int a = -1;
        int b = -1;
        if(this.getHijoIzq()!=null){
            a=this.getHijoIzq().obtenerAltura();
        }
        if(this.getHijoDer()!=null){
            b=this.getHijoDer().obtenerAltura();
        }
        return Integer.max(a, b)+1;
    }
}
