public class wrapperclass {
    public static void main(String[] args) {
        //TODO Auto-generated method sub
        int num=100;
        //Integer in=new Integer(num);

        Integer in=num; //autoboxing
        //here 'in' is a class and 'num' is stored in 'in'

        System.out.println(in);

        //int n=in.intValue();
        int n=in; //auto unboxing
        System.out.println(n);

        String s="10";
        String s1="23.3";
        float f=Float.parseFloat(s1);
        //here s1 is converted from it's previous data type to Float and stored in f
        int n1=Int.parseInt(s);

        Integer i1=Integer.valueOf(s);
    }
    
}
