public class UsingThreads extends Thread //Thread = implements multi-threading
{

    /**MULTI-PROCESSING
     * 1)process: any program in execution
     * 2)multiprocessing : multiple process execute at the same time
     * 3)cpu internally gives timespan to each process is so small that we feel
     * processes running at the same time
     * 4)we feel processes running at the same time
     * 5)multiprocessing is resource heavy
     * 6)communication between two process will not be possible coz 
     * cpu can do one process at a time
     * 
     * MULTI-THREADING
     * 7)one java application consists of many methods
     * 8)multi-threaded = execute multiple methods at a time = multiple threads get executed at same time
     * 9)thread:part (method) of a application
     * 10)multi-thread - lightweight coz all threads are a part of one process
     * 11)communication between two threads is possible
     * 
     * USES OF MULTI-THREADING
     * 1)faster execution thus saving time
     * 2)if want to wait for thread execution
     * 3)multiple things can be executed at same time
     * 
     * 
     * WAYS TO DO MULTITHREADING
     * 1)thread class
     * 2)runnable interface--run (it's a method)
     * public class abc extends xyz implements Runnable
     * 
     * 
     * Thread LifeCycle:
     * born(new)---runnable (schedule(start())---running the run()---dead 
     *                                                |sleep (just a nap)
     *                                                |wait,notify,notifyAll (locking stage= pauses)
     *                                                |IO block (input-output block)()
     * 
     * METHODS IN THREAD :
     * run()--runnable
     * start()
     * sleep()
     * currentThread()
     * Thread.currentThread() = differentiates between threads and can prioritise 
     * getName() = gives the current executed thread
     * 
     * wait, stop, interrupt, sleep = stops the threads
     */
    public UsingThreads(String s) {
        super(s);              //
    }
    public void run()          //whenevr u use multi-threading u use run() method
    {
        while(true)            //if this includes this will go on a infinite loop
        {
        if(Thread.currentThread().getName().equals("one")) 
        {
            System.out.println("hello"+Thread.currentThread().getName());
        }
        else if(Thread.currentThread().getName().equals("two")) {
            System.out.println("bye"+Thread.currentThread().getName());
        }
        try {
            Thread.sleep(500);  //static method, this gives a 500ms break to the execution
        }
        catch(InterruptedException ie) {
            ie.printStackTrace();
        }
    }
    }
    public static void main(String[] args) {
        Thread t1=new UsingThread("one");  //create a thread
        t1.start();                        //this starts the thread

        Thread t2=new UsingThread("two");
        t2.start();

        System.out.println("in main");
    }
}
