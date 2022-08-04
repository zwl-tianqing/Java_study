package day03;

/**
 * @author long
 * @create 2022-08-03 17:45
 * 方法测试
 */
public class MethodTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        method(a, b);
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

    /**
     * 测试值传递
     *  利用 System.exit(0) 退出，阻止后面程序执行
     * @param a
     * @param b
     */
    public static void method(int a, int b) {
        a = a * 10;
        b = b * 10;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.exit(0);
    }
}
