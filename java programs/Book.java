public class Book 
{
    private String author;
    private float price;
    private String publication;

    public Book() 
    //default constructor = same name as class and dont have parameters
    {
        author="Aurthur";
        price=23.3f;
        publication="SR publications";
    }

    public Book(String a,float p,String b)
    //constructor with parameters
    {
        author=a;
        price=p;
        publication=b;   
    }
    public display() 
    //class named display
    {
        System.out.println("author name"+author+"\t price"+price+"\t publication"+publication);
    }
    public static void main(String[] args) 
    {
        pu
    }
    
}
