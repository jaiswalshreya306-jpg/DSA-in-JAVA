public class pattern9 {
     static void main(){
           int n = 5;
           for(int row=1; row<=n; row++){
               //  part 1
               for(int col=1; col<=n-row; col++){
                    System.out.print(" ");

               }

               // part 2
               if(row==1 || row==n){
                    for(int col=1; col<=2*row-1; col++){
                     System.out.print("*");
                    }
               }
                else{
                    // middle row 
                    //star
                    System.out.print("*");
                    // space
                    for(int col=1;col<=2*row-3;col++){
                         System.out.print(" ");

                    }
                    // star
                    System.out.println("*");
                }
          System.out.println();
               }
          }
     }

           