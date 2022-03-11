import java.io.BufferedReader;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Input1 {
    //java program for taking user input
    //input using BuuferedReader class
    public static void main(String[] args) {
        //creating bufferReader object, InputStreamReader converts bytes to, stream of character
        BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter String:");
        System.out.println("Enter Integer:");

        String a=b1.readLine(); // assigning b1 to a
        int i=Integer.parseInt(b1.readLine()); //converting string b1 to int and storing in 'i'
        System.out.println("Entered String:"+a); //
        System.out.println("Entered Integer:"+i); //


        //method2 for taking input
        Scanner a1=new Scanner(System.in);
        String s1=scn.nextLine();
        System.out.println("entered String:"+a1);
        int x=scn.nextInt();
        System.out.println("Entered Integer:"+x);
        float f=scn.nextFloat();
        System.out.println("entered FloatValue:"+f);
    }
    
}
