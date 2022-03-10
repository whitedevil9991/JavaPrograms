public class AnimalTest {
    
    public static void main(String[] args) {
        
        /*Animal a1=new Animal();
        System.out.println(a1);
        a1.eat;
        Animal a2=new Animal("non_veg",4);
        System.out.println(a2);*/

        Cat c1=new Cat();
        System.out.println(c1);
        c1.eat();
        System.out.println("c1 hashcode:"+c1.hashCode());

        Cat c2=new Cat("non-veg",4,"white");
        System.out.println(c2);
        System.out.println("c2 hashcode:"+c2.hashCode());
        Cat cc=c2;
        System.out.println("cc hashcode:"+cc.hashCode());

        Dog d1=new Dog();
        System.out.println(d1);
        d1.eat();
        Dog d2=new Dog("non-veg",4,"brown");
        System.out.println(d2);

        Animal a11=new Cat("non-veg",4,"brown");
        a11.eat();
        
        a11=new Dog("non-veg",4,"pomolian");
        a11.eat();
        /**Dynamic polymorphism =method overriding
         * All the classes  in inheritance will have class name
         */
    }
    
}
