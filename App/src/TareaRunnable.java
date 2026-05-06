public class TareaRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Usamos Thread.currentThread().getName() porque al ser Runnable no heredamos directamente los métodos de Thread
            System.out.println(Thread.currentThread().getName() + " (Runnable) - Número: " + i);
        }
    }
}
