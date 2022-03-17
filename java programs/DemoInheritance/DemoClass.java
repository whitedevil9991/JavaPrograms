public class DemoClass {
    public static void main(String[] args) 
    {
        DemoClass d1=new xyz();
        d1.add(12,45);
        d1.display();
        Addable a1=new xyz();
        System.out.println(Addable.f);
        System.out.println(Addable.var);
        Adable.average();
    }

    @Override
    public void add(int n1, int n2) {
        System.out.println("addition is:"+(n1+n2));
    }
    
}
