import java.util.Scanner;

public class Menu {
    private NotaManager notaManager;
    private Scanner sc;

    public Menu() {
        this.notaManager = new NotaManager();
        this.sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE NOTAS ---");
            System.out.println("1. Agregar nota");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Calcular promedio");
            System.out.println("4. Buscar nota");
            System.out.println("5. Eliminar nota");
            System.out.println("6. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingresa la nota: ");
                    int nota = sc.nextInt();
                    notaManager.agregarNota(nota);
                }
                case 2 -> notaManager.mostrarNotas();
                case 3 -> notaManager.calcularPromedio();
                case 4 -> {
                    System.out.print("Ingresa la nota a buscar: ");
                    int buscar = sc.nextInt();
                    notaManager.buscarNota(buscar);
                }
                case 5 -> {
                    System.out.println("¿Cómo deseas eliminar?");
                    System.out.println("1. Por posición (índice)");
                    System.out.println("2. Por valor (nota)");
                    int tipo = sc.nextInt();

                    if (tipo == 1) {
                        System.out.print("Ingresa la posición: ");
                        int pos = sc.nextInt();
                        notaManager.eliminarPorPosicion(pos);
                    } else if (tipo == 2) {
                        System.out.print("Ingresa el valor de la nota a eliminar: ");
                        int valor = sc.nextInt();
                        notaManager.eliminarPorValor(valor);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                }
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
