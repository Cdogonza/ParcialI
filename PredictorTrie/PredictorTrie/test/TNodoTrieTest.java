/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import java.util.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 *
 * @author gpaz1
 */
public class TNodoTrieTest {
    TArbolTrie trie;
    
    public TNodoTrieTest() {
    }
    
 
    
    @BeforeEach
    public void setUp() {
         trie = new TArbolTrie();
        
    }
    

    
    @Test
    public void testPredecir() {
        System.out.println("Test Predecir");
        
        String prefijo = "co";
        LinkedList<String> palabras = null;
        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo("./src/palabras1.txt");
        for (String p : palabrasclave) {
                trie.insertar(p);
                palabras.add(p);
        }       
        for (String string : trie.predecir(prefijo)) {
            System.out.println(string);
        }
    }

    /**
     * Test of buscar method, of class TNodoTrie.
     */
    
    
}
