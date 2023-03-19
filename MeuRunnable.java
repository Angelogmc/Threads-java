public class MeuRunnable implements Runnable{

    @Override
    public void run() {
        int cont = 0;
        for(int i=0;i<10;i++){
            cont++;
        }
        
        String name = Thread.currentThread().getName();
        System.out.println(name + " " + cont);
        
    }
    
}
