
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
        System.out.println("Cantidad de piezas: " + abbPiezas.cantYvalorStock()[0] + " Valor total del Stock " + abbPiezas.cantYvalorStock()[1]);
        /**
         * Paso 3:
         *
         * guardar un archivo "deposito.txt" conteniendo el listado - ordenado
         * ascendentemente por código de pieza - de todas las piezas del stock.
         * en cada línea debe aparecer: CODIGO, VALOR MONETARIO de la pieza en
         * stock - cantidad * precio
         *
         */
        LinkedList<Pieza> listaPiezas = abbPiezas.inOrden();
        escribirArchivoDePiezas("deposito.txt", listaPiezas);

        /**
         * Paso 4:
         *
         * crear un nuevo arbol de piezas que contenga solamente las piezas del
         * rubro indicado en el pizarron, y luego emitir un archivo
         * "porRubro.txt" conteniendo el listado - ordenado ascendentemente por
         * código de catalogo - de todas las piezas contenidas en este árbol,
         * con el mismo formato que el archivo "deposito.txt"
         *
         *
         */
        TArbolPiezas arbol = new TArbolPiezas();
        arbol = abbPiezas.piezasPorRubro("17");
        LinkedList<Pieza> arboll = arbol.inOrden();
        escribirArchivoDePiezas("porRubro", arboll);

        /* por último, imprimir por consola la cantidad de piezas y el valor de stock
        de las piezas del rubro indicado
         */
        System.out.println("Cantidad de piezas: " + arbol.cantYvalorStock()[0] + " Valor total del Stock " + arbol.cantYvalorStock()[1]);
    }

    private static void escribirArchivoDePiezas(String nombreArchivo, LinkedList<Pieza> contenido) {
        String[] datosDePieza = contenido.stream().map(m -> m.imprimir()).toArray(s -> new String[s]);
        String nombreCompletoArchivo = FILE_ROOT_PATH.resolve(nombreArchivo).toString();

        ManejadorArchivosGenerico.escribirArchivo(nombreCompletoArchivo, datosDePieza);
    }
}
