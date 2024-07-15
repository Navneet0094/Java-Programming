class Formats {
    public static void main(String[] args) {
        int a = 45;      // Decimal
        int b = 045;     // Octal (base 8)
        int c = 0x45;    // Hexadecimal (base 16)
        int d = 0b100101;
        
        // Print the values
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ",d = "+ d );
    }
}
