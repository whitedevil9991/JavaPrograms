public class Student2 {
    public Student() //default constructor
    {
        sid=1;
        sname="Rohit";
        marks="32.32f";
    }
    public Student (int i, String n, float m) //constructor with parameters
    {
        sid=i;
        sname=n;
        marks=m;
    }

    public display()
    {
        System.out.println("\t student is:"+sid+"\t student name:"+sname+"\t marks:"+marks);
    }

    public learn() 
    {
        System.out.println("student is learning");
    }
    public void setSname() 
    //class name should start with small letter and second word with capital
    //camel-case naming
    //if it is a single word, everything in small letters
    {
        s
    }

    public static void main(String[] args) //this is the main method
    {

        //int num=100; = local variable

        Student s1=new Student(); //creating a object named Student
        s1.display(); // this calls display method for s1
        s1.learn(); // this calls learn method for s1

        //Student s1=new Student();
        //System.out.println("student id:"+sid+"\t student name:"+sname+"\t marks:"+marks);
        //Scanner object,declare 3 variale id,n,m take them from user

        Student s2=new Student(2,"Arun",99.3f);
        //creating a student object and allocating values
        s2.display(); //calling display method for s2
        s2.learn(); //calling learn method for s2

        Student s3= new Student(1,"victor",32.2f); 
        //creating a new student object and allocating values
        s3.display(); //calling display method for s3
        s3.learn(); // calling learn method for s3



        /* to change anything you should not re-edit the above things instead
        create a method for it */
    }
    
}
