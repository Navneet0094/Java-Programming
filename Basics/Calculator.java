import java.util.*;
class Calculator {
    void addition(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        if(num1>0){
            System.out.println(num1+num2);
        }
        else{
            System.err.println("Invalid");
        }
    }
    public static void main(String[] args) {
        Calculator sc = new Calculator();
        sc.addition();
    }    
}
