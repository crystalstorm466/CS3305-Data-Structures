package Quiz;

public class Test {
        static int count = 0;
        public static void main(String[] args) {
            f(7);
            System.out.println(count);
        }

        public static int f(int n) {
            count++;
            if (n == 0 )
                return 1;
            else
                return (f(n-1) + n * n);
        }

}
