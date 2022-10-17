
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;

public class Parcial1 {

    private static Path FILE_ROOT_PATH = Paths.get("src/main/java/");

    public static void main(String[] args) {

        /**
         *
         * LEER ATENTAMENTE LAS INDICACIONES.
         *
         * Paso 1:
         *
         * 1.1 - instanciar un árbol de piezas (desciende de árbol binario de
         * búsqueda)
         *
         * 1.2 - cargar las piezas del archivo "piezas.txt" e insertarlas en el
         * árbol
         *
         */
        TArbolPiezas abbPiezas = new TArbolPiezas();
        String[] lineas = ManejadorArchivosGenerico.leerArchivo(FILE_ROOT_PATH.resolve("piezas.txt").toString());
        for (String l : lineas) {
            String[] datosPieza = l.split(",");
            Pieza pieza = new Pieza(datosPieza[0], datosPieza[1], datosPieza[2], Integer.valueOf(datosPieza[3]), Integer.valueOf(datosPieza[4]));
            TElementoAB<Pieza> nuevoNodo = new TElementoAB<>(pieza.getCodigoPieza(), pieza);

            abbPiezas.insertar(nuevoNodo);
        }
        /**
         * Paso 2:
         *
         * 2.1 - Invocar al método “cantYvalorStock” del árbol y mostrar por
         * consola los valores de cantidad total de piezas existentes y valor
         * total del stock.
         *
         */
        int[] cantidadYStock = new int[2];
        cantidadYStock = abbPiezas.cantYvalorStock();
        System.out.println("Valor de la cantidad total de piezas existentes es: " + cantidadYStock[0]);
        System.out.println("Valor total del stock: " + cantidadYStock[1]);
        /**
         * Paso 3:
         *
         * guardar un archivo "deposito.txt" conteniendo el listado - ordenado
         * ascendentemente por código de pieza - de todas las piezas del stock.
         * en cada línea debe aparecer: CODIGO, VALOR MONETARIO de la pieza en
         * stock - cantidad * precio
         *
         */
        LinkedList<Pieza> aImprimir = new LinkedList<>();
        aImprimir = abbPiezas.inOrden();
        escribirArchivoDePiezas("deposito.txt", aImprimir);
        /**
         * Paso 4:
         *
         * crear un nuevo arbol de piezas que contenga solamente las piezas del
         * rubro indicado en el pizarron, y luego emitir un archivo
         * "porRubro.txt" conteniendo el listado - ordenado ascendentemente por
         * código de catalogo - de todas las piezas contenidas en este árbol,
         * con el mismo formato que el archivo "deposito.txt"
         *
         */
        TArbolPiezas arbolRubro = new TArbolPiezas();
        arbolRubro = abbPiezas.piezasPorRubro("17");
        LinkedList<Pieza> aImprimir2 = new LinkedList<>();
        aImprimir2 =  arbolRubro.inOrden();
        escribirArchivoDePiezas("porrubro.txt", aImprimir2);
        /* por último, imprimir por consola la cantidad de piezas y el valor de stock
        de las piezas del rubro indicado
         */
        int[] cantidadYStock2 = new int[2];
        cantidadYStock2 = arbolRubro.cantYvalorStock();
        System.out.println("Valor de la cantidad total de piezas existentes es: " + cantidadYStock2[0]);
        System.out.println("Valor total del stock: " + cantidadYStock2[1]);
        
        //Eliminar las piezas
        abbPiezas.eliminar("KS01000819");
        abbPiezas.eliminar("KS00000807");
        abbPiezas.eliminar("KS00000776");
        
        //Invocar al metodo
        int[] cantidadYStock3 = new int[2];
        cantidadYStock3 = abbPiezas.cantYvalorStock();
        System.out.println("Valor de la cantidad total de piezas existentes es: " + cantidadYStock3[0]);
        System.out.println("Valor total del stock: " + cantidadYStock3[1]);
        
        //Crear deposito2.txt
        LinkedList<Pieza> aImprimir3 = new LinkedList<>();
        aImprimir3 =  abbPiezas.inOrden();
        escribirArchivoDePiezas("deposito2.txt", aImprimir3);
        
        //Invocar Al metodo por rubro al arbol con eliminaciones
        TArbolPiezas arbolRubroConEliminaciones = new TArbolPiezas();
        arbolRubroConEliminaciones = abbPiezas.piezasPorRubro("17");
        
        //Invocar al metodo cantYvalorSTock al nuevo arbol de rubro
        int[] cantidadYStock4 = new int[2];
        cantidadYStock4 = arbolRubroConEliminaciones.cantYvalorStock();
        System.out.println("Valor de la cantidad total de piezas existentes es: " + cantidadYStock4[0]);
        System.out.println("Valor total del stock: " + cantidadYStock4[1]);
        
    }

    private static void escribirArchivoDePiezas(String nombreArchivo, LinkedList<Pieza> contenido) {
        String[] datosDePieza = contenido.stream().map(m -> m.imprimir()).toArray(s -> new String[s]);
        String nombreCompletoArchivo = FILE_ROOT_PATH.resolve(nombreArchivo).toString();

        ManejadorArchivosGenerico.escribirArchivo(nombreCompletoArchivo, datosDePieza);
    }
}
