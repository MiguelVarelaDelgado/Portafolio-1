import java.util.Scanner;
/**
 * Write a description of class Canoas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hanoi
{
    // instance variables - replace the example below with your own
    public static void main()

    {   System.out.print('\u000c');
        int N=0;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Porfa pon el # de disco");
        N=teclado.nextInt();
        movimientos (N,1,2,3);
    }

    public static void movimientos (int discos,int orig, int aux,int des) {
        if(discos==1) {
            System.out.println("Mover del "+orig+" al "+ des);
        } 
        else{
             movimientos (discos-1,orig,des,aux);
             System.out.println("Mover del "+orig+" al "+des);
             movimientos (discos-1,aux, orig,des);
        }

    }

}
