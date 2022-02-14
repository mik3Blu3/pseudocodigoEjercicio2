import java.util.Scanner;
public class A2E2
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args [])
    {
        System.out.println("Ingrese cualquier digito N para saber cuantos numetos hay entre (N-1)");
        int num = entrada.nextInt();
        System.out.println("");

        for(int i = num ; i >= 1 ; i--)
        {
            System.out.println(i);
        }
    }
}