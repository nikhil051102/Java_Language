import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter first no");
    int a = myObj.nextInt();  // Read user input
    System.out.println("Enter second no");
    int b = myObj.nextInt();  // Read user input
    int sum = a + b;
    System.out.println("Sum of " + a + " and " + b + " is " + sum);
    int difference = a - b;
    System.out.println("Difference of " + a + " and " + b + " is " + difference);
    int product = a * b;
    System.out.println("Product of " + a + " and " + b + " is " + product);
    int quotient = a / b;
    System.out.println("Quotient of " + a + " and " + b + " is " + quotient);
  }
}