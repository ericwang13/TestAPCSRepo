public class Demo {
    public static void main(String[] args) {
        if (args.length == 0) {
            printLoop(5);
        } else {
            printLoop(Integer.parseInt(args[0]));
        }
    }

    public static void printLoop(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(n - i + 1);
            }
            System.out.print("\n");
        }
    }
}