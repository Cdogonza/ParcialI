package ut4_ta2;

public class TArbolBB<T> implements IArbolBB<T>{

    private TElementoArbolBB<T> raiz;
    
    public TArbolBB(){
        
    }
    
    int contador = 0;
    
    @Override
    public boolean insertar(TElementoArbolBB<T> unElemento) {
        if(raiz==null){
            raiz=unElemento;
        }else{
            raiz.insertar(unElemento);
        }
        contador++;
        return true;
    }

    @Override
    public TElementoArbolBB<T> buscar(Comparable unaEtiqueta) {
        
        if(raiz==null){
            return null;
        }else{
            return raiz.buscar(unaEtiqueta);
        }
    }

    @Override
    public String preOrden() {
        if (raiz == null){
            return "árbol vacío";
        }else{
            return raiz.preOrden();
        }
    }

    @Override
    public String inOrden() {
        if (raiz == null){
            return "árbol vacío";
        }else{
            return raiz.inOrden();
        }
    }

    @Override
    public String postOrden() {
        if (raiz == null){
            return "árbol vacío";
        }else{
            return raiz.postOrden();
        }
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
         {
            raiz = raiz.eliminar(unaEtiqueta);
        }
    }

    @Override
    public int obtenerTamaño() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int obtenerAltura() {
        int a = -1;
        int b = -1;
        if(this.raiz.getHijoIzq()!=null){
            a=raiz.getHijoIzq().obtenerAltura();
        }
        if(this.raiz.getHijoDer()!=null){
            b=raiz.getHijoDer().obtenerAltura();
        }
        return Integer.max(a, b)+1;
    }
    
}
