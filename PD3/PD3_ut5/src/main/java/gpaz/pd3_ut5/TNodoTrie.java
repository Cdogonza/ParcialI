package gpaz.pd3_ut5;


import java.util.LinkedList;

public class TNodoTrie implements INodoTrie {

    private static final int CANT_CHR_ABECEDARIO = 26;
    private TNodoTrie[] hijos;
    private boolean esPalabra;
    private final LinkedList<Object> indiceLibro;


         

    public TNodoTrie() {
        this.indiceLibro = new LinkedList<>();
        hijos = new TNodoTrie[CANT_CHR_ABECEDARIO];
        esPalabra = false;
    }

    @Override
    public void insertar(String unaPalabra) {
        TNodoTrie nodo = this;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];
        }
        nodo.esPalabra = true;
        
    }

    private void imprimirIndice(String s, TNodoTrie nodo) {
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(s + nodo.indiceLibro.toString());

            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    imprimirIndice(s + (char) (c + 'a'), nodo.hijos[c]);
                }
            }
        }
    }
    
    private void imprimirTrie(String ss, TNodoTrie nodo){
        if (nodo != null) {
            if (nodo.esPalabra) {
                System.out.println(ss);

            }
            for (int c = 0; c < CANT_CHR_ABECEDARIO; c++) {
                if (nodo.hijos[c] != null) {
                    imprimirTrie(ss + (char) (c + 'a'), nodo.hijos[c]);
                }
            }
        }
    }

    @Override
    public void imprimir() {
        imprimirIndice("", this);
    }
    public void imprimirTri(){
        imprimirTrie("",this);
    }

    @Override
    public void predecir(String prefijo, LinkedList<String> palabras) {
        throw new UnsupportedOperationException("Not supported yet."); 
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override   
    public int buscar(String unaPalabra) {
        TNodoTrie nodo = this;
        int comparaciones = 0;
        for (int c = 0; c < unaPalabra.length(); c++) {
            int indice = unaPalabra.charAt(c) - 'a';
            comparaciones++;
            if (nodo.hijos[indice] == null) {
                return comparaciones;
            }
            nodo = nodo.hijos[indice];
            
        }
        return comparaciones;
    }
    
    public String buscarModificado(String palabra){
        palabra = palabra.toLowerCase();
        String resultado= "";
        TNodoTrie nodo = this;
        int comparaciones = 0;
        for (int c = 0; c < palabra.length(); c++) {
            int indice = palabra.charAt(c) - 'a';
            comparaciones++;
            if (nodo.hijos[indice] == null) {
                
               resultado = "Palabra no encontrada en el trie " + "y la cantidad de comparaciones fueron "+ comparaciones;
               return resultado;
            }
            nodo = nodo.hijos[indice];
            
        }
        
            resultado = "Palabra encontrada en el trie en las paginas: "+ nodo.indiceLibro.toString();
            return resultado;
    }
    
    private void insertIndiceLibro(String palabra, int valor){
        TNodoTrie nodo = this;
        for (int c = 0; c < palabra.length(); c++) {
            int indice = palabra.charAt(c) - 'a';
            if (nodo.hijos[indice] == null) {
                nodo.hijos[indice] = new TNodoTrie();
            }
            nodo = nodo.hijos[indice];                      
        }
        nodo.esPalabra = true;
        if(nodo.indiceLibro.contains(valor)){
            
        }else{
            nodo.indiceLibro.add(valor);
        }             
    }
    // LO QUE HAGO CON ESTE METODO ES TRABAJAR CON LA ESTRUCTURA DEL LIBRO Y SACARLE TODOS LOS CARACTERES ESPECIALES Y LOS NUMERICOS SUSTITUIRLOS POR PALABRAS
    //DESPUES LLEVANDO EL CONTADOR DE LINEAS ESTABLECEMOS EN QUE PAGINA ESTAMOS PARA PODER AGREGARSELO A LA LINKEDLIST Y FINALMENTE LLAMAR INSERTINDICELIBRO QUE 
    // LO QUE HACE SIMPLEMENTE ES ARMAR LA ESTRUCTURA DEL TRIE CON EL INDICE SOLICITADO EN LA TAREA
    public void indizarLibro(String[] libro, int pagina){
        int cont=0;       
        for (String string : libro) {
            String stringg = string.trim().toLowerCase();
            String[] sep = stringg.split("\\W+");            
            for(int i=0;i<sep.length;i++){           
                String valor = sep[i].replace("_", "");
                String valor1 = valor.replace("1", "uno");
                String valor2 = valor1.replace("2", "dos");
                String valor3 = valor2.replace("3", "tres");
                String valor4 = valor3.replace("4", "cuatro");
                String valor5 = valor4.replace("5", "cinco");
                String valor6 = valor5.replace("6", "seis");
                String valor7 = valor6.replace("7", "siete");
                String valor8 = valor7.replace("8", "ocho");
                String valor81 = valor8.replace("9", "nueve");
                String valor82 = valor81.replace("0", "cero");
                String valor9[] = valor82.split(" ");
                for (String string1 : valor9) {
                    if(cont <=50){
                        pagina = 1;
                    }else if(cont>50 && cont<=100){
                        pagina = 2;
                    }else if(cont>100 && cont<=150){
                        pagina = 3;
                    }else if(cont>150 && cont<=200){
                        pagina = 4;
                    }else if(cont>200 && cont<=250){
                        pagina = 5;
                    }else if(cont>250 && cont<=300){
                        pagina =6;
                    }else if(cont>300 && cont<=350){
                        pagina = 7;
                    }else if(cont>350 && cont<=400){
                        pagina = 8;
                    }else if(cont>400 && cont<=450){
                        pagina = 9;
                    }else if(cont>450 && cont<=500){
                        pagina = 10;
                    }else if(cont>500 && cont<=550){
                        pagina = 11;
                    }else if(cont>550 && cont<=600){
                        pagina = 12;
                    }else if(cont>600 && cont<=650){
                        pagina = 13;
                    }else if(cont>650 && cont<=700){
                        pagina = 14;
                    }else if(cont>700 && cont<=750){
                        pagina = 15;
                    }else if(cont>750 && cont<=800){
                        pagina = 16;
                    }else if(cont>800 && cont<=850){
                        pagina = 17;
                    }else if(cont>850 && cont<=150){
                        pagina = 18;
                    }else if(cont>900 && cont<=900){
                        pagina = 19;
                    }else{pagina =20;}
                    
                    this.insertIndiceLibro(string1,pagina);
                    
                }              
            }
            cont++;
        }
        
    }
    
}

