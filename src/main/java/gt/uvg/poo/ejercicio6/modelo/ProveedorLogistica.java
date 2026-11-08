package gt.uvg.poo.ejercicio6.modelo;

public class ProveedorLogistica extends IntegracionAPI implements Documentable {
    private final String paisCobertura;

    public ProveedorLogistica(String identificador, String nombre, String proveedor,
                              String endpoint, boolean activa, double latenciaPromedio,
                              String paisCobertura) {
        super(identificador, nombre, proveedor, endpoint, activa, latenciaPromedio);
        this.paisCobertura = paisCobertura;
    }

    public String getPaisCobertura() { return paisCobertura; }

    public String rastrearPaquete(String guia) {
        registrarAccion("Consulta de rastreo " + guia);
        return "Paquete " + guia + ": en tránsito";
    }

    @Override
    public String generarDocumento(String referencia) {
        registrarAccion("Generación de guía " + referencia);
        return "GUIA-" + referencia;
    }

    @Override
    public String toString() {
        return super.toString() + " | cobertura=" + paisCobertura;
    }
}
