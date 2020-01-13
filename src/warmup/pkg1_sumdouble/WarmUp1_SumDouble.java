package warmup.pkg1_sumdouble;

public class WarmUp1_SumDouble {

    public static void main(String[] args) {
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
        
    }

    public static int sumDouble(int a, int b) {
        int x = 0;
        if (a == b) {
            x = (a + b) * 2;
            return x;
        }
        return a + b;
    }

}
