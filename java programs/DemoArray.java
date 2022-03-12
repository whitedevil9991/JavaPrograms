public class DemoArray {
//DemoArray program
/*
Array = to store multiple things.
Array is a group of data/object which is of similar data type stores in continous memory location
Array has a fixed size
Array values can be accessed or stored by using index which always starts with 0

1.create a array with 10 elements and print only odd index values
2.create a array with 5 float elements, take values from user and print it with both
enhanced and traditional for loop
3.create a array "num" of 5 integers, calculate square of each element and store it in a 
new array "square"
num 4,7,2,5
square 16,49,4,25
*/

    public void displayArr(float a[])  
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        // TODO auto-generated method sub
        //float m1,m2,m3,m4,m5;

    float m1;

    //int[]arr1;
    //arr1= new int[7];

    int[] arr1=new int[7];
    arr1[0]=89;
    arr1[1]=56;
    arr1[2]=89;
    arr1[3]=56;
    arr1[4]=89;
    arr1[5]=56;
    arr1[6]=89;

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


    //to display, use the loop
    for(int i=0;i<marr.length;i++)
    {
        System.out.println("enter "+i+"array element");
        marr[i]=in.nextFloat();
    }
    /*
    declare a integer array with 5 elements, take array elements as input from user
    and display them
    */

}
}
