/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ut1.pd2.ejercicio1;

/**
 *
 * @author gpaz1
 */
public class PD2Ejercicio1 {
    
    public static int factorialRecursivo(int n){ // #EJERCICIO 1
        int factorial = 1;
        if(n == 0){
            return 1;
        }else{
            factorial = n *factorialRecursivo(n-1);
        }
        return factorial;
    }
    public static int sumaLineal(int[]A,int n){//EJERCICIO #2
        int resultado = 0;
        if(n==1){
            resultado = A[0];
        }else{
            resultado = sumaLineal(A, n-1)+n;
            
        }
        return resultado;
    }
    
    public static int[] invertirArray(int[] vector,int posInicial, int posFinal){ //EJERCICIO #4
        
        if (posInicial<posFinal){
            int varTemp;
            varTemp = vector[posInicial];
            vector[posInicial] = vector[posFinal];
            vector[posFinal] = varTemp;
            invertirArray(vector, posInicial+1, posFinal-1); // ACA SE CONTEMPLA LA RECURSIVIDAD PORQUE SE LLAMA A SI MISMO EL METODO
        }else{
            if(posInicial==posFinal){
                return vector;
            }
        }
        
        return vector;
    }

    public static void main(String[] args) {
        ///EJERCICIO 1
        int factorial = 4;
        int factorial1 = 5;
        int factorial2 = 0;
        System.out.println(factorialRecursivo(factorial));
        System.out.println(factorialRecursivo(factorial1));
        System.out.println(factorialRecursivo(factorial2)); // EN ESTE CASO DA UN ERROR DE StackOverFlowError
        ///EJERCICIO 2
        int[]A = {1,2,3,4,5};
        int n = 5;
        System.out.println(sumaLineal(A, n));
        ///EJERCICIO 4
        int[] arrayInvertido = invertirArray(A, 0, A.length-1);
        for (int i : arrayInvertido) {
            System.out.print(i);
        }
    }
}
