package ut4_ta2;

public class UT4_TA2 {

    public static void main(String[] args) {

        TArbolBB Tree = new TArbolBB();
        Tree = cargar("src/claveInsertada_1.txt");        
        System.out.println(Tree.preOrden());
        System.out.println(Tree.buscar(10).eliminar(10));
        System.out.println(Tree.preOrden());
        //System.out.println(Tree.inOrden());
        
        //System.out.println(Tree.postOrden());
    }
    
    public static TArbolBB cargar(String rutaArchivo){
        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String[] claves = manejador.leerArchivo(rutaArchivo);
        TArbolBB Arbol = new TArbolBB();
        String[] aEscritura = new String[claves.length];
        int i = 0;

        for(String clave: claves){
            TElementoArbolBB elemento = new TElementoArbolBB(Integer.parseInt(clave));
            Arbol.insertar(elemento);
            aEscritura[i]= clave + "," + Arbol.contador;
            i++;
        }
        manejador.escribirArchivo("src/claveInsertada.txt", aEscritura);
        System.out.println("El método insertar se invoca " + Arbol.contador + " veces.");
        return Arbol;
    }
    
    public static TArbolBB consultas(String rutaArchivo){
        ManejadorArchivosGenerico manejador = new ManejadorArchivosGenerico();
        String[] consultas = manejador.leerArchivo(rutaArchivo);
        TArbolBB Arbol = new TArbolBB();

        for(String clave: consultas){
        TElementoArbolBB elemento = new TElementoArbolBB(Integer.parseInt(clave));
        Arbol.insertar(elemento);
        }
        System.out.println("El método insertar se invoca " + Arbol.contador + " veces.");
        return Arbol;
    }
}
