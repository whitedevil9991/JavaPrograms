import mypack.MyClass; //you can import other class-es like this
import java.util.*; // the * means you are importing the entire java
/**public is accessible anywhere in the package
 * protected is accessible anywhere in the package but 
 * default is same as public
 */
public class MyClassTest {

    public static void main(String[] args) {
        MyClass m1=new MyClass();
        System.out.println("this is:"+m1);

        Class_A a1=new Class_A();
        System.out.println("this is:"+a1);
    }
    
}
