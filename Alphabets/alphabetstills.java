class alphabetstills{
    public static void main(String[] args){
        int n = 7;
        for(int i =0; i<n;i++){
            for(int j=0; j<n;j++){  //A code
                if (i==n/2 || (i==0 && j!=0 &&j!=n-1) || (j==0 && i!= 0) ||(j==n-1 && i!=0)) {
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" "); //for spacce  b/w letters
    
            for(int j=0; j<n;j++){  // b code
                if (j==0 || (i == 0 || i==n/2 || i==n-1)&&j!=n-1 ||(j==n-1 && i!=0 && i!=n/2 && i!=n-1)) {
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
        

    //c code
            System.out.print(" ");
            for(int j=0; j<n;j++){
                if ((i==0 && j!=0) ||(i==n-1 && j!=0) || (j==0&&i!=0 && i!=n-1) ) {
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
        //dcode
            System.out.print("  ");
            for(int j=0; j<n;j++){
                if(j==0 || ((i==0 ||i==n-1)&&j!=n-1) || (j==n-1 && i!=0 &&i!=n-1) ){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            //ecode
            System.out.print("  ");
            for(int j=0; j<n;j++){
                if(j==0 || i==0 || i==n-1 || i==n/2 ){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n;j++){ //f code
                if(j==0 || i==0 || i==n/2){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n;j++){ //g ceode
                if(j==0 || i==0 || (j==n-1 && i!=2) || (i==n-1 &&j<=n/2) || (j==n/2 && i>=n/2) || (i==n/2 && j>=n/2)){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n;j++){  //hcode
                if(j==0 || j==n-1 || i==n/2){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");  //i code
            for(int j=0; j<n;j++){
                if(i==0 || i==n-1 || j==n/2){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n;j++){ //j code
                if(i==0 || j==n/2 || i-j==n/2){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n;j++){  //k code 
                if(j==0 || i+j==n/2 || i-j==n/2){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n;j++){  // l  code
                if(j==0 || i==n-1){  
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");//m code
            for(int j=0; j<n;j++){
                if(j==0 || j==n-1 || (i==j && j<=n/2) || (i+j==n-1 && j>=n/2)){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");   //n code
            for(int j=0; j<n;j++){
                if(j==0 || j==n-1 || i==j){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            for(int j=0; j<n;j++){   // o code
                if((j==0 || j== n-1)&&(i!=0 && i!=n-1)  || (i==0 || i==n-1) && (j!=0&&j!=n-1)){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");// p code
            for(int j=0; j<n;j++){
                if(j==0 || (i==0 ||i==n/2)&&(j!=n-1)||(j==n-1&&i!=0 && i!=n/2 && i<=n/2)){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("  ");  // q code
            for(int j=0; j<n;j++){
                if((i==j && j>=n/2) || (i==0 || i==n/2+1)&&(j!=0 && j<=n/2 && j!=n/2+1) || (j==0 || j==n/2+1)&&(i!=0 && i!=n/2+1 && i<=n/2) ) {
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");   // r code
            for(int j=0; j<n;j++){
                if(j==0 || (i==0 || i==n/2)&&(j!=n/2 && j<=n/2) || (j==n/2 && i<=n/2 && i!=0 &&  i!=n/2) || i-j ==n/2) {
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print(" ");   // s code
            for(int j=0; j<n;j++){
                if((i==0&&j!= 0)||(i==n/2&&j!=n-1&&j!=0)||(i==n-1&&j!=n-1)||(j==0&&i<=n/2&&i!=0&&i!=n/2)||(j==n-1&&i>=n/2&&i!=n/2&&i!=n/1)){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println(" ");
        }
    }
}