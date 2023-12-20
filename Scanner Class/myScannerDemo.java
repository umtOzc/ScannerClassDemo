import java.util.Scanner;

public class myScannerDemo
{
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int num1, num2, num3, numSum;
        
        System.out.print("Please enter first number: ");
        num1 = obj.nextInt();
        
        System.out.print("Please enter second number: ");
        num2 = obj.nextInt();
        
        System.out.print("Please enter third number: ");
        num3 = obj.nextInt();
        
        numSum = num1 + num2 + num3;
        System.out.print("Sum of the numbers: " +numSum);
    }
}
