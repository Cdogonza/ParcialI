
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
        TArbolPiezas arbolPorRubro = new TArbolPiezas();
        if (this.esVacio())
        {
            return arbolPorRubro;
        }
        LinkedList<Pieza> todasLasPiezas = this.inOrden();
        for(Pieza pieza : todasLasPiezas)
        {
            if(pieza.obtenerRubro().equals(unRubro))
            {
                TElementoAB aInsertar = new TElementoAB(pieza.getCodigoCatalogo(), pieza);
                arbolPorRubro.insertar(aInsertar);
            }
        }
        return arbolPorRubro;
    }

    @Override
    public int[] cantYvalorStock() {
        int[] cantYValorStock = new int[2];
        int cantidad = 0;
        int stock = 0;
        if(this.esVacio())
        {
            return cantYValorStock;
        }
        else
        {
            LinkedList<Pieza> todasLasPiezas = this.inOrden();
            for(Pieza pieza : todasLasPiezas)
            {
                cantidad = cantidad + pieza.getCantidad();
                stock = stock + pieza.getValorEnStock();
            }
            cantYValorStock[0] = cantidad;
            cantYValorStock[1] = stock;
        }
        return cantYValorStock;
    }

}
