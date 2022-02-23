public class Student {
    private int sid;
    private String sname;
    private float marks;

    public Student() { //default constructor

        sid=1;
        sname="unknown";
        marks=1;
    }
    public Student(int i,String n, float m) { 
        //constructor with parameters
        sid=i;
        sname=n;
        marks=m;
    }
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
    public void display() {
        System.out.println("id :"+sid+"\t name :"+sname+"\t marks"+marks);
    }
    public static void main(String[] args) {

        Student s1=new Student();
        s1.display();

        Student s2=new Student();
        s2.display();

        String s=s2.getSname();
        System.out.printlb("name of s2:"+s);

        s2.setMarks(88.2f)
    }
    
}
