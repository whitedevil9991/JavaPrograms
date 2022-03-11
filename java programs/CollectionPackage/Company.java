import java.util.ArrayList; //to use arraylist
import java.util.Comparator; // to use comparator

public class Company implements Comparable<Company> //impements Comparable =to use comparable
{


    public String getName(){
        return name;
    }
    public String setName(){
        this.name=name;
    }
    public void getId(){
        return getId;
    }
    public void setId(){
        this.getId=getId;
    }
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        //arraylist is best for sorting =saves time
        ArrayList<Company> arr=new ArrayList< >(); //creating new object
        arr.add(new Company(100,"a"));
        arr.add(new Company(101,"d"));
        arr.add(new Company(102,"c"));
        arr.add(new Company(103,"b"));
        //comparable
        System.out.println("before sorting:"+arr);
        Collections.sort(arr); //this does the sorting
        System.out.println("after sorting:"+arr);

        //comparator
        Comparator.sort(arr,new CompareIds());
        System.out.println("sorting based on names:"+arr);
    }


    //Collections.sort(arr,new CompareIds());
    //System.out.println("after sorting");
    //comparable is used for sorting
    @Override 
    public int compareTo(Company o){ //
        //System.out.println("this="+this);
        //System.out.println("o="+o);
        if(this.id>o.id) //
        return 1;
        else if(this.id<o.id)
        return -1;

        return 0;
    }
     
}
