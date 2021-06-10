import java.util.Scanner;
public class ejercicio2
{
    static Scanner entrada = new Scanner(System.in);
    public static void main(String args [])
    {
        System.out.println("Ingrese cualquier digito N para saber cuantos numetos hay entre (5-n)");
        int num = entrada.nextInt();
        System.out.println("");

        for(int i = num ; i >= 1 ; i--)
        {
            System.out.println(i);
        }
    }
}