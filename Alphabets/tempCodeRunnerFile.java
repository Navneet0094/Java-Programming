 System.out.print("  ");
            for(int j=0; j<n;j++){
                if(j==0 || j==n-1 || (i==j && j<=n/2) || (i+j==n-1 && j>=n/2)){
                    System.out.print("*");                    
                }
                else{
                    System.out.print(" ");
                }
            }