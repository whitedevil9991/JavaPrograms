public class IfStatement{
    /*setting this to public so that everyone can access it */
   /*class name is set to IfStatement */
   public static void main(String[]args){
       int age=12;
       if(age>=18) {
           system.out.println("eligible for voting");
       }
       else if(age>=75) {
           system.out.println("ok boomer");
       }
       else if(age==0) {
           system.out.println("invalid");
       }
       else {
           system.out.println("you are not eligible for voting");    
       }
   }
}