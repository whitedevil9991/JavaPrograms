public class DemoArray {
//DemoArray program
// array = to store multiple things

    public static void main(String[] args) {


        
    float[] marr; //declaration
    marr=new float[5]; //memory allocation

    marr[0]=23.6f;//allocate data
    marr[1]=25.6f;
    marr[2]=26.6f;
    marr[3]=27.6f;
    marr[4]=28.6f;

    //OR
    
    float[] marr1={45.6f,34.5f,32.4f,34.4f}; //single line allocation and declaration
    /* System.out.println(marr1[0])
    System.out.println(marr1[0])
    System.out.println(marr1[1])
    System.out.println(marr1[2])
    System.out.println(marr1[3])*/


    //to display, use for loop
    for(int i=0;i<marr.length;i++)
    {
        System.out.println("enter "+i+"array element");
        marr[i]=in.nextFloat();
    }

}
}
