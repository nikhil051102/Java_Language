public class LocalVariable
{
    void age()
    {
        int x = 0;                //Local Variable
        x += 21;
        System.out.println("Value of Local Variable : " + x);
    }
    public static void main(String[] args)
    {                         
        LocalVariable l = new LocalVariable();
        l.age();
    }
}