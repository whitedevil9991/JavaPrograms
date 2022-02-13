import javax.swing.JOptionPane;
/* GUI means graphical user interface */
public class GUI {
/*public = access modifier */
/*static = keyword */
/* void = return type */
/* main = method name */
/* String args[] = array of string type */
    public static void main(String[]args) {

        String name = JOptionPane.showInputDialog("enter your name");
        //this takes the input in a popup box
        JOptionPane.showMessageDialog(null, "hello "+name);
        //this shows the output in the popupbox i.e a dialogue box

        int age=Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        //here the converted string is assigned to 'age'
        //integer.parseint takes string and converts it to int 

        JOptionPane.showMessageDialog(null, "you are"+age+" years old");
        //JOptionPane = shows the output in a popup box i.e dialogue box

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        // system.in for taking input from the user.

        JOptionPane.showMessageDialog(null,"you are"+height+" cm tall");
        }
    
}