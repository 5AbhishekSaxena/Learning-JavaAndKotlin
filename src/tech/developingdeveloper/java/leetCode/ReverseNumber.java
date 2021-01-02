package tech.developingdeveloper.java.leetCode;

/**
 * @author Abhishek Saxena
 * @since 31/07/19 10:28 PM
 */

class ReverseNumber {
    private int reverse(int x) {
        /*StringBuilder sb = new StringBuilder();
        boolean neg = x < 0;
        System.out.println("x: " + x + " neg: " + neg);

        if (neg)
            x = -2 * x + x;
        while (x > 0) {
            sb.append(x % 10);
            x /= 10;
        }
        if (neg)
            return -Long.parseLong(sb.toString());
        else
            return sb.toString().equals("") ? 0 : Long.parseLong(sb.toString());*/

        int res =0;
        while(x!=0){
            res = res*10 + x%10;
            x/=10;
        }

        if (res > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
            return 0;
        else
            return res;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseNumber().reverse(123456));
    }
}
