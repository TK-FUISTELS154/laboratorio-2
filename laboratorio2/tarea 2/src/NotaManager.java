import java.util.ArrayList;

public class NotaManager {
    private ArrayList<Integer> notas;

    public NotaManager() {
        this.notas = new ArrayList<>();
    }

    public void agregarNota(int nota) {
        notas.add(nota);
        System.out.println("Nota agregada.");
    }

    public void mostrarNotas() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas registradas.");
        } else {
            System.out.println("Notas: " + notas);
        }
    }

    public void calcularPromedio() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas para calcular promedio.");
            return;
        }
        double suma = 0;
        for (int n : notas) {
            suma += n;
        }
        double promedio = suma / notas.size();
        System.out.println("Promedio: " + promedio);
    }

    public void buscarNota(int valor) {
        if (notas.contains(valor)) {
            System.out.println("La nota " + valor + " está en la lista.");
        } else {
            System.out.println("La nota no existe en la lista.");
        }
    }

    public void eliminarPorPosicion(int pos) {
        if (pos >= 0 && pos < notas.size()) {
            int eliminado = notas.remove(pos);
            System.out.println("Nota eliminada: " + eliminado);
        } else {
            System.out.println("Posición inválida.");
        }
    }

    public void eliminarPorValor(int valor) {
        if (notas.remove((Integer) valor)) {
            System.out.println("Nota eliminada: " + valor);
        } else {
            System.out.println("La nota no existe en la lista.");
        }
    }
}
