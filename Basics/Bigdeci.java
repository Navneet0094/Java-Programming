import java.math.BigDecimal;
class Bigdeci{
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.06");
        BigDecimal b = new BigDecimal("0.04");
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
    }
}

// class Bigdeci{
//     public static void main(String[] args) {
//         double a = 0.06;
//         double b = 0.04;
//         System.out.println(a+b);
//         System.out.println(a-b);
//         System.out.println(a*b);
//         System.out.println(a/b);
       
// }
// }