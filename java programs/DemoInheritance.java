import javax.tools.ForwardingFileObject;

public class DemoInheritance 
{
    public class Animal 
    {
        private String food_type;
        private int no_of_legs;
        private String type;

        public Animal() 
        {
            food_type="Carnivore";
            no_of_legs=2;  
        } //here you alloted values to the default constructor
    }

    public Animal(String  f,int n,String t)
    {
        food_type="Omnivore";
        no_of_legs=4;
        type="mammal";
    }

    public static void main(String[] args) 
    {
        //TODO auto-generated method stub
    }
    
}
