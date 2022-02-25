public class day5 {

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

        marr[0]=23.4f; //allocate data
        marr[1]=23.4f; 
        marr[2]=23.4f; 
        marr[3]=23.4f; 
        marr[4]=23.4f; 

        ArrayToMethod o1=new ArrayToMethod(); // this is creating a new arraytomethod
        o1.displayArr(marr); //

    }
    
}
