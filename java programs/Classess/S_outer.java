public class S_outer //static outer class
 {
    /* 1)Static method can only access STATIC DATA
     * 2)STATIC INNER CLASS can only access STATIC OUTER CLASS MEMBERS
     * 3)Inner class with STATIC keyword is known as static inner class
     * 4)To ACCESS other OUTER CLASS you need to CREATE OUTER CLASS OBJECT and
     *   CALL METHODS of OUTER CLASS in INNER CLASS
     * 5)One object of static inner class is shared by all objects of outer class
     * 6)It does not share any special relationship with outer class
     * 7)Inner class objects are created either by using outer class name as in static
     * which is optional
     * EX : interest rate class in bank account objects.
    */

    private int o;
    public S_outer() {
        o=100;
    }
    public S_outer(int o1) {
        o=o1;
    }
    public void SODisplay() {
        System.out.println("in Router :"+o);
    }
    static class SInner {
        private int i;
        public SInner() {
            i=300;
        }
        public SInner(int x) {
            i=x;
        }
        public void SIDisplay() {
            System.out.println("inside SInner :"+i);
        }
    }
    public static void main(String[] args) {
        S_outer s1=new S_outer();
        s1.SODisplay();

        S_outer.SInner in=new S_outer.SInner(); 
        //to create a object in inner class you need the name of outer class
        //S_outer.SInner = (S_outer is outer class name)(SInner is inner class name)
        in.SIDisplay();

        //can directly create objects without using outer class name like this
        SInner in1=new SInner(); 
        in1.SIDisplay();
    }
}
