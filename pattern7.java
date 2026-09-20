public class pattern7 {
     static void main(){
         int n = 4;
         for(int row=1; row<=n; row++){
            // for each roew ==6 column
         for(int col=1; col<= 6 ; col++){
             if (row==1 || row==n){
                System.out.print("*");
             }
             else{
                if(col==1 || col==6){
                    System.out.print("*");

                }
                else{
                    System.out.println(" ");

                }
             }
         }
         System.out.println();
         }
        }
     
}
