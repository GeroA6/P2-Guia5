public class App {
    public static void main(String[] args) throws Exception {
        TareaRunnable tarea = new TareaRunnable();

        Thread hilo1 = new Thread(tarea, "Hilo-Baja-Prioridad");
        Thread hilo2 = new Thread(tarea, "Hilo-Alta-Prioridad");

        hilo1.setPriority(1);  // Prioridad mínima
        hilo2.setPriority(10); // Prioridad máxima

        hilo1.start();
        hilo2.start();
    }
}
