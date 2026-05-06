public class App {
    public static void main(String[] args) throws Exception {
        // Creamos una única instancia de la tarea
        TareaRunnable tarea = new TareaRunnable();
        
        // Le pasamos la tarea al constructor de la clase Thread (y opcionalmente le damos un nombre al hilo)
        Thread hilo1 = new Thread(tarea, "Hilo 1");
        Thread hilo2 = new Thread(tarea, "Hilo 2");
        
        hilo1.start();
        hilo2.start();
    }
}
