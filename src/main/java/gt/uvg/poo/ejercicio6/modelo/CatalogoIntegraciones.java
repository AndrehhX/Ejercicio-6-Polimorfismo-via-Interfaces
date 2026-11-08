package gt.uvg.poo.ejercicio6.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatalogoIntegraciones {
    // Una sola lista polimórfica guarda todos los tipos de integración.
    private final List<IntegracionAPI> integraciones = new ArrayList<>();

    public CatalogoIntegraciones() {
        cargarDatosIniciales();
    }

    private void cargarDatosIniciales() {
        integraciones.add(new PasarelaPago("PAG-01", "Tarjeta", "Visa", "https://api.visa.test", true, 120, "GTQ"));
        integraciones.add(new PasarelaPago("PAG-02", "Tarjeta", "Mastercard", "https://api.mastercard.test", true, 135, "GTQ"));
        integraciones.add(new PasarelaPago("PAG-03", "Billetera digital", "PayPal", "https://api.paypal.test", true, 190, "USD"));
        integraciones.add(new PasarelaPago("PAG-04", "Transferencia bancaria", "Banco Uno", "https://api.bancouno.test", true, 260, "GTQ"));
        integraciones.add(new PasarelaPago("PAG-05", "Billetera digital", "NeoPay", "https://api.neopay.test", false, 220, "GTQ"));
        integraciones.add(new ProveedorLogistica("LOG-01", "Envíos nacionales", "Cargo Expreso", "https://api.cargoexpreso.test", true, 310, "Guatemala"));
        integraciones.add(new ProveedorLogistica("LOG-02", "Envíos nacionales", "Guatex", "https://api.guatex.test", true, 280, "Guatemala"));
        integraciones.add(new ProveedorLogistica("LOG-03", "Envíos internacionales", "DHL", "https://api.dhl.test", true, 410, "Internacional"));
        integraciones.add(new CertificadorFEL("FEL-01", "Certificación FEL", "Infile", "https://api.infile.test", true, 350, "NIT-DEMO-01"));
        integraciones.add(new CertificadorFEL("FEL-02", "Certificación FEL", "Megaprint", "https://api.megaprint.test", true, 330, "NIT-DEMO-02"));
    }

    public List<IntegracionAPI> getIntegraciones() {
        return Collections.unmodifiableList(integraciones);
    }

    public IntegracionAPI buscarPorIdentificador(String identificador) {
        for (IntegracionAPI integracion : integraciones) {
            if (integracion.getIdentificador().equalsIgnoreCase(identificador)) {
                return integracion;
            }
        }
        return null;
    }

    public void ordenarPorLatencia() {
        Collections.sort(integraciones);
    }

    public void agregar(IntegracionAPI integracion) {
        integraciones.add(integracion);
    }
}
