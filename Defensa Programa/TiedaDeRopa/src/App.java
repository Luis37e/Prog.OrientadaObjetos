import java.util.Scanner;
import java.util.ArrayList;

public class App {
    private static ArrayList<Prenda> inventario = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea después de nextInt()

            switch (opcion) {
                case 1:
                    agregarPrenda();
                    break;
                case 2:
                    eliminarPrenda();
                    break;
                case 3:
                    mostrarInventario();
                    break;
                case 4:
                    guardarInventario();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 5);

        scanner.close(); // Cerrar el scanner al finalizar el programa
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Menú de opciones ---");
        System.out.println("1. Agregar prenda");
        System.out.println("2. Eliminar prenda");
        System.out.println("3. Mostrar inventario");
        System.out.println("4. Guardar inventario");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void agregarPrenda() {
        System.out.println("\nTipos de prendas disponibles:");
        System.out.println("1. Camiseta");
        System.out.println("2. Pantalón");
        System.out.println("3. Calzado");
        System.out.println("4. Vestido");
        System.out.print("Seleccione el tipo de prenda que desea agregar: ");
        int tipoPrenda = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de nextInt()
    
        System.out.print("Ingrese el nombre de la prenda: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el código de la prenda: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese el precio de la prenda: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consume el salto de línea después de nextDouble()
        System.out.print("Ingrese el costo de la prenda: ");
        double costo = scanner.nextDouble();
        scanner.nextLine(); // Consume el salto de línea después de nextDouble()
        System.out.print("Ingrese la descripción de la prenda: ");
        String descripcion = scanner.nextLine();
        System.out.print("Ingrese la talla de la prenda: ");
        String talla = scanner.nextLine();
        
    
        // Crear instancia de la prenda según el tipo seleccionado y agregar al inventario
        Prenda nuevaPrenda = null;
    
        switch (tipoPrenda) {
            case 1:
                nuevaPrenda = new Camiseta(nombre, codigo, precio, costo, descripcion, talla);
                break;
            case 2:
                nuevaPrenda = new Pantalon(nombre, codigo, precio, costo, descripcion, talla);
                break;
            case 3:
                nuevaPrenda = new Calzado(nombre, codigo, precio, costo, descripcion, talla);
                break;
            case 4:
                nuevaPrenda = new Vestido(nombre, codigo, precio, costo, descripcion, talla);
                break;
            default:
                System.out.println("Tipo de prenda no válido.");
                return; // Exit method if tipoPrenda is not valid
        }

        double ganancia = precio - costo;
    
        // Agregar nuevaPrenda al inventario
        inventario.add(nuevaPrenda);
        System.out.println("Prenda agregada al inventario correctamente.");
        System.out.println("Ganancia de la prenda: " + ganancia);
    }

    private static void eliminarPrenda() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío. No hay prendas para eliminar.");
            return;
        }

        System.out.print("Ingrese el número de la prenda que desea eliminar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea después de nextInt()

        if (indice < 1 || indice > inventario.size()) {
            System.out.println("Índice no válido. No se eliminó ninguna prenda.");
        } else {
            Prenda eliminada = inventario.remove(indice - 1);
            System.out.println("Se ha eliminado la siguiente prenda del inventario: " + eliminada.nombreProducto);
        }
    }

    private static void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario de prendas:");
            for (Prenda prenda : inventario) {
                prenda.mostrarDetalles();
                System.out.println("----------------------------------");
            }
        }
    }

    private static void guardarInventario() {
        // Lógica para guardar el inventario en un archivo
        System.out.println("Inventario guardado correctamente.");
    }
}