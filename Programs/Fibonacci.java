import java.util.Scanner;
class Fiboncci
{
    public static void main(String[] args) {
        
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Any No");
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + "\t" + b+"\t");
        for(int i = 2; i<n ; i++)
        {
            int c = a + b;
            System.out.print(c+"\t");
            a=b;
            b=c;
        }
        scanner.close();
    }

}