import javax.tools.ForwardingFileObject;

public class DemoInheritance 
{
    public class Animal { 
        //here you are declaring three things below under private access modifiers
        private String food_type;
        private int no_of_legs;
        private String type;

        public Animal() {
            food_type="Carnivore";
            no_of_legs=2;  
        }
    }

    public Animal(String f,int n,String t) {
        //this is a constructor with parameters
        food_type="Omnivore";
        no_of_legs=4;
        type="mammal";
    }
    public void eat(){
        System.out.println("Animal eats");
    }
    public String toString() {
        return "food type:"+food_type+"no of legs"+no_of_legs+"type"+type;
    }

    public static void main(String[] args) {
        return "food type"+food_type+"no of legs"+no_of_legs+"type"+type;
        //TODO auto-generated method stub
    }
    
}
 