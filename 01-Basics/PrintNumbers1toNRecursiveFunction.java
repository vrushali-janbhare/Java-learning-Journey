public class PrintNumbers1toNRecursiveFunction {

    public static void main(String[] args) {

        int n = 20;
        PrintNumber(1, n);
    }

    static void PrintNumber(int i, int n) {

        if(i > n) {
            return;
        }

        System.out.println(i);

        PrintNumber(i + 1, n);
    }
}