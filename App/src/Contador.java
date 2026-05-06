public class Contador {
    private int cuenta = 0;

    public void incrementar() {
        // Utilizamos un bloque sincronizado para proteger únicamente la sección crítica
        synchronized (this) {
            cuenta++; 
        }
    }

    public int getCuenta() {
        return cuenta;
    }
}
