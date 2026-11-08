package gt.uvg.poo.ejercicio6.modelo;

import java.util.Objects;

public abstract class IntegracionAPI implements Comparable<IntegracionAPI>, Auditable {
    private final String identificador;
    private final String nombre;
    private final String proveedor;
    private final String endpoint;
    private boolean activa;
    private double latenciaPromedio;

    public IntegracionAPI(String identificador, String nombre, String proveedor,
                          String endpoint, boolean activa, double latenciaPromedio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.proveedor = proveedor;
        this.endpoint = endpoint;
        this.activa = activa;
        this.latenciaPromedio = latenciaPromedio;
    }

    public String getIdentificador() { return identificador; }
    public String getNombre() { return nombre; }
    public String getProveedor() { return proveedor; }
    public String getEndpoint() { return endpoint; }
    public boolean isActiva() { return activa; }
    public double getLatenciaPromedio() { return latenciaPromedio; }
    public void setActiva(boolean activa) { this.activa = activa; }
    public void setLatenciaPromedio(double latenciaPromedio) {
        this.latenciaPromedio = latenciaPromedio;
    }

    @Override
    public void registrarAccion(String accion) {
        System.out.println("[Auditoría " + identificador + "] " + accion);
    }

    @Override
    public int compareTo(IntegracionAPI otra) {
        return Double.compare(latenciaPromedio, otra.latenciaPromedio);
    }

    @Override
    public String toString() {
        return identificador + " | " + nombre + " | proveedor=" + proveedor
                + " | endpoint=" + endpoint + " | estado="
                + (activa ? "Conectada" : "Desconectada")
                + " | latencia=" + latenciaPromedio + " ms";
    }

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true;
        if (!(objeto instanceof IntegracionAPI)) return false;
        IntegracionAPI otra = (IntegracionAPI) objeto;
        return identificador.equals(otra.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }
}
