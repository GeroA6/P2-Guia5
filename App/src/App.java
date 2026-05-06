public class App {
    public static void main(String[] args) throws Exception {
        Contador contador = new Contador();

        // Creamos la tarea que incrementa el contador
        Runnable tarea = () -> {
            for (int i = 0; i < 10000; i++) {
                contador.incrementar();
            }
        };

        Thread hilo1 = new Thread(tarea, "Hilo 1");
        Thread hilo2 = new Thread(tarea, "Hilo 2");

        hilo1.start();
        hilo2.start();

        // Esperamos a que los hilos terminen
        hilo1.join();
        hilo2.join();

        System.out.println("Valor esperado: 20000");
        System.out.println("Valor final del contador (Bloque Sincronizado): " + contador.getCuenta());
    }
}
