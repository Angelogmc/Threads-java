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

        // Vantagem do uso de Thread:
        // A tendencia cada vez maior dos sistemas multicore (múltiplos núcleos) cria a necessidade de projetar
        // SOs e aplicações que usem todos da melhor maneira possível. Para isso o uso de Threads é indispensável
        // pois ela permite executar etapas diferentes ao mesmo tempo enquanto houver núcleo disponível, o que 
        // permite um quase paralelismo, aumentando o desempenho. O uso de thread permite também que diversas
        // execuções ocorram no mesmo espaço de endereçamento e de forma independente.

    }

}