public class App {
    public static void main(String[] args) throws Exception {
        TareaLargaDuracion tarea = new TareaLargaDuracion();
        Thread hiloSecundario = new Thread(tarea, "Hilo-Secundario");

        hiloSecundario.start();

        // Pausamos el hilo principal por 3 segundos para que el hilo secundario avance un poco
        Thread.sleep(3000);

        // En lugar de esperar a que termine todos los pasos, lo interrumpimos
        System.out.println("Hilo Principal: Interrumpiendo el hilo secundario...");
        hiloSecundario.interrupt();

        // Utilizamos join() para esperar a que el hilo secundario termine de cerrar tras la interrupción
        hiloSecundario.join();
        System.out.println("Hilo Principal: Hilo secundario finalizado. Fin del programa.");
    }
}
