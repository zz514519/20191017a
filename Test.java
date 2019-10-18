//定义数组，输入元素。
import java.util.Arrays;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的元素个数：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("请输入元素：");
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        project(arr);
        sc.close();
    }
    public static void project(int[] arr) {
           int[] ret =  new int[arr.length];
           for(int i=0;i<arr.length;++i){
               ret[i]=arr[i]*2;
           }
           System.out.println(Arrays.toString(ret));
    }
}
