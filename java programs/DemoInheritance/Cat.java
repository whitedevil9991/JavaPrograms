public class Cat extends Animal {

    /**Inheritance
     * Extending super class into sub class
     * super class have all common elements
     * sub classes will have all common from super class + its own attributes
     * inheritance is done by using extends keyword 
     * TYPES OF INHERITANCE -- single chain, heirarchy, 
     * in java one sub class can only have one super class
     * i.e multiple inheritance is not suppported in java
     * 
     * A--B----c
     * 
     * a--b---c-----b1 b2  c1-c3
     * super keyword is used only in inheritance
     * used to pass the control from sub class to super class
     * protected keyword is used in inheritance
     * protected members are directly accessible to sub classes
     * 
     * ASSIGNMENT -- create a Dog class with String breed attribute and extends Animal class
     */

   // private String food_type;
   // private int no_of_legs; 
   //-- no need to write these as you are inheriting them using 'extends'
    private String color;

    public Cat(){
        super();
        color="black";
    }
    public Cat(String ft, int n1, String c) {
        super(ft,n1);
        color=c;
    }
    public String toString() {
        return super.toString()+"\t color:"+color;
    }
}
