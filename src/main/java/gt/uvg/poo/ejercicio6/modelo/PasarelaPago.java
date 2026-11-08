package gt.uvg.poo.ejercicio6.modelo;

public class PasarelaPago extends IntegracionAPI implements Transaccional {
    private final String moneda;

    public PasarelaPago(String identificador, String nombre, String proveedor,
                        String endpoint, boolean activa, double latenciaPromedio,
                        String moneda) {
        super(identificador, nombre, proveedor, endpoint, activa, latenciaPromedio);
        this.moneda = moneda;
    }

    @Override
    public void cobrar(double monto) {
        registrarAccion("Cobro de " + moneda + " " + monto);
    }

    @Override
    public void reintegrar(double monto) {
        registrarAccion("Reintegro de " + moneda + " " + monto);
    }

    @Override
    public String toString() {
        return super.toString() + " | moneda=" + moneda;
    }
}
