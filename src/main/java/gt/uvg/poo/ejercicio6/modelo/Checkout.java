package gt.uvg.poo.ejercicio6.modelo;

public class Checkout {
    public void procesarReintegro(Transaccional servicio, double monto) {
        servicio.reintegrar(monto);
    }

    // Sobrecarga para aceptar cualquier integración sin forzarla a ser transaccional.
    public void procesarReintegro(IntegracionAPI servicio, double monto) {
        if (servicio instanceof Transaccional) {
            procesarReintegro((Transaccional) servicio, monto);
        } else {
            System.out.println("Reintegro ignorado: " + servicio.getNombre()
                    + " no ofrece operaciones financieras.");
        }
    }
}
