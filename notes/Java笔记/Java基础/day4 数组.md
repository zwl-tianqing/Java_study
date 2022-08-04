### [toc]

## 数组

### 1、什么是数组

> 数组（Array）：多个<font color='red'>相同数据类型数据</font>按照一定顺序排列的集合，并使用一个名字命名，并通过编号的方式对这些数据进行管理

* 数组的类型
  
  > 数组是<font color='red'>引用数据类型</font>，因此数组元素可以是<font color='red'>任意数据类型</font>，包括基本数据类型和引用数据类型。

* 创建数组对象，会在内存中开辟一整块<font color='red'>连续的空间</font>，而且数组名中引用的是这块内存空间的首地址。

* 数组的长度一旦确定，就不可更改

* 我们可以通过索引（下标）的方式访问指定位置的元素，速度很快

* 数组的分类
  
  * 按照维度：一维数组、二维数组、三维数组....
  
  * 按照元素的数据类型分类：基本数据类型数组、引用数据类型数组。

### 2、数组的使用

1. **一维数组
   
   * 数组声明
     
     > type[] var 或 type var[x
     
     ```java
     // int 数组声明
     int[] a;
     int a[];
     ```
   
   * 数组初始化
     
     - 定义并使用运算符**new**分配空间后,才可以引用引用数组中的每个元素。
       
       ```java
       //动态初始化: 数组声明且为数组元素分配空间与赋值的操作分开进行
       int[] a = new int[3];
       a[0] = 2;
       a[1] = 5;
       a[2] = 6;
       //静态初始化：在定义数组的同时就为数组元素分配空间并赋值
       int[] a = new int[]{2,5,7};
       int[] a1 = {3,6.9};
       //数组引用 数组下标指向从 0 开始
       System.out,println(a[1]);//所以这里指向的是数组中的第二个元素素
       ```
     * 数组引用的方式；数组名[数组元素下标]
     
     * 数组元素下标可以是整形常量或整形表达式。如 a[3]，b[i]，c[6*i]
     
     * 数组元素下标从0开始；
       
       > 长度为n的数组合法小标取值范围0——> n-1
       > 
       > a[] = new int[3];
       > 
       > 可引用的数组元素为a[0]、a[1]、a[2];
     
     * 每个数组都有一个属性length指明它的长度，如：a.length指明数组a的长度（元素个数）
       
       > 数组一旦初始化，其长度是不可变的。
   
   * **数组的元素默认初始化**
     
     * 数组是引用类型，它的元素相当于类的成员变量，因为数组分配空间后，它的每个元素按照成员变量同样的方式被隐式初始化。
       
       ```java
       public class Test{
           public static void main(String[] args){
               int a[] = new int[3];
               System.out.println(a[1]);//默认初始化为0
               a[1] = 2;
               System.out.println(a[1]);// 为 2 更改数组内容
           }
       }
       ```

2. 多维数组

> ```java
> //初始化
> //格式1（动态初始化）
> int[][] arr = new int[3][2];
> //上方定义了名称为 arr 的二维数组，二维数组中有3个一维数组，每个一维数组中有2个元素
> //一维数组的名称分别为arr[0], arr[1], arr[2]
> //给第一个一维数组1脚标赋值为78写法是：arr[0][1]=78;
> 
> //格式2（动态初始化）
> int[][] arr = new int[3][];
> //二维数组中有3个一维数组。每个一维数组都是默认初始化为null
> //可以对这个三个一维数组分别初始化
> arr[0] = new int[3];
> arr[1] = new int[2];
> arr[2] = new int[1];
> //注意
> int[][] = new int[][3];//非法声明
> 
> //格式3（静态初始化）
> int[][] arr = new int[][]{{1,3},{3,4}};
> //定于数组并将每个一维数组中的具体元素默认初始化
> 
> //注意特殊写法
> int[]x,y[];//x是一个一维数组，y是一个二维数组。
> //java中多为数组不必都是规则矩阵
> ```

### 3、Array 工具类的使用

> java.util.Arrays类是操作数据类的工具类，包含了用来操作数组（比如排序和搜索）的各种方法

| 方法名                              | 作用                             |
| -------------------------------- | ------------------------------ |
| boolean equals(int[] a,int[] b)  | 判断两个数组是否相等                     |
| String toString(int a)           | 输出数组信息                         |
| void fill(int a[],int val)       | 将指定值val填充到数组，数组中所有的元素的值都会变成val |
| void sort(int[] a)               | 对数组进行排序                        |
| int binarySearch(int[]a,int key) | 对排序后的数组进行二分查找方法检索指定值           |

```java
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
```