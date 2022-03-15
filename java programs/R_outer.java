import DemoInheritance.InnerClass.R_outer.RInner;

public class InnerClass {
    /**inner classes only accessible through outer class so more secure
     * they are hidden and cannot be accessed by outside
     * outer class private members are directly accessible by inner class
     * where as the vice versa is not possible
     * 
     * inner classes are secure as they are only accessible through outer class
     * Types of inner class :
     * 1)Regular inner class
     * 2)Static inner class 
     * 3)Method local inner class
     * 4)Ananymous inner class: anonymous inner classes are replaced by lamda expression in js
     * 
     * Regular inner class=a class inside a class
     * one outer class object can have multiple inner class objects
     * 
     * 
     */
    public class R_outer //regular inner class
    {
        private int o;

        public R_outer()  //outer class
        {
            o=100;
        }
        public R_outer(int o1){
            o=o1;
        }
        public void RODisplay() {
            System.out.println("im Router"+o);
        }
        class RInner //inner class
        {
            private int i;

            public RInner(){
                i=230;
            }
            public RInner(int x){
                i=x;
            }
            public void RODisplay(){
                System.out.println("inside Rinner:"+i+o);
            }
        }
    }
    public static void main(String[] args) {
        R_outer r=new R_outer();
        r.RODisplay();

        RInner in=r.new RInner();
        in.RIDisplay();
        RInner in2=r.new RInner();
        in2.RODisplay();
    }
    
}
