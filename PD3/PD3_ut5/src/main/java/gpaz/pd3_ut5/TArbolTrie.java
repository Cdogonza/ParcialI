package gpaz.pd3_ut5;


import java.util.LinkedList;

public class TArbolTrie implements IArbolTrie {

    private TNodoTrie raiz;

    @Override
    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra);
    }

    @Override
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimirTri();
        }
    }
    public void imprimirIndice(){
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    @Override
    public int buscar(String palabra) {
        if(raiz != null ){
        return raiz.buscar(palabra);           
        }
        return 0;

    }
    public String buscarModificado(String palabra){
        if(raiz != null ){
           return raiz.buscarModificado(palabra);           
        }else{
            return "";
        }
    }

    @Override
    public LinkedList<String> predecir(String prefijo) {
    
        return null;
    
    }
    
    public void indizarLibro(String[] texto, int linea){
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.indizarLibro(texto, linea);
    }
}
