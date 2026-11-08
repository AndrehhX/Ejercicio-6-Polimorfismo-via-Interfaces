package gt.uvg.poo.ejercicio6.modelo;

public class CertificadorFEL extends IntegracionAPI implements Documentable {
    private final String nitCertificador;

    public CertificadorFEL(String identificador, String nombre, String proveedor,
                           String endpoint, boolean activa, double latenciaPromedio,
                           String nitCertificador) {
        super(identificador, nombre, proveedor, endpoint, activa, latenciaPromedio);
        this.nitCertificador = nitCertificador;
    }

    public String getNitCertificador() { return nitCertificador; }

    @Override
    public String generarDocumento(String referencia) {
        registrarAccion("Certificación de factura " + referencia);
        return "XML-FEL-" + referencia;
    }

    @Override
    public String toString() {
        return super.toString() + " | NIT del certificador=" + nitCertificador;
    }
}
