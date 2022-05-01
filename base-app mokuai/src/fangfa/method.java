package fangfa;

public class method {
    public static void main(String[] args) {
//        int q =23;
//        int w = 32;
//        int e = sum(q, w);
//        System.out.println(e);
//        print_hello();
//
//        int r = sum(12,21);
//        System.out.println(r);
//    }
//    public static int sum(int a,int b) {
//        int c = a + b;
//        return c;
//    }
////    无参数无返回值的方法
//    public static void print_hello() {
//        for (int i = 0; i <= 3; i ++) {
//            System.out.println("hello,zx!");
//        }
//    }

        int[] ages = {10, 20, 33, 80};
//        printArray(ages);
//        System.out.println("\n--------------------");
//        int[] num = {};
//        printArray(num);
//        int[] num1 = null;
//        printArray(num1);

//        int index = searchIndex(ages, 80);
//        System.out.println(index);

        int[] ages1 = {2,3,4};
        int[] ages2 = {1,2,3};
        int[] ages3 = {2,3,4};
        System.out.println(compareArr(ages1, ages2));
        System.out.println(compareArr(ages3, ages1));
    }

//    public static void printArray(int[] arr) {
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
////            if (i == arr.length - 1) {
////            System.out.print(arr[i]);
////        }else {
////                System.out.print(arr[i] + ",");
////            }
//            System.out.print((arr != null && arr.length > 0) ? (i == arr.length - 1 ? arr[i] : arr[i] + ",") : "");
//            }
//        System.out.print("]");
//    }
//    public static int searchIndex(int[] arr, int data) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == data){
//                return i;
//            }
//        }
//        return -1;
//    }

//    比较数组
    public static boolean compareArr(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
