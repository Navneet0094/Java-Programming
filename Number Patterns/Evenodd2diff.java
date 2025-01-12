public class Evenodd2diff {
    public static void main(String[] args) {
        for(int i =1 ; i<=5 ; i++){
            for(int j =(i%2!=0) ? 1:2 ; j<=2*i ; j+=2){
                System.out.print(j+" ");
            }
            System.out.println("");
            
        }
        // for(int i =1 ; i<=5 ; i++){
        //     for(int j =1 ; j<=i ; j++){
        //         if(i%2==0){
        //             System.out.print(2*j+" ");
        //         }                
        //         else{
        //             System.out.print(2*j-1+" ");
        //         }
        //     }
        //     System.out.println("");
            
        // }
    }
    
}
