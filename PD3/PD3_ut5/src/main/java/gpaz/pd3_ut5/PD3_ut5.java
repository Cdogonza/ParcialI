/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gpaz.pd3_ut5;

/**
 *
 * @author gpaz1
 */
public class PD3_ut5 {

    public static void main(String[] args) {
        
        String[] libro = ManejadorArchivosGenerico.leerArchivo("src/Libro.txt");  // CARGO EL LIBRO CRUDO COMO STA      
        
        TArbolTrie trie = new TArbolTrie(); //TRIE CREADO CON EL ARBOL COMPLETO
        
        trie.indizarLibro(libro,0); // TRABAJA PARA INIZAR EL LIBRO PASADO POR PARAMETRO Y EL CERO INDICA EL COMIENZO DE PAGINA
        
            trie.imprimir(); //IMPRIME UNICAMENTE LAS PLABRAS CONTENIDAS EN EL TRIE
                
            trie.imprimirIndice();//IMPRIME EL INDICE DEL TRIE  */
        
//        // PARTE CUATRO DEL PD 2 CREACION DEL INDICE CON EL ARCHIVO PALABRAS INDICE PRUEBA
//        String[] PalabrasIndice = ManejadorArchivosGenerico.leerArchivo("src/PalabrasIndice.txt");
//        TArbolTrie trie2 = new TArbolTrie();
//        trie2.indizarLibro(PalabrasIndice,0);
//    //    trie2.imprimirIndice();//IMPRIME EL INDICE DEL TRIE, EN ESTE CASO A DIFERENCIA DEL ANTERIOR UNICAMENTE HAY UNA Y DOS PAGINAS YA QUE SOLO HAY 56 LINEAS, Y COMO DECIA 
//                               // LA LETRA CADA 50 LINEAS ES UNA PAGINA
                               
                               
                               
//        // EJERCICIO 2 BUSCAR MODIFICADO EN EL LIBRO
//        TArbolTrie trie3 = new TArbolTrie();
//        trie3.indizarLibro(libro,0);
//        System.out.println(trie3.buscarModificado("For")); // BUSQUEDA CON EXITO EN EL LIBRO
//        System.out.println(trie3.buscarModificado("GONZALO")); // BUSQUEDA SIN EXITO EN EL LIBRO
        
    }
}
