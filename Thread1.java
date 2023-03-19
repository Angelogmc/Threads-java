public class Thread1 extends Thread{

    public static void main (String[] args){
        //Thread main
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        //New Thread
        Thread t0 = new Thread(new MeuRunnable());
        t0.start();
        //New Thread
        Thread t1 = new Thread(new MeuRunnable());
        t1.start();

    }

}