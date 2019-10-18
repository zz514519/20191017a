import java.util.Scanner;

/*import java.util.Scanner;
//11. 写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个 1
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int n = sc.nextInt();
        System.out.println(project(n));
    }
    public static int project(int n){
        int count = 0;
        while(n>0){
            if(n%2==1){
                ++count;
            }
            n/=2;
        }
        return count;
    }
}
*/
public class Test1{
    public static int project(int n){
        int count = 0;
        while(n>0){
            if((n&1)==1){
                ++count;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int n = sc.nextInt();
        System.out.println(project(n));
    }
}