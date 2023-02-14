import java.util.Scanner;

public class Week_Day {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter nth day of the week : ");
        int _week_day = scan.nextInt();

        if (_week_day > 7) {
            System.out.println("<--Does not exist-->");
        } else {

            switch (_week_day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Sunday");
                    break;
            }
        }
    }
}
