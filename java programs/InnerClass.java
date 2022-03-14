import DemoInheritance.InnerClass.R_outer.RInner;

public class InnerClass {
    /**inner classes are only through outer class so more secure
     * they are hidden and cannot be accessed by outside world
     * outer class private objects are directly accessible by inner class
     * outer class cant access any member of inner class directly
     * 
     * inner classes are secure as they are only accessible through outer class
     * Types of inner class :
     * 1)Regular inner class
     * 2)Static inner class 
     * 3)Method local inner class
     * 4)Ananymous inner class: anonymous inner classes are replaced by lamda expression in js
     * 
     * static method can only access static data
     * static inner class can only access static outer class
     * 
     * one outer class object can have multiple inner class objects
     * 
     * inner class with static keyword is known as static inner class
     * 
     */
    public class R_outer{
        private int o;
        public R_outer() {
            o=100;
        }
        public void RODisplay(int o1) {
            System.out.println("im Router"+o);
        }
        class RInner {
            private int i;
            public RInner(int x){
                i=x;
            }
            public void RODisplay(){
                System.out.println("inside Rinner:"+i);
            }
        }
    }
    public static void main(String[] args) {
        R_outer r=new R_outer();
        r.RODisplay();

        RInner in=r.new RInner();
        in.RIDisplay();
        RInner in2=new RInner();
        in2.RODisplay();
    }
    
}
