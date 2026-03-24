public class CajaMisteriosaMain {
    public static void (String ... args){
        CajaMisteriosa<String> cajita = new CajaMisteriosa();

        cajita.guardar("Hola Mundo");

        String valor = cajira.sacar(); //ERROR
        
        System.out.println("El valor de la caja es => "+valor);
        CajaMisteriosa<Integer> cajitaNumeros = new CajaMisteriosa<>();
        cajitaNumeros.guardar(1);


    }

}

//herencia vas de lo alto a lo general

//polimorfismo  va de lo general a lo alto