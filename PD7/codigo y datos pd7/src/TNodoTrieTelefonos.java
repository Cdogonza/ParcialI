
import java.util.LinkedList;

public class TNodoTrieTelefonos implements INodoTrieTelefonos {

    private TAbonado abonado;
    TNodoTrieTelefonos[] numerosHijos;
    boolean esNumero;

    public TNodoTrieTelefonos() {
        numerosHijos = new TNodoTrieTelefonos[10];
        esNumero = false;
    }

    @Override
    public void buscarTelefonos(String primerosDigitos, LinkedList<TAbonado> abonados) {
        buscar(primerosDigitos, abonados, buscarNodo(primerosDigitos));

    }

    private TNodoTrieTelefonos buscarNodo(String primerosDigitos) {
        TNodoTrieTelefonos nodo = this;
        for (int i = 0; i < primerosDigitos.length(); i++) {
            int indice = primerosDigitos.charAt(i) - '0';
            if (nodo.numerosHijos[indice] == null) {
                return null;
            }
            nodo = nodo.numerosHijos[indice];
        }
        return nodo;
    }

    private void buscar(String primerosDigitos, LinkedList<TAbonado> abonados, TNodoTrieTelefonos nodo) {
        if (nodo != null) {
            if (nodo.esNumero) {
                abonados.add(nodo.abonado);
            }
            for (int i = 0; i < 10; i++) {
                if (nodo.numerosHijos[i] != null) {
                    buscar(primerosDigitos + (char) (i + '0'), abonados, nodo.numerosHijos[i]);
                }
            }
        }
    }

    @Override
    public void insertar(TAbonado unAbonado) {

        String tel = unAbonado.getTelefono();
        TNodoTrieTelefonos nodo = this;
        for (int i = 0; i < tel.length(); i++) {
            int num = tel.charAt(i) - '0';
            if (nodo.numerosHijos[num] == null) {
                nodo.numerosHijos[num] = new TNodoTrieTelefonos();
            }
            nodo = nodo.numerosHijos[num];

        }
        nodo.esNumero = true;
        nodo.abonado = unAbonado;
    }

}
