package gt.uvg.poo.ejercicio6.modelo;

public interface Transaccional {
    void cobrar(double monto);

    void reintegrar(double monto);
}
