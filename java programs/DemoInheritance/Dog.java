public class Dog extends Animal{

    public Dog() //created a class name Dog
    {
        super();
        breed="pug";
    }
    public Dog(String f,int n1, Sring b) //created a object with parameters
    {
        super(ft,n1);
        breed=b;
    }
    public String toString(){
        return super.toStirng()+"\t breed:"+breed;
    }
    
}
