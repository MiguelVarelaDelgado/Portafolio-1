import java.util.Scanner;
/**
 * Write a description of class CuadroMagico2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CuadroMagico2
{
    // instance variables - replace the example below with your own
    public static void main(){
            int fn, cn;
            int fa = 0;
            int N;
        System.out.print('\u000c');
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa un # par, no multiplo de 4?");
                    N= teclado.nextInt ();
            while(N%2==1||N%4==0){
              
                    System.out.println("Ingresa un # Par?");
                    N= teclado.nextInt ();
            }    
       
        
    DatoEsp [][]arr=new DatoEsp[N/2][N/2];
    for (int f=0;f<arr.length;f++)
        { 
            for(int c=0;c<arr.length;c++)
            {
                /** if(arr[f][c]<10){
                
                System.out.print("  "+ arr[f][c]);
                }
                else{
                System.out.print(" "+ arr[f][c]);
                */
                arr[f][c]=new DatoEsp();
                }
                
        }
        for (int i=0;i<arr.length;i++)
        {  for(int c=0;c<arr.length;c++)
            {
                    if (i<=arr.length/2){
                        arr[i][c].setPatron('L');
                    } else if(i==arr.length/2+1){
                        arr[i][c].setPatron('U');
                    }
                    else{
                    arr[i][c].setPatron('X');
                    }
                    
            }   
        }
        
        arr[arr.length/2][arr.length/2].setPatron('U');
        arr[arr.length/2+1][arr.length/2].setPatron('L');
         
        
        int [][]mat=new int [N][N];
        int ca = N/4;
        int num=1;
       
                 // arr[fa][ca].setEnUso(true);
                  if(arr[fa][ca].getPatron()=='L')
                  {
                      mat[fa*2][ca*2+1]=num++;
                      mat[fa*2+1][ca*2]=num++;
                      mat[fa*2+1][ca*2+1]=num++;
                      mat[fa*2][ca*2]=num++;
                      
                      System.out.print("");
                  } 
                  arr[fa][ca].setEnUso(true);
                  System.out.print("");
                  int A=(N*N)/4;
                  for(int i=2;i<=A;i++)
                  
                  
                  {
                      fn=(fa - 1<0)?arr.length-1:fa-1;
                      cn=(ca+1>=arr.length)?0:ca+1;
                      //arr[fa][ca].setEnUso(true);
                 if(arr[fn][cn].getEnUso()==false){
                 // arr[fa][ca].setEnUso(true);
                   if(arr[fn][cn].getPatron()=='L')
                   {
                      mat[fn*2][cn*2+1]=num++;
                      mat[fn*2+1][cn*2]=num++;
                      mat[fn*2+1][cn*2+1]=num++;
                      mat[fn*2][cn*2]=num++;
                      
                      //System.out.print("");
                  } 
                     else if (arr[fn][cn].getPatron()=='U'){
                        mat[fn*2][cn*2]=num++;
                        mat[fn*2+1][cn*2]=num++;
                        mat[fn*2+1][cn*2+1]=num++;
                        mat[fn*2][cn*2+1]=num++;
                        
                    }
                    else 
                    {   mat[fn*2][cn*2]=num++;
                        mat[fn*2+1][cn*2+1]=num++;
                        mat[fn*2+1][cn*2]=num++;
                        mat[fn*2][cn*2+1]=num++;
                        
                       // System.out.print("");
                    }
                    fa=fn;
                    ca=cn;
                    //arr[fa][ca].setEnUso(true);
               }   
              
                    else {    
                            fa++;
                            //fn=(fa - 1<0)?arr.length-1:fa-1;
                            //cn=(ca+1>=arr.length)?0:ca+1;
                        if(arr[fa][ca].getPatron()=='L')
                        {
                            mat[fa*2][ca*2+1]=num++;
                            mat[fa*2+1][ca*2]=num++;
                            mat[fa*2+1][ca*2+1]=num++;
                            mat[fa*2][ca*2]=num++;
                            
                           System.out.print("");
                    } 
                        else if (arr[fa][ca].getPatron()=='U'){
                        mat[fa*2][ca*2]=num++;
                        mat[fa*2+1][ca*2]=num++;
                        mat[fa*2+1][ca*2+1]=num++;
                        mat[fa*2][ca*2+1]=num++;
                        
                        //System.out.print(""); 
                    }
                        else 
                    
                    {  
                        mat[fa*2][ca*2]=num++;
                        mat[fa*2+1][ca*2+1]=num++;
                        mat[fa*2+1][ca*2]=num++;
                        mat[fa*2][ca*2+1]=num++;
                        
                         System.out.print("");
                    }
                        // fa=fn;
                        // ca=cn;  
                 }
               arr[fa][ca].setEnUso(true);
            
          }
          
          
             for(int q=0; q < mat.length;q++){
                 for(int z=0;z <mat.length;z++){
                     if(mat[q][z]>=10){
                     System.out.print("  " + mat[q][z]);
                    }
                    else {
                        System.out.print("   " + mat[q][z]);
                    }
                    }
                    System.out.println();
                }
                System.out.print("");
    }
}


    
    




    
    

