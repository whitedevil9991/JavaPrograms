public class MyClass {

    /** */
    private int num;
    private String Student;

    public MyClass(){
        super();
        num=1;
        Student="krish";
    }
    public MyClass(int num, String Student) {
        super();
        this.num=num;
        this.Student=Student;
    }
    public int setNum(){
        return num;
    }
    public void setNum(int num) {
        this.num=num;
    }
    public String getStr(){
        return str;
    }
    public void setStr(String str){
        this.str=str;
    }
    @Overrride
    public String toString(){
        return "MyClass [num="+num+",str="+str+"]";
    }
    
}
