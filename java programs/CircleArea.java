import java.util.Scanner;

public class CircleArea 
{
    //write calculateArea method

    //TODO Auto-generated method stub
    //take radius from user and pass it to method calculateArea
    //print area in main method

    public float calculateArea(float r) 
    {
        float a=3.14f*r*r; //you have to write '34.3f'
        return a;
    }

    public static void main(String[] args) 
    {
        float r,res; //declaring r,res
        Scanner in=new Scanner(System.in); //takes the input from the user
        System.out.println("enter radius");
        r=in.nextFloat();

        CircleArea c1=new CircleArea();
        res=c1.calculateArea(r);

        System.out.println("area of circle:"+res);
    }
}
