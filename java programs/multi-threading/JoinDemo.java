public class JoinDemo extends Thread
{

    JoinDemo(String s){
        super(s);
    }
    public run() {
        if(Thread.currentThread().getName().equals("t1")) 
        {
            for(int i=1;i<=5;i++) 
            {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            else if(Thread.currentThread().getName().equals("t2")) 
            {
                for(int i=11;i<=15;i++)
                    System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }

    public static void main(String[] args) 
            {
                System.out.println("main thread starts");
            
            Thread t1=new JoinDemo("t1");
            t1.start();

            Thread t2=new JoinDemo("t2");
            t2.start();

            Thread a1=new JoinDemo("a1");
            a1.start();

            System.out.println("Is it alive?"+t2.isAlive());
            t2.join();
            System.out.println("Is it alive?"+t2.isAlive());
            }
}
