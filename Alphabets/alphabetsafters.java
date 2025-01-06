class alphabetsafters {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {  //T code
            
                if (i == 0 || j == n / 2) {
                    System.out.print("*");                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print(" "); 
            for (int j = 0; j < n; j++) {  //U code
                if ((j==0 ||j==n-1)&&(i!=n-1) || (i==n-1&&j!=0 &&j!=n-1)) {
                    System.out.print("*");                    
                } else {
                    System.out.print(" ");
                }
            }
            
            // System.out.print(" ");     //not use this or we can run two loops in which onw is x==y and other is x+y==n-1
            // for (int j = 0; j < n; j++) {  // V code
            //     if ((i==j && i<=n/2) ||( i+j==n-1 && i<=n/2)) {
            //         System.out.print("*");                    
            //     } else {
            //         System.out.print(" ");
            //     }
            // }
            System.out.print("  "); 
            for (int j = 0; j < 2*n ;j++) { // v code
                if (j == i  || i+j == 2*n-2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        
            System.out.print("  "); 
            for (int j = 0; j <n;j++) { // w code
                if (j == 0 || j==n-1 || i+j ==n-1 && i>=n/2 || i==j && i>=n/2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); 
            for (int j = 0; j <n;j++) { // x code
                if (i==j || i+j == n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); 
            for (int j = 0; j <n;j++) { // y code
                if (i==j && i<=n/2|| i+j == n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  "); 
            for (int j = 0; j <n;j++) { // z code
                if (i == 0 || i==n-1 || i+j == n-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
