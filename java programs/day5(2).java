public class day5(2) {

    //ArrayToMethod

    public void displayArr(float a[]) //declaration
    {
        for(int i=0;i<a.length;i++) 
        {
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args) 
    {
        float[] marr; //declaration
        marr=new float[5]; //memory allocation
    

        Scanner in=new Scanner(System.in);//creating a scanner to take input from user
        float t;//declaration
        for(int i=0;i<marr.length;i++) //condition
        {
            System.out.println("Enter "+i+"array element");
            marr[i]=in.nextFloat(); //
        }
        ArrayToMethod o1=new ArrayToMethod
    }
}