import java.util.Scanner;


public class inputtt {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter any number You to sum:" );
        int n =sc.nextInt();

        while(n>0){
            sum=sum+n;
            n--;
            System.out.println("Sum :" +sum);

        }
    }
}
