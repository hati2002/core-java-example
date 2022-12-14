
public class Practice {
    public static void main(String[] args) {
        int n =2;
        int i;
        while (n <= 100) {
            for (i = 2; i <= 100; i++) {
                if (n % i == 0) {
                    break;
                }
            }
                if (n == i) {
                    n++;
                    continue;
                } else {
                    System.out.println(n);
                }
                n++;
        }
    }
}

