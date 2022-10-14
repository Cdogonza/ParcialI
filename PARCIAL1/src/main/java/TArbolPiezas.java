
import java.util.LinkedList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ernesto
 */
public class TArbolPiezas extends TArbolBB<Pieza> implements IArbolPiezas {
@Override
    public TArbolPiezas piezasPorRubro(String unRubro) {
       TArbolPiezas arbolTemporal = new TArbolPiezas(); 
       LinkedList<Pieza> lista = this.inOrden();
        for (Pieza piezaq : lista) {
            if(piezaq.obtenerRubro().contains(unRubro)){
                
                TElementoAB<Pieza> nuevoNodo = new TElementoAB<>(piezaq.getCodigoCatalogo(),piezaq);
                arbolTemporal.insertar(nuevoNodo);
            }
        }         
       return arbolTemporal; 
    }
    @Override
    public int[] cantYvalorStock() {
        int[] cantidades= new int[2]; 
        int cant=0;
        int valor=0;
        LinkedList<Pieza> lista =  this.inOrden();       
        for (Pieza pieza : lista) {
            valor +=pieza.getValorEnStock();
            cant+=pieza.getCantidad();           
        }
        cantidades[0] = cant;
        cantidades[1]= valor;       
     return cantidades;    
    }

}
