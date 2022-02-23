//static variable
//static method
//static block
//default constructor and constructor with parameters

//this is a class named Student
public class Student {

    private int sid; 
    //these are instance variables = these are allocated to all objects in the class
    private String sname;
    //instance variable = global variable
    private float marks;
    static String exam_center; //this is static variable
    //this executed before the main method
    //this is accessible by all objects

    {
        //for static variable initialisation
        exam_center="pune university";
    }
    public Student() { 
        //default constructor
        // have the same name as the class
        sid=1;
        sname="unknown";
        marks=1;
    }
    public Student(int i,String n,float m)
        //local variables or parameters { 
        //constructor with parameters
        sid=i;
        sname=n;
        marks=m;
        /*if global and local variables have same name then 
        this.sid=sid;
        this.sname=sname;
        this.marks=marks; */
    }
    //setter and getter method
    public void setSid(int i) {
        sid=i;
    }
    public void setSname(String n) {
        sname=n;
    }
    public void setMarks(float m) {
        marks=m;
    }
    public void getSid(int i) {
        sid=i;
    }
    public void getSname(String n) {
        sname=n;
    }
    public void getMarks(float m) {
        marks=m;
    }
    public static void showExamCenter() 
    //this is a static method as it has the static keyword
    //static method can only call static data 
    {
        //the below line will show error if included as it's not static
        //System.out.println("id :"+sid+"\t name :"+sname+"\t marks"+marks);
        System.out.println("exam center :"+exam_center);
    }
    public void display() 
    //this is a non-static method and it can call static variables
    {
        System.out.println("id :"+sid+"\t name :"+sname+"\t marks"+marks);
        System.out.println("exam center :"+exam_center);
    }
    public static void main(String[] args) {

        Student s1=new Student();
        s1.display(); 
        //here s1 is calling display method i.e s1.display()
        // whatever is stored in s1 goes through display() method

        Student s2=new Student();
        s2.display();

        String s=s2.getSname();
        System.out.printlb("name of s2:"+s);

        s2.setMarks(88.2f);
        s2.display();
        
        Student s3=new Student(40,"shivam",30.4f);

        Student.showExamCenter(); //calling static method using class name
        
    }
    
}
