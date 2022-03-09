import java.util.Scanner;  // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    // Swap two variables without using a third variable
    System.out.println("Enter two numbers: ");
    int a = myObj.nextInt();
    int b = myObj.nextInt();
    System.out.println("Before swapping: " + a + " " + b);
    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After swapping: " + a + " " + b);
  }
}