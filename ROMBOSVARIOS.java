
import java.util.Scanner;
/**
 * Write a description of class ROMBOSVARIOS here.
 * 
 * @author (Miguel Varela ) 
 * @version (a version number or a date)
 */
public class ROMBOSVARIOS
{
    public static void main(String arg[])
        {
      

           System.out.print('\u000c');

           Scanner teclado = new Scanner (System.in);
           int N,A;
           int h=1;
           
           System.out.println("Ingresa un #?");
           N= teclado.nextInt ();
            A= N/2;
          
               while(N%2==0){
              
                    System.out.println("Ingresa un # impar?");
                    N= teclado.nextInt ();
            }    
            
             for( int i=A ;i>0;i--){
               
              
               for(int e=1;e<=i;e++){
                 System.out.print(" ");
                }
                
               for(int e=1;e<=h;e++){
                 System.out.print("* ");             
                }
                h++;
                System.out.println();
            }          
            
            
            
            for( int i=0 ;i<=A;i++)
            {
               
              
               for(int e=1;e<=i;e++){
                 System.out.print(" ");
                }
                
               for(int e=h;e>0;e--){
                 System.out.print("* ");             
                }
                h--;
                System.out.println("");
            }
   }
}
