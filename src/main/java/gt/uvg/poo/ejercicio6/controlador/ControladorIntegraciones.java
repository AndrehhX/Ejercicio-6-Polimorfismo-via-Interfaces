package gt.uvg.poo.ejercicio6.controlador;

import gt.uvg.poo.ejercicio6.modelo.CatalogoIntegraciones;
import gt.uvg.poo.ejercicio6.modelo.Checkout;
import gt.uvg.poo.ejercicio6.modelo.IntegracionAPI;
import gt.uvg.poo.ejercicio6.vista.MenuConsola;

public class ControladorIntegraciones {
    private final CatalogoIntegraciones catalogo;
    private final MenuConsola vista;
    private final Checkout checkout;

    public ControladorIntegraciones(CatalogoIntegraciones catalogo,
                                    MenuConsola vista, Checkout checkout) {
        this.catalogo = catalogo;
        this.vista = vista;
        this.checkout = checkout;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    vista.listarActivas(catalogo);
                    break;
                case 2:
                    vista.mostrarDetalle(catalogo.buscarPorIdentificador(vista.pedirIdentificador()));
                    break;
                case 3:
                    catalogo.ordenarPorLatencia();
                    vista.mostrarMensaje("Catálogo ordenado de menor a mayor latencia:");
                    vista.listarTodas(catalogo);
                    break;
                case 4:
                    probarReintegro();
                    break;
                case 0:
                    vista.mostrarMensaje("Hasta luego.");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private void probarReintegro() {
        String identificador = vista.pedirIdentificador();
        IntegracionAPI integracion = catalogo.buscarPorIdentificador(identificador);
        if (integracion == null) {
            vista.mostrarMensaje("No se encontró esa integración.");
        } else {
            checkout.procesarReintegro(integracion, 100.00);
        }
    }
}
