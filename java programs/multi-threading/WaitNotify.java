public class WaitNotify {

    /**1)wait() notify() and notifyAll() are object class method
     * and also monitor object method and they should be always in 
     * synchronised method or block
     * 2)these three methods are used for synchronisation
     * 3)wait:when wait is called thread will stop execution and 
     * wait for notification
     * 4)notify:when notify method is called a thread who is waiting 
     * will start it execution again
     * 5)notifyAll:when notifyAll method is called all thread who
     * are waiting start their execution.
     */


     /*1)there are two threads in the program.
     2)one is the main thread
     3)second does(ThreadB) the addition 
     4)which thread executes first depends upon the CPU
     */
     public static void main(String[] args) {
         ThreadB b=new ThreadB();
         b.start();

         synchronized(b){
             try{
                 System.out.println("waiting for b to complete...");
                 b.wait();
             }
             catch(InterruptedException e)
             {
                 e.printStackTrace();
             } 
             System.out.println("average is:"+b.total/100.0f);            
         }
     }
    
     class ThreadB extends Thread {

         int total;

         public void run() {
             synchronized(this) {
                 for (int i=1;i<100;i++)
                 {
                     total+=i;
                 }
                 notify();
             }
         }
     }
    
}
