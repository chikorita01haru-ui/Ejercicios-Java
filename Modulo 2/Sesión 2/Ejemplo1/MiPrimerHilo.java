

public class MiPrimerHilo extends Thread{

    //Lo que sea que esté en el método run()
    //se ejecutará de manera concurrente

    @Override 
    public void run(){
        for(int 1=0; i<1000;i++){
            System-out.println("=> "+1);
        }
    }
}