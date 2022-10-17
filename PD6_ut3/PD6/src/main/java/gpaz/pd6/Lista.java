package gpaz.pd6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gpaz1
 */
public class Lista implements ILista{
    private Nodo primero;
    public int contadorElementos=0;
    public Lista(){
        this.primero = null;
    }

    @Override
    public void insertar(Nodo nodo) {
        if(primero==null){
            primero = nodo;
            contadorElementos++;
        }else{
            if(primero.getSiguiente()==null){
                primero.setSiguiente(nodo);
                contadorElementos++;
            }else{
                Nodo temp = this.primero;
            while(temp.getSiguiente()!= null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nodo);
            contadorElementos++;
            }
            
        }
        
    }

    @Override
    public Nodo buscar(Comparable clave) {
        Nodo temp = this.primero;
        if(temp==null){
            return null;
        }
        if(this.primero.getEtiqueta().equals(clave)){
            return primero;
        }
        
        while (temp.getSiguiente()!=null) {           
            if(temp.getEtiqueta().equals(clave)){
                return temp;
            }
            temp = temp.getSiguiente();
            System.out.println(temp.getEtiqueta().toString());
        }
        return null;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        Nodo aux = this.primero;
        if(this.primero==null){ // Lista vacia       
            return false;
        }
 
        if(aux.getSiguiente()==null){ //Tiene un elemento solo
           if(aux.getEtiqueta().equals(clave)){
            this.primero = null;
            contadorElementos--;
            return true; 
        }else return false;
        }
        while(aux.getSiguiente()!=null){            
            if(aux.getEtiqueta().equals(clave)){
            aux.setSiguiente(aux.getSiguiente().getSiguiente());
            contadorElementos--;
            return true;
        }
            aux = aux.getSiguiente();
        }
        
        return false;
    }

    @Override
    public String imprimir() {
        Nodo temp = this.primero;
        System.out.println(String.valueOf(temp.getEtiqueta()));
        while(temp.getSiguiente()!= null){
            temp = temp.getSiguiente();
            System.out.println(String.valueOf(temp.getEtiqueta()));
           
            
        }
        //System.out.println(temp.getEtiqueta().toString());
        return null;
    }

    @Override
    public String imprimir(String separador) {
        Nodo aux = this.primero;
        String valor = " "+separador;
        if(aux==null){
            return " ";
        }
        if(aux.getSiguiente()==null){
           valor = String.valueOf(aux.getEtiqueta());
           return valor;
        }
        while(aux.getSiguiente()!=null){
            valor = valor + String.valueOf(aux.getEtiqueta());
        }
        return valor;
    }

    @Override
    public int cantElementos() {
        return this.contadorElementos;
    }

    @Override
    public boolean esVacia() {
        return primero==null;
    }

    @Override
    public void setPrimero(Nodo unNodo) {
        if (this.primero==null){
            this.primero = unNodo;
        }else{
            unNodo = this.primero;
            
        }
        
    }
    
}
