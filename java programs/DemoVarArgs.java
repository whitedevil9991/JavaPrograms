public class DemoVarArgs {
    /* 
    varargs mean variable arguements
    It used with (...) known as elipse operator
    Works same as an array
    One method can have only one parameter as elipse
     */
    public void multiply(String s,float f,int... n){
    /*
    this is a class named multiply with a parameter 
    you can use the 'elipse' only at the end i.e '.....n'
    you are taking multiple n variables 
    */
        int m=1;
        for(int t:n) {
            m=m*n[i]; //same as ( m*n[i] = m*t )
        
        /* same as the above for loop 
        for(int i=0;i<n.length;i++)
        {
            m=m*n[i];
        } */
        
        System.out.println("multiplication :"+m);
        }
    }

    public static void main(String[] args){
        DemoVarArgs d1=new DemoVarArgs(); //creating a DemoVarArgs object named 'd1'
        d1.multiply();
        d1.multiply(12,2);
        d1.multiply(15,5,2);
        d1.multiply(12,23,11,5);
    }
    
}
