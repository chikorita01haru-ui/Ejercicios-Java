
// En este caso, la clase "Main" funciona como el hilo principal

public class Main {
    
    public static void main(String[] args) {
        
        // Si heredamos de Thread
        //por medio de un hilo (no recomendado)
        MiPrimerHilo primerHilo = new MiPrimerHilo();

        // Si usamos Runnable// es solo la estructura (recomendado)
        //runnable es un interfaz
        MiSegundoHilo segundoHiloRunnable = new MiSegundoHilo();
        Thread segundoHilo = new Thread(segundoHiloRunnable);

        // Nota: Ejecutar .start() y no .run()
        primerHilo.start();
        segundoHilo.start();
    }
}

/*
 * run() -> Escribir código
 * start() -> Ejecutar
 */
//hilo ejecucion -- puedo ejecutar algo fuera del hilo princicpal, de manera dependiente o ocurrente
//como una carrectera principal y varias que desvian, ya no se pueden juntar o se pueden juntar de nuevo con la principal 
