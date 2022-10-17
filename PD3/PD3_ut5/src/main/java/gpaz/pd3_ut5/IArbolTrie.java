package gpaz.pd3_ut5;


import java.util.LinkedList;

public interface IArbolTrie {

    void imprimir();
    
    int buscar(String palabra);

    void insertar(String palabra);

    LinkedList<String> predecir(String prefijo);   
}
