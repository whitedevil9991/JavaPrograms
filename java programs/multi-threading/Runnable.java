public class Runnable implements Runnable {
    //run method belongs to runnable interface
    @Override                    //
    public void run() {          //run() = compulsary to use multi-threading
        while(true) {
            if(Thread.currentThread().getName().equals("one")) {
                System.out.println("hello"+Thread.currentThread().getName());
            }
            else if(Thread.currentThread().getName().equals()) {
                System.out.println("bye"+Thread.currentThread().getName());
            }
            try {
                Thread.sleep();
            }
            catch(InterruptedException e) {
             //TODO Auto-generated catch block
             e.printStackTrace();   
            }
        }
    }
    public static void main(String[] args) 
    {
        UsingRunnable u1=new UsingRunnable();

        Thread t1=new Thread("one");
        t1.start();

        Thread t2=new Thread("two");
        
    }
    
}
