package gt.uvg.poo.ejercicio6;

import gt.uvg.poo.ejercicio6.controlador.ControladorIntegraciones;
import gt.uvg.poo.ejercicio6.modelo.CatalogoIntegraciones;
import gt.uvg.poo.ejercicio6.modelo.Checkout;
import gt.uvg.poo.ejercicio6.vista.MenuConsola;

public class Main {
    public static void main(String[] args) {
        CatalogoIntegraciones catalogo = new CatalogoIntegraciones();
        MenuConsola vista = new MenuConsola();
        Checkout checkout = new Checkout();
        ControladorIntegraciones controlador =
                new ControladorIntegraciones(catalogo, vista, checkout);
        controlador.iniciar();
    }
}
