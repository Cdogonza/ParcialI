
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TestCases {

    public TestCases() {}
    
    @Test
    public void testcantYvalorStockArbolVacio() {
        TArbolPiezas prueba = new TArbolPiezas(); 
        int[] pruebaCantYVal = new int[2];
        
        pruebaCantYVal = prueba.cantYvalorStock();
        int[] expected = new int[2];
        
        assertEquals(pruebaCantYVal[0], expected[0]);
        assertEquals(pruebaCantYVal[1], expected[1]);          
    }
    
    @Test
    public void testcantYvalorStockUnElemento() { //String codigo, String codCat, String descripcion, int cantidad, int precioUnitario
        TArbolPiezas prueba = new TArbolPiezas(); 
        Pieza pieza1 = new Pieza("1", "2", "3", 4, 2);
        TElementoAB<Pieza> pieza1E = new TElementoAB<> (pieza1.getCodigoPieza(), pieza1);
        int[] pruebaCantYVal = new int[2];
        
        prueba.insertar(pieza1E);
        pruebaCantYVal = prueba.cantYvalorStock();
        int[] expected = new int[2];
        expected[0] = 4;
        expected[1] = 8;
        
        assertEquals(pruebaCantYVal[0], expected[0]);
        assertEquals(pruebaCantYVal[1], expected[1]);          
    }
    
    @Test
    public void testcantYvalorStockVariosElementos(){
        TArbolPiezas prueba = new TArbolPiezas(); 
        Pieza pieza1 = new Pieza("1", "2", "3", 1, 2);
        Pieza pieza2 = new Pieza("2", "23", "3", 2, 2);
        Pieza pieza3 = new Pieza("3", "3", "3", 3, 1);
        TElementoAB<Pieza> pieza1E = new TElementoAB<> (pieza1.getCodigoPieza(), pieza1);
        TElementoAB<Pieza> pieza2E = new TElementoAB<> (pieza2.getCodigoPieza(), pieza2);
        TElementoAB<Pieza> pieza3E = new TElementoAB<> (pieza3.getCodigoPieza(), pieza3);
        int[] pruebaCantYVal = new int[2];
        
        prueba.insertar(pieza1E);
        prueba.insertar(pieza2E);
        prueba.insertar(pieza3E);
        pruebaCantYVal[0] = prueba.cantYvalorStock()[0];
        pruebaCantYVal[1] = prueba.cantYvalorStock()[1];
        int[] expected = new int[2];
        expected[0] = 6;
        expected[1] = 9;
        
        assertEquals(expected[0], pruebaCantYVal[0]);
        assertEquals(pruebaCantYVal[1], expected[1]);
    }
    
    @Test
    public void testPiezasPorRubroArbolVacio()
    {
        TArbolPiezas prueba = new TArbolPiezas();
        TArbolPiezas resultado = prueba.piezasPorRubro("");
        
        assertTrue(resultado.esVacio());    
    }
    
    @Test
    public void testObtenerPiezaQueNoEs(){
        TArbolPiezas prueba = new TArbolPiezas();
        Pieza pieza1 = new Pieza("1", "2", "3", 1, 2);
        TElementoAB<Pieza> pieza1E = new TElementoAB<> (pieza1.getCodigoPieza(), pieza1);
        
        prueba.insertar(pieza1E);
        TArbolPiezas expected = prueba.piezasPorRubro("");
        
        assertTrue(expected.esVacio()); 
    }
    
     @Test
    public void testObtenerPiezaQueNoEsConEliminacion(){
        TArbolPiezas prueba = new TArbolPiezas();
        Pieza pieza1 = new Pieza("1", "2", "3", 1, 2);
        Pieza pieza2 = new Pieza("2", "3", "4", 2, 3);
        TElementoAB<Pieza> pieza1E = new TElementoAB<> (pieza1.getCodigoPieza(), pieza1);
        TElementoAB<Pieza> pieza1E2 = new TElementoAB<> (pieza2.getCodigoPieza(), pieza2);
        
        prueba.insertar(pieza1E);
        prueba.insertar(pieza1E2);
        String rubroTest = "3";
        prueba.eliminar(pieza1E2.getEtiqueta());
        TArbolPiezas expected = prueba.piezasPorRubro("3");
        
        assertTrue(expected.esVacio()); 
    }
    
    @Test
    public void testObtenerPiezaQueSiEs(){
        TArbolPiezas prueba = new TArbolPiezas();
        Pieza pieza1 = new Pieza("1", "2", "3", 1, 2);
        TElementoAB<Pieza> pieza1E = new TElementoAB<> (pieza1.getCodigoPieza(), pieza1);
        
        prueba.insertar(pieza1E);
        TArbolPiezas expected = prueba.piezasPorRubro("2");
        
        assertFalse(expected.esVacio());
    }
    
    @Test
    public void testArbolConUnElementoParaEliminarloPosteriormente(){
        TArbolPiezas pruebaa = new TArbolPiezas();
        Pieza pieza11 = new Pieza("1", "2", "3", 1, 2);
        TElementoAB<Pieza> pieza11E = new TElementoAB<> (pieza11.getCodigoPieza(), pieza11);
        pruebaa.insertar(pieza11E);
        pruebaa.eliminar("1");
        assertTrue(pruebaa.esVacio());
    }
    @Test
    public void testcantYvalorStockVariosElementosConEliminacion(){
        TArbolPiezas prueba = new TArbolPiezas(); 
        Pieza pieza1 = new Pieza("1", "2", "3", 1, 2);
        Pieza pieza2 = new Pieza("2", "23", "3", 2, 2);
        Pieza pieza3 = new Pieza("3", "3", "3", 3, 1);
        TElementoAB<Pieza> pieza1E = new TElementoAB<> (pieza1.getCodigoPieza(), pieza1);
        TElementoAB<Pieza> pieza2E = new TElementoAB<> (pieza2.getCodigoPieza(), pieza2);
        TElementoAB<Pieza> pieza3E = new TElementoAB<> (pieza3.getCodigoPieza(), pieza3);
        int[] pruebaCantYVal = new int[2];
        
        prueba.insertar(pieza1E);
        prueba.insertar(pieza2E);
        prueba.insertar(pieza3E);
        
        prueba.eliminar("2");
        
        pruebaCantYVal[0] = prueba.cantYvalorStock()[0];
        pruebaCantYVal[1] = prueba.cantYvalorStock()[1];
        int[] expected = new int[2];
        expected[0] = 4;
        expected[1] = 5;
        
        assertEquals(expected[0], pruebaCantYVal[0]);
        assertEquals(pruebaCantYVal[1], expected[1]);
    }
    
}
