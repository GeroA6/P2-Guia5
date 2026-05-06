public class Contador {
    private int cuenta = 0;

    public synchronized void incrementar() {
        cuenta++; // Esta operación no es atómica
    }

    public int getCuenta() {
        return cuenta;
    }
}
