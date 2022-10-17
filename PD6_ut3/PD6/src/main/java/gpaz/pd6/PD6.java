/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package gpaz.pd6;

/**
 *
 * @author gpaz1
 */
public class PD6 {

    public static void main(String[] args) {
      String[] sucursales = ManejadorArchivosGenerico.leerArchivo("src/suc1.txt");
        Lista sucursaless =  new Lista();
        for (String sucursale : sucursales) {
            Nodo sucursal = new Nodo(sucursale, sucursale);
            sucursaless.insertar(sucursal);
        }
        System.out.println(sucursaless.contadorElementos); //107 elementos tiene la suc1.txt
        //sucursaless.imprimir();
        Nodo nodoEliminar = new Nodo("Chicago", "Chicago");
        System.out.println(sucursaless.eliminar(nodoEliminar.getEtiqueta()));
        sucursaless.imprimir();
        System.out.println(sucursaless.contadorElementos); 
        
        
        String[] sucursales2 = ManejadorArchivosGenerico.leerArchivo("src/suc2.txt");
        Lista sucursalesSuc2 =  new Lista();
        for (String suc : sucursales2) {
            Nodo sucursal = new Nodo(suc, suc);
            sucursalesSuc2.insertar(sucursal);
        }
        sucursalesSuc2.imprimir();
        Nodo nodoEliminar1 = new Nodo("Shenzen", "Shenzen");
        Nodo nodoEliminar2 = new Nodo("Tokio", "Tokio");
              
        System.out.println(sucursalesSuc2.eliminar(nodoEliminar1.getEtiqueta()));
        System.out.println(sucursalesSuc2.eliminar(nodoEliminar2.getEtiqueta()));
        System.out.println(sucursalesSuc2.contadorElementos); 
        //Queda vacia la lista
   
        
//        String[] sucursales2 = ManejadorArchivosGenerico.leerArchivo("src/suc33.txt");
//        Lista sucursalesSuc2 =  new Lista();
//        for (String suc : sucursales2) {
//            Nodo sucursal = new Nodo(suc, suc);
//            sucursalesSuc2.insertar(sucursal);
//        }
//        System.out.println(sucursalesSuc2.imprimir("-"));
    }
    
    
}
