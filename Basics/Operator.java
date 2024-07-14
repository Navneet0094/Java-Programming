class Operator {
    public static void main(String[] args) {
        int a = 5 , b = 3 , c = -1,d = 0,e = -5 ,res;
        res = (--c) - (a--) + (++e) + (--b) - (d--) + (++d) - (a++) + (++b) + (c++) - (b--) + (--a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(res);


    }
    
}
