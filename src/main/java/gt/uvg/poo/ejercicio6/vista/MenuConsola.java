package gt.uvg.poo.ejercicio6.vista;

import gt.uvg.poo.ejercicio6.modelo.CatalogoIntegraciones;
import gt.uvg.poo.ejercicio6.modelo.IntegracionAPI;
import java.util.Scanner;

public class MenuConsola {
    private final Scanner entrada = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n=== Integraciones de comercio electrónico ===");
        System.out.println("1. Listar integraciones activas");
        System.out.println("2. Buscar integración por identificador");
        System.out.println("3. Ordenar integraciones por latencia");
        System.out.println("4. Probar reintegro (incluye proveedor logístico)");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
        try {
            return Integer.parseInt(entrada.nextLine());
        } catch (NumberFormatException error) {
            return -1;
        }
    }

    public String pedirIdentificador() {
        System.out.print("Identificador (por ejemplo, LOG-01): ");
        return entrada.nextLine().trim();
    }

    public void listarActivas(CatalogoIntegraciones catalogo) {
        System.out.println("\nIntegraciones activas:");
        for (IntegracionAPI integracion : catalogo.getIntegraciones()) {
            if (integracion.isActiva()) System.out.println(integracion);
        }
    }

    public void mostrarDetalle(IntegracionAPI integracion) {
        if (integracion == null) System.out.println("No se encontró esa integración.");
        else System.out.println(integracion);
    }

    public void listarTodas(CatalogoIntegraciones catalogo) {
        for (IntegracionAPI integracion : catalogo.getIntegraciones()) {
            System.out.println(integracion);
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
