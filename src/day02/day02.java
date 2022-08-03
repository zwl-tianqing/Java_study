package day02;

import java.util.Scanner;

/**
 * @author long
 * @create 2022-08-02 12:12
 * 家庭收支明细处理
 */
public class day02 {
    public static void main(String[] args) {
        // 声明 money（金钱）变量
        double money = 0.00;
        // 声明 income (收入) 变量
        double income = 0.00;
        // 声明 expenditure (开支) 变量
        double expenditure = 0.00;
        // 创建键盘输入实例
        Scanner scanner = new Scanner(System.in);
        // 循环条件
        boolean sign = true;
        while (sign) {
            // 调用提示信息方法，并获取输入值
            int input = message(scanner);
            // 输入判断
            switch (input) {
                case 1:
                    System.out.println("收入：" + income + ",开支：" + expenditure + ",总额：" + money);
                    break;
                case 2:
                    System.out.println("请输入收入金额：");
                    income += scanner.nextInt();
                    money += income;
                    break;
                case 3:
                    System.out.println("请输入开支金额：");
                    expenditure -= scanner.nextInt();
                    money += expenditure;
                    break;
                case 4:
                    sign = false;
                    break;
                default:
                    System.out.println("请输入 1-4 中的数字");
            }
        }
    }

    /**
     * 提示信息方法
     *
     * @return 输入值
     * @Scanner 输入对象
     */
    public static int message(Scanner scanner) {
        // 设置信息
        System.out.println("------------家庭收支明细------------");
        System.out.println("\t\t1 收支明细");
        System.out.println("\t\t2 登记收入");
        System.out.println("\t\t3 登记支出");
        System.out.println("\t\t4 退    出");
        System.out.println("\t\t请选择(1-4)：请按任意键继续...");
        // 获取输入信息
        int input = scanner.nextInt();
        // 返回输入内容
        return input;
    }
}
