package day03;

/**
 * @author long
 * @create 2022-08-03 11:33
 * 数组测试
 */
public class ArrayTest {
    public static void main(String[] args) {
        // 定义测试数组
        int nums[] = new int[]{-99, -23, 0, 45, 67, 78, 99};
        // 开始时间
        double time = System.currentTimeMillis();
        // 调用查找算法
        int index = binarySearch(nums, 45);
        // 结束时间
        double timeEnd = System.currentTimeMillis();
        // 计算使用时间
        double t = timeEnd - time;
        System.out.printf("%.7f",t);
        // 打印结果
        if (index != -1) {
            System.out.println("该数据在数组中的索引为：" + index);
        } else {
            System.out.println("该数据不存在数组中");
        }
    }

    /**
     * 二分查找算法：
     * 二分查找的数组必须有序
     *
     * @param nums   数组集合
     * @param number 查找数据
     * @return 查找数据所在索引
     */
    public static int binarySearch(int nums[], int number) {
        // 定义索引变量并初始化
        int index = 0;
        // 定义 head 变量并初始化 用来确定查找范围的开始索引
        int head = 0;
        // 定义 end 变量并初始化 用来确定查找范围的结束索引
        int end = nums.length - 1;
        // 二分查找原理实现
        while (head <= end) {    // 判断表达式：查找范围内至少有一个元素才查找
            // 每次范围内的查找中间元素
            index = (head + end) / 2;
            if (nums[index] == number) { // 判断表达式：判断是否找到了查找的元素
                // 找到后返回元素索引
                return index;
            } else if (nums[index] > number) { // 判断元素是否在 前半截 区域
                // 修改查找范围
                end = index - 1;
            } else { // 元素在后半截区域
                head = index + 1;
            }
        }
        // 若循环结束后，仍未找到指定数据，返回 -1，表示该元素不在集合内
        index = -1;
        return index;
    }
}
