package day03;

import java.util.Arrays;

/**
 * @author long
 * @create 2022-08-03 15:29
 * 测试数组方法工具类
 */
public class ArraysTest {
    public static void main(String[] args) {
        // 声明 int 类型数组并静态初始化
        int[] nums = new int[]{2,34,-34,45,12,34,57};
        // 调用数组工具类方法，排序方法
        Arrays.sort(nums);
        // 测试排序结果,调用toString方法打印数组信息
        System.out.println(Arrays.toString(nums));
        // 将指定值填充到数组，数组中所有的元素都会变成该值
        Arrays.fill(nums,23);
        // 打印数组信息
        System.out.println(Arrays.toString(nums));
    }
}
