import java.util.Arrays;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入元素个数：");
        int n = sc.nextInt();
        System.out.print("请输入元素：");
        int[] arr = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        project(arr);
    }
    public static void project(int[] arr){
        int[] ret =new int[arr.length];
        for(int i=0;i<ret.length-1;++i){
            for(int j=i;j<ret.length-i-1;++j) {
                if(ret[j]>ret[j+1]){
                int tmp = ret[j];
                ret[j] = ret[j + 1];
                ret[j + 1] = tmp;
               }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
