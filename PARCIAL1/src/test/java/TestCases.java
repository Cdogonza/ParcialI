
import java.util.LinkedList;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCases {

    public TestCases() {
    }

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPiezasPorRubro() {
        System.out.println("piezasPorRubro");
        String unRubro = "9";
        TArbolPiezas arbol = new TArbolPiezas();
        Pieza pieza = new Pieza("1237330035", "3.4.1", "Ignition Condensers", 5, 15);
        Pieza pieza2 = new Pieza("0130002211", "9.5.1", "Cooling Systems",9,826);
        TElementoAB<Pieza> elemento1 = new TElementoAB<>(pieza2.getCodigoPieza(), pieza2);
        TElementoAB<Pieza> elemento = new TElementoAB<>(pieza.getCodigoPieza(), pieza);
        arbol.insertar(elemento1);
        arbol.insertar(elemento);
        String rubro="";
        
        TArbolPiezas arbolPorRubro =new TArbolPiezas();
        arbolPorRubro.insertar(elemento1);
        TArbolPiezas result = arbolPorRubro.piezasPorRubro(unRubro);
        LinkedList<Pieza> lista= result.inOrden();
        for (Pieza pieza1 : lista) {
         rubro = pieza1.obtenerRubro();
        }
        
        assertEquals(unRubro, rubro);
        
    }
    @Test
    public void testCantYvalorStock() {
        System.out.println("cantYvalorStock");
        TArbolPiezas arbol2 = new TArbolPiezas();
        Pieza pieza = new Pieza("1237330035", "3.4.1", "Ignition Condensers", 5, 10);
        TElementoAB<Pieza> elemento = new TElementoAB<>(pieza.getCodigoPieza(), pieza);
        arbol2.insertar(elemento);
        int[]resultado = arbol2.cantYvalorStock();
        int [] esperado = {5,50};
        assertArrayEquals(esperado, resultado);
        
    }
}
