import java.util.Scanner;

class ArmStrong
{
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any No");
        int n = scanner.nextInt();
        int sum = 0;
        int t = n;
        while(t != 0)
        {
            int d = t%10;
            sum += d*d*d;
            t/=10;
        }
        if(n==sum)
            System.out.println( n + " is an Armstrong No");
        else 
            System.out.println( n + " is  Not an Armstrong No");
        scanner.close();
    }
}