public class App {
    public static void main(String[] args) throws Exception {
        Contador contador = new Contador();

        // Creamos una tarea que incremente el contador 10,000 veces
        Runnable tarea = () -> {
            for (int i = 0; i < 10000; i++) {
                contador.incrementar();
            }
        };

        Thread hilo1 = new Thread(tarea, "Hilo 1");
        Thread hilo2 = new Thread(tarea, "Hilo 2");

        hilo1.start();
        hilo2.start();

        // Esperamos a que ambos hilos terminen su ejecución antes de continuar
        hilo1.join();
        hilo2.join();

        System.out.println("Valor esperado: 20000");
        System.out.println("Valor final del contador (Sincronizado): " + contador.getCuenta());
    }
}
