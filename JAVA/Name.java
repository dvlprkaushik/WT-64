import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner my_scan = new Scanner(System.in);
        System.out.print("Enter your First Name : ");
        String $First_Name = my_scan.next();
        System.out.print("Enter your Last Name : ");
        String $Last_Name = my_scan.next();

        //Showing the final output

        System.out.println("The First Name is : "+$First_Name);
        System.out.println("The Last Name is : "+$Last_Name);

        System.out.println("FULL_NAME : "+$First_Name+" "+$Last_Name);
    }
}
