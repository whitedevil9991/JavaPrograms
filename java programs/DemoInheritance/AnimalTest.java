public class AnimalTest 
{
    public static void main(String[] args)
    {
       
        Animal a1=new Animal(); 
        // creating a object using previous Animal program named a1
        System.out.println(a1);

        Bird a2=new Bird(); 
        //creating a object using previous Animal program named a2
        System.out.println(a2);

        Cat c1=new Cat();
        System.out.println(c1);

        Cat c2=new Cat("non-veg",4,"white"); //creating a new object with parameters
        System.out.println(c2);
        }
    
}
