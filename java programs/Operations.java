//method overloading 
public class Operations 
{

    public void add(int n1, int n2) 
    {
        int sum=n1+n2;
        System.out.println("addition :"+sum);
    }
    public void add(int n1, int n2,int n3) 
    {
        float sum=n1+n2+n3;
        System.out.println("addition in float"+sum);
    }
    public void add(flaot n1,float n2) 
    {
        floar sum=n+f;
        System.out.println("addition"+sum);
    }
    public void add(int n,float f) 
    {
        float sum=n+f;
        System.out.println("addition :"+sum);
    }
    public void add(float n, int f) 
    {
        float sum=n+f;
        System.out.println("addition of int and float:"+sum);
        return sum;
    }
    public static void main(String[] args) //main method
    {
        Operation o1=new Operation(); //creating object named Operation
        o1.add(10, 20);
        o1.add(34.4f, 34.4f);
        o1.add(12,23,32,32);
    }
    /*method overloading = many methods in the same class
    have same name but have different parameters i.e
     (different datatype)*/
}
