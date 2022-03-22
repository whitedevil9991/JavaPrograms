public class StringClassDemo {
    /**String Class:
     * String represent Immutable string i.e everytime you create a string it is immutable(read-only)
     * everytime a new object of String is created
     * By using String class String can be created
     * by two ways either directly or using new keyword
     * 
     * STRING POOL AND STRING IN A HEAP :
     * Strings which are creared directly are stored in String POOL
     * String created by using new keyword are stored on HEAP and multiple strings
     * can be created with the same values.
     * 
     * StringBuffer and StringBuilder : used to create mutable strings
     * both classes are having same methods
     * Only the difference is StringBuffer and Threadsafe
     * and StringBuilder is not thread safe.
     * 
     * charAt(3) = shows the character at index 3
     * s1.concat(s2) = combines s1 and s2
     * s2.contains("keyword") = contains checks for the "keyword in s2" and returns a boolean value
     * s2.substring(2,5) = prints the stringValues from index 2 to 5 in s2
     * s2.replace('w','c') = replaces the 'w' with 'c' in s2
     * 
     */

     public static void main(String[] args) {
         //TODO Auto-generated method stub
         String s1="hello"; //string in pool
         s1="hellow"; // there are two s1's here so the first one gets discarded

         String s2=new String("world");
         s2=new String("worldHealthCare");//string on heap

         char ch=s1.charAt(3);
         System.out.println(ch);

         String t1=s1.concat(s2);
         System.out.println(t1);
         int l=s2.length();
         System.out.println(l);

         boolean b=s2.contains("or");

         String s=s2.substring(2,5);
         System.out.println(s);

         s=s2.replace('w','c');
         System.out.println(s);
         s=s.toLowerCase(); // not present in String buffer and building
         s=s.toUpperCase(); //same here

         //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin);
         String s3="this is String";
         char[] s4=new char[7];
         s3.getChars(3,9,s4,0);
         System.out.println(s4);
         //jdk 8 new Methods of String
         String j1=String.join(":","football","foot","ball");
         System.out.println(j1);

         String j2=j1.chars().distinct().mapToObj(c->String.value);
         System.out.println(j2);

         StringBuffer s11=new StringBuffer();

         s11.append("Students");
         System.out.println("appended"+s11);

         s11.delete(7, 10);
         System.out.println("deleted"+s11);

         s11.insert(7,"pen");
         System.out.println("inserted"+s11);

         s11.reverse();;
         System.out.println("reversed"+s11);

     }
}