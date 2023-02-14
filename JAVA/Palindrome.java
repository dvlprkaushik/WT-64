import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.print("ENTER THE VALUE : ");
        Scanner scan = new Scanner(System.in);
        int str = scan.nextInt();
        int $num1,$num2=0; //initialization with 0

        int $str=str; //storing the value of str in other variable

        while (str > 0) {       //process of palindrome
            $num1=str%10;
            str=str/10;
            $num2= $num2*10+$num1;
        }

        if ($str==$num2) {
            System.out.println("IT IS PALINDROME");
        }

        else{
            System.out.println("IT IS NOT PALINDROME");
        }
      }
}
