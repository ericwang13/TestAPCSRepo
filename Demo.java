public class Demo {
    public static void main(String[] args) {
        int[] a = { 13, 7, 17 };
        int[] b = { 1, 9, 8, 9 };
        int[] c = { 22, 15 };
        int[] d = { 1 };
        int[] e = {};

        int[][] arr = { a, b, c, d, e };

        System.out.println(arrayDeepToString(arr).replace("}, ", "},\n "));
        System.out.println();

        System.out.println(arrayDeepToString(create2DArrayRandomized(7, 8, 13)).replace("}, ", "},\n "));
        System.out.println();

        System.out.println(arrayDeepToString(create2DArrayRandomized(7, 8, 13)).replace("}, ", "},\n "));
        System.out.println();
    }

    public static String arrToString(int[] arr) {
        if (arr.length == 0) return "{}";
        String str = "{" + arr[0];
      
        for (int i = 1; i < arr.length; i ++) {
          str += ", " + arr[i] + "";
        }

        str += "}";
        return str;
    }
     
    public static String arrayDeepToString(int[][] arr) {
        if (arr.length == 0) return "{}";
        String str = "{" + arrToString(arr[0]);
      
        for (int i = 0; i < arr.length; i ++) {
            str += ", " + arrToString(arr[i]);
        }

        str += "}";
        return str;
    }

    public static int[][] create2DArray(int rows, int cols, int maxValue) {
        int[][] arr = new int[rows][cols];
        for (int[] i : arr) {
            for (int j = 0; j < i.length; j ++) {
                i[j] = (int) (Math.random() * (maxValue + 1)); 
            }
        }

        return arr;
    }

    public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
        int[][] arr = new int[rows][];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = new int[(int) (Math.random() * (cols + 1))];
            for (int j = 0; j < arr[i].length; j ++) {
                arr[i][j] = (int) (Math.random() * (maxValue + 1)); 
            }
        }

        return arr;
    }

    // public static void printLoop(int n) {
    //     for (int i = n; i > 0; i--) {
    //         for (int j = 0; j < i; j++) {
    //             System.out.print(n - i + 1);
    //         }
    //         System.out.print("\n");
    //     }
    // }
}