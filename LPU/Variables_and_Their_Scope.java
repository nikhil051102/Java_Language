/*
Local Variable : used only within the method
Instance Variable : used only within the class
Global Variable : used within the class and method
Static Variable : used within the class and methodi
*/


public class Variables_and_Their_Scope
{
    static int m = 100;                     //Static Variable 
    void method()
    {
        int n=90;                          //Local Variable
        int age = 0;
        age = age +20;
        System.out.println("Age is : " + age);
    }
    public static void main(String[] args)
    {
        int data=50;                       //Instance Variable : Inside the class but should be declared outside the body of the method.
        Variables_and_Their_Scope x = new Variables_and_Their_Scope();
        x.method();
    }
}
