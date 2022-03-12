public class Student2 {
    /*declaring variables in private
    default constructor
    constructor with parameters
    class name should start with small letter and second word with capital
    camel-case naming
    if it is a single word, everything in small letters */

    private int sid;
    private String sname;
    private float marks;
    public void Student() {
        sid=1;
        sname="Rohit";
        marks="32.32f";
    }
    public void Student (int i, String n, float m) {
        sid=i;
        sname=n;
        marks=m;
    }
    public void display() {
        System.out.println("\t student is:"+sid+"\t student name:"+sname+"\t marks:"+marks);
    }

    public void learn() {
        System.out.println("student is learning");
    }
    public void setSname(){
        
    }
    public static void main(String[] args){

        Student s1=new Student();
        s1.display(); 
        s1.learn(); 

        //Student s1=new Student();
        //System.out.println("student id:"+sid+"\t student name:"+sname+"\t marks:"+marks);
        //Scanner object,declare 3 variale id,n,m take them from user

        Student s2=new Student(2,"Arun",99.3f);
        s2.display();
        s2.learn(); 

        Student s3= new Student(1,"victor",32.2f); 
        s3.display();
        s3.learn(); 

        /* to change anything you should not re-edit the above things instead
        create a method for it */
    }
    
}
