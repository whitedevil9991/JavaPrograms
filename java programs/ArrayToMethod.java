import java.util.Scanner;
public class ArrayToMethod {

    //ArrayToMethod

    public void displayArr(float a[]){
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args)  //main method
    {
        float[] marr; //declaration
        marr=new float[5]; //memory allocation

        /* marr[0]=23.4f; //allocate data
        marr[1]=23.4f; 
        marr[2]=23.4f; 
        marr[3]=23.4f; 
        marr[4]=23.4f; 
        */
    
        Scanner in=new Scanner(System.in);
        //creating a scanner to take input from user
        float t;//declaration

        for(int i=0;i<marr.length;i++) {
            System.out.println("Enter "+i+"array element");
            marr[i]=in.nextFloat(); //
        }
        System.out.println("array by using enhanced for loop");

        //enhance for loop/foreach loop
        for(float t:marr){
            System.out.println(t);
        }
        ArrayToMethod o1=new ArrayToMethod();
        o1.displayArr(marr);
    }
}