public class TareaRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Utilizamos Thread.currentThread() para imprimir la identidad completa del hilo (Nombre, Prioridad, Grupo)
            System.out.println("Identidad: " + Thread.currentThread() + " - Número: " + i);
        }
    }
}
