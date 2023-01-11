import java.util.*;
import javax.swing.*;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fullname Name : ");
        String fullname = sc.nextLine();
        int space = fullname.indexOf(" ");
            String firstname = fullname.substring(0, space);
            String lastname = firstname.substring(space+1);
        if(!fullname.contains(" ")){
            
            System.out.println("Incorrect Name");
        }
        else{
            
            System.out.println("First Name : "+firstname.toUpperCase());
            System.out.println("Last Name : "+lastname);

        }

        

        
    }
    
    
    
}
