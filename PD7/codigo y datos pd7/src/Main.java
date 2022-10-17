import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args){
        TArbolTrieTelefonos trieAbonados = new TArbolTrieTelefonos();

       // CARGAR EN EL TRIE LOS TELÉFONOS Y NOMBRES A PARTIR DEL ARCHIVO ABONADOS.TXT
        String[] abonados = ManejadorArchivosGenerico.leerArchivo("src/abonados.txt");       
        for (String abonado : abonados) {
            String[] abonadoSeparado = abonado.split(",");
            TAbonado nuevoAbonado = new TAbonado(abonadoSeparado[1], abonadoSeparado[0]);
            trieAbonados.insertar(nuevoAbonado);
        }

        String codigoPais = "054" ; // utilizar el indicado en el archivo "codigos.txt"
        String codigoArea = "90" ;// utilizar el indicado en el archivo "codigos.txt"
        LinkedList<TAbonado> ab = trieAbonados.buscarTelefonos(codigoPais, codigoArea);
        
        String[] resultadoBusqueda = new String[ab.size()];
        int cont =0;
        for (TAbonado tAbonado : ab) {
            resultadoBusqueda[cont] = tAbonado.getNombre()+", "+ tAbonado.getTelefono();;
 
            cont++;
        }
        Arrays.sort(resultadoBusqueda);
       ManejadorArchivosGenerico.escribirArchivo("src/salida.txt", resultadoBusqueda);
        // crear el archivo "salida.txt", con los abonados (1 por linea) 
        // correspondientes al pais y area 
        // imprimir Nombre y teléfono, 
        // ordenados alfabeticamente por nombre
        
      
        
    }
}