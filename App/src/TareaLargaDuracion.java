public class TareaLargaDuracion implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + ": Iniciando tarea de larga duración...");
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + ": Trabajando... paso " + i);
                // Simulamos que el procesamiento toma tiempo (1 segundo por iteración)
                Thread.sleep(1000);
            }
            System.out.println(Thread.currentThread().getName() + ": Tarea completada.");
        } catch (InterruptedException e) {
            // Se captura la excepción generada cuando se interrumpe el hilo mientras duerme/espera
            System.out.println(Thread.currentThread().getName() + ": ¡La tarea fue interrumpida de forma forzosa!");
        }
    }
}
