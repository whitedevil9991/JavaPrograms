import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ListDemo {
    /*Collection Framework = group of objects (to avoid the drawback of arrays)
    alll data strucutres classes are the part of collection framework
    Draw back of array: array has fixed sizes
    collection--Dynamic collection of objects (works on entire collection)

    java.util ( all collection related packages are in here, so import this to use collection packages)
    --Collection--(--IMP-part--)(related to core java)
    1. List-can store duplicate values, ordered collection
    (It is has index so it is known as ordered collection)(list of MobileNumbers,Students etc)
    built-in-classes---Vector(thread-safe), ArrayList(not thread-safe), LinkedList(scattered-format), Stack((LIFO)last-in first-out)

    2. Set-can store unique values, unordered collection 
    (storing only unique values) (set doesn't have index so unordered collection)(the output comes in unordered way)
    classes---HashSet(sub-interfaces) (for ascending or descending)
    SortedSet-in ascending order
    NevigableSet--for seraching
    classes---Treeset(for automatic sorting)

    3. Queue-setting priority 
    (this is also a list-type but priority based)
    Deque-double ended queue (sub-interfaces)
    classes---PriorityQueue


    Map-key value pair (to-store two values like EmployeeName-EmployeeID)
    classes--- HashMap 
    SortedMap-sorted map
    NevigableMap-searching
    classes--- TreeMap

    Comparator and comparable---used for comparison of objects

    Iterator-traversing
    */
    public static void main(String[] args) 
    {
        ArrayList arr=new ArrayList(); //creating a object
        arr.add(10); //add() is a inbuilt function
        arr.add(20);// here 20 is a object not an int value because it is collection
        arr.add(40);
        arr.add("adewd");
        arr.add(324.4f); //you can store anything inside because it takes it as a object
        //the data given under array list is considered as an object


       // ArrayList<Integer> arr=new ArrayList<>(); --- to store only integers, these are known as generic classes
       // ArrayList<float> arr=new ArrayList<>();
       //primitive data types cant be used like 'int'

       System.out.println(arr);
       int n=arr.get(2);
       System.out.println("n="+n);

       System.out.println(arr.size()); //gives the size

       ArrayList<Float> arr1=new ArrayList<>();
       arr1.add(89.3f);

      /* for(int=0;i<arr.size();i++) //arr.size() -- gives the size or length
       {
           System.out.println(arr.get(i));
       } --but you cant use traditional 'for' method use 'for each' instead*/

       for(int x : arr) {
           System.out.println(x);
           
       }
       Iterator it=arr.iterator(); // when you use a iterator a pointer is created to the next element
       while(it.hasNext())
       { // this tells you if there is a next element or not --returns true or false
                 System.out.println(it.next());

                 /*int n=(int) it.next();
                 System.out.println((n1+5)); -- if you want to add an integer to the return value*/
       }

       //vector set
       Vector<Float> v=new Vector<>();
       v.add(23.3f);
       v.add(23.3f);
       v.add(23.3f);
       v.add(23.3f);
       v.add(23.3f);
       while(it.hasNext())
       { 
        float n1=(float) it.next();         
        System.out.println(it.next(n1));   
       }

       //vector set
       HashSet<Float> h=new HashSet<>();
       h.add(23.3f);
       h.add(23.3f);
       h.add(23.3f);
       h.add(23.3f);
       h.add(23.3f);
       System.out.println(h);
       float n1=(float) it.next();         
       System.out.println(it.next(n1));   
       



       //ArrayList<Employee>arr1=new ArrayList<>();
       //arr1.add(new Employee(78,"abc")); -- here you can also create user-defined arraylists


    }
    
}
