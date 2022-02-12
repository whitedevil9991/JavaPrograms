import javax.swing.JOptionPane;
/* GUI means graphical user interface */
public class GUI {
    public static void main(String[]args) {
        String name = JOptionPane.showInputDialog("enter your name");
        JOptionPane.showMessageDialog(null, "hello "+name);

        int age=Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        //here the converted string is assigned to 'age'
        //integer.parseint takes string and converts it to int 
        JOptionPane.showMessageDialog(null, "you are"+age+" years old");
        //i think it prints the output

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        // system.in for taking input from the user.
        //
        JOptionPane.showMessageDialog(null,"you are"+height+" cm tall");
        }
    
}