import java.util.Scanner;
class Calculator
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a,b,c,d;
        System.out.print("Enter value of  A:" );
        a=sc.nextInt();
        System.out.print("Enter the value of B:" );
        b=sc.nextInt();
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice :");
        d=sc.nextInt();
        switch (d)
        {
            case 1:
                c=a+b;
                System.out.println("Addition : "+c);
                break;

            case 2:
                c=a-b;
                System.out.println("Subtraction : "+c);
                break;

            case 3:
                c=a*b;
                System.out.println("Multiplication : "+c);
                break;

                case 4:
            c=a/b;
            System.out.println("Division : "+c);
            break;
             default:
            System.out.println("Invalid Choice");
            break;


        }


    }
}