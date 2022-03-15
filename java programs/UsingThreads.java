public class UsingThreads {

    /**1)process: any program in execution
     * 2)multiprocessing : multiple process execute at the same time
     * 3)cpu internally gives timespan to each process is so small that we feel
     * processes running at the same time
     * 4)we feel processes running at the same time
     * 5)multiprocessing is resource heavy
     * 6)communication between two process will not be possible coz 
     * cpu can do one process at a time
     * 7)
     * 
     */
    public UsingThreads(String s) {
        super(s);
    }
    public void run() {
        if(Thread.currentThread().getName().equals("one")) {
            System.out.println("hello"+Thread.currentThread().getName());
        }
    }
}
