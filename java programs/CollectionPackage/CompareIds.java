import java.util.Comparator;

public class CompareIds implements Comparator<Company>
{
    
    public int compare(Company o1, Company o2){
        //this is type casting
        /* this is type casting = you dont need it when using <company>
        Company c1=(Company)o1;
        Company c2=(Company)o1;
        */

        int i1=o1.getId();
        int i2=o2.getId();

        if(i1>i2)
        return 1;
        else if(i1<i2)
        return -1;
        return 0; //default
    }
}
