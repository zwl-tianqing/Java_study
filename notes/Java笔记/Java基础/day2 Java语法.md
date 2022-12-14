## Java的基本语法

### 1、关键字

* 定义：被Java语言赋予了特殊含义，用作专门用途的字符串（单词）
* 特点：关键字都是小写英文字母

| 用于定义数据类型的关键字  |           |        |        |          |
| ------------- | --------- | ------ | ------ | -------- |
| class         | interface | enum   | byte   | short    |
| int           | long      | float  | double | char     |
| boolean       | void      |        |        |          |
| 用于定义数据类型值的关键字 |           |        |        |          |
| true          | false     | null   |        |          |
| 用于定义流程控制的关键字  |           |        |        |          |
| if            | else      | switch | case   | default  |
| while         | do        | for    | break  | continue |
| return        |           |        |        |          |

| 用于定义访问权限修饰符的关键字        |            |           |              |        |
| ---------------------- | ---------- | --------- | ------------ | ------ |
| Private                | Protected  | Public    |              |        |
| 用于定义类，函数，变量修饰符的关键字     |            |           |              |        |
| abstract               | final      | static    | synchronized |        |
| 用于定义类与类之间关系的关键字        |            |           |              |        |
| extends                | implements |           |              |        |
| 用于定义建立实例及引用实例，判断实例的关键字 |            |           |              |        |
| new                    | this       | super     | instanceof   |        |
| 用于异常处理的关键字             |            |           |              |        |
| try                    | catch      | finally   | throw        | throws |
| 用于包的关键字                |            |           |              |        |
| package                | import     |           |              |        |
| 其他修饰符关键字               |            |           |              |        |
| native                 | strictfp   | transient | volatile     | assert |

### 2、保留字

* Java保留字：现有Java版本尚未使用的。但以后版本可能会作为关键字使用。自己命名标识符时尽量避开使用这些保留字。
  
  （JDK1.8） byValue、cast、future、 generic、 inner、 operator、 outer、 rest、 var 、 goto 、const

### 3、标识符

* 标识符：Java中对各种**变量、方法、类**等要素命名是使用的字符序列称为标识符（凡是可以自己取名字的地方都可以叫标识符）
* 定义合法标识符的规则：
  * 只能有26个英文字母大小写，数字（0-9），_或$组成
  * 不能以数字开头
  * 不可以使用关键字和保留字做为标识符（保留字不能做作为标识符的原因是一位如何更新jdk可能会导致程序出错产生bug），但可以包含关键字和保留字。
  * Java中严格区分大小写、没有长度限制
  * 标识符中不能有空格（组成元素中不包括空格）
  * 注意：标识符尽量能简单，能够符合意思，提高阅读性。

### 4、变量

#### 4.1 变量的初始

* 概念：
  
  > 内存中的一个储存区域
  > 变量有自己的数据类型与名字
  > 变量必须先声明后使用 例如：int i = 1;（声明）
  > 变量的值在同一数据类型范围了是可以改变的 例如：i = 2;（赋值）

* 使用变量注意：

> 变量的作用域：在一对 {} （大括号）之间有效
> 初始化赋予值

* 定义变量的格式：
  
  > 数据类型 变量名 = 初始值;

* 变量是通过变量名来访问那块内存区域的

#### 4.2 变量的分类

1. 按照数据类型分类的

> 对于每一种数据都定义了明确的具体数据类型，在内存中分配了不同打下的内存空间    
> ![type.PNG](https://i.loli.net/2020/09/01/7EL4XpjHKzeTcSR.png)

2. 按照声明位置分类
* 成员变量（全局变量）：在方法体外，类体内声明的变量称为成员变量

* 局部变量：在方法体内声明的变量称为局部变量

![class.PNG](https://i.loli.net/2020/09/01/5o73VbGTZRmAaMy.png)

* 注意：二者在初始化值之间的异同

* 同：都有生命周期        异：局部变量除了形参，都需显示初始化

### 5、数据类型

#### 5.1基本数据类型

##### 5.1.1 数值型

* 整数数据类型：byte、short、int、long

* 有固定的表述范围和字段长度，不收具体 os （操作系统）的影响

* bit 是一种单位：如 010101 就是 6bit。形容二进制的位数

* java的整型常量默认为 int 型，声明long型常量须后加‘l’或‘L’

| **类  型** | **占用存储空间** | **表数范围**       |
| -------- | ---------- | -------------- |
| byte     | 1字节=8bit   | -128 ~ 127     |
| short    | 2字节        | -2^15 ~2^15-1  |
| int      | 4字节        | -2^31 ~ 2^31-1 |
| long     | 8字节        | -2^63 ~ 2^63-1 |

```java
//声明变量
byte i = 1;
short i = 1;
int i = 1;
long i = 1l;
//long 数据类型赋值的时候数字后面必须跟上 l 或 L
```

##### 5.1.2 浮点数据类型：float、double

1. 有固定的表述范围和字段长度，不收具体 os （操作系统）的影响

2. Java 的浮点数型常量默认为 double 型，声明 float 型常量，须后加 f or F

3. 浮点型常量有两种表示形式:
* 十进制形式 如：5.12     512.0f    .512（必须要有小数点）
* 科学计数法 如:  5.12e2      512E2     100E-2

| 类型        | 占用的存储空间 | 表述范围                   | 精度      |
| --------- | ------- | ---------------------- | ------- |
| 单精度float  | 4字节     | -3.403E38 ~ 3.403E38   | 7位有效数字  |
| 双精度double | 8字节     | -1.798E308 ~ 1.798E308 | 16位有效数字 |

```java
//声明变量
double i = 1.22;
float i = 1.22f;// float 数据类型在赋值时必须在数字后面跟上 f or F
```

##### 5.1.3 字符型（char）

* char 型数据用来表示通常意义上的字符（两字节）

* 字符常量的三种表现形式
  
  * 字符：用英文的单引号括起来的单个字母、数字、符号 例如：char c1 = 'L'
  * 转义字符：\ （转义符）将后面的字符装换成特殊的字符常量 例如：表示单引号 char = ‘ \\' ’
  * 直接使用Unicode编码表示字符常量：'\\uxxxx' 其中，xxxx 表示一个十六进制的整数。如：'\\u0000a' 表示 '\\n'
  * char 类型是可以运算的，因为它们都对应有 Unicode 编码

##### 5.1.4布尔型（boolean）

* boolean 类型适用于逻辑运行，一般用于程序流程控制
  * if 条件控制语句、while 循环控制语句、do while 循环控制语句、for 循环控制语句。 
* boolean 类型数据只允许去 false 和 true，无null
  * 不可以去 0 和 非 0 的整数来代替 false 和 true，这点和C语言不同

##### 5.2引用数据类型

##### 5.2.1 类（class） 包括字符串（string）

* 引用数据类型，都可以用null作为值，也就是说可以在初始化的时候赋值位null。用来表示这个应用类型变量存储的地址为空

* 字符串（string）：有 0 个到多个字母字符共同组成的一个串，这个串要用英文双引号括起来。string的值是不可变的（不可变的字符序列）。创建的字符串将存放在数据区，保证每个字符串常量只有一个，不会创建多个副本。

```java
int i0 = 1;
int i2 = 1;
//以上会在内存中出现2个1的值，因为基本数据类型的值是直接放在栈中的内存里

String s0 = "hello";
String s1 = "hello";
//这种的，不会在内存中存在两个"hello"，只会存在1个"hello"。因为引用数据类型是把堆中的字符常量的地址放到自己的存储空间之中。
```

##### 5.2.2 接口（interface）

##### 5.2.3 数组（[]）

### **6.基本数据类型转换**

#### 6.1 自动类型转换：容量小的自动装换为容量大的类型。

数据类型按容量大小排序：

> byte
> short   ——> int ——> long ——> float ——> double
> char

* 有多种数据类型混合计算是，系统会先自动的将数据先转换成容量最大的数据类型，在进行计算。

* byte、short、char 之间不能相互转换，他们在计算是首先转换成int

* 字符串和任何数据类型的值进行（+） 运算时都会变成字符串拼接转换成字符串类型。

#### 6.2 **强制类型转换**

* 自动转换的逆过程，将容量大的数据类型转换成容量小的数据类型。使用时需要加上强制转换符（()），但可能造成精度降低或溢出，格外要注意。

```java
int a = 1;
byte b = (byte) a;//强制类型数据转换
```

* 通常，字符串不能直接转换为基本数据类型，但是可以通过基本类型对应的包装类则可以实现把字符串转换成基本数据类型 

```java
String a = "43";
int i = Integer.parseInt(a);//包装类转换
```

* <font color=red>**boolean 类型不可以转换成其它的数据类型**</font>

### 7、运算符

#### 7.1 **算数运算符**

| **运算符**        | **运算**                                           | **范例**               | **结果**         |
| -------------- | ------------------------------------------------ | -------------------- | -------------- |
| **+**          | 正号                                               | +3                   | 3              |
| **-**          | 负号                                               | b=4; -b              | -4             |
| **+**          | 加                                                | 5+5                  | 10             |
| **-**          | 减                                                | 6-4                  | 2              |
| *****          | 乘                                                | 3*4                  | 12             |
| **/**          | 除                                                | 5/5                  | 1              |
| **%**          | 取余                                               | 7%5                  | 2              |
| **++****++**   | 自增（前）：先运算后取值                        自增（后）：先取值后运算 | a=2;b=++a;a=2;b=a++; | a=3;b=3a=3;b=2 |
| **- -****- -** | 自减（前）：先运算后取值                        自减（后）：先取值后运算 | a=2;b=- -aa=2;b=a- - | a=1;b=1a=1;b=2 |
| **+**          | 字符串相加                                            | “He”+”llo”           | “Hello”        |

```java
  public class Test1 {
      //程序入口
      public static void main(String[] args) {
          //当整数除以整数的时候会舍弃小数位
          System.out.println(7/2);        // 结果为 3
          //当小数除以整数的时候就会保留小数
          System.out.println(7.0/2);        // 结果为 3.5
      }
  }
```

* 注意：
1. 如果对于负数取模，可以把模数负号忽略不计，例如 5%-2 = 1；但被除数为负，这不可以忽略。此外，取模运算的结果不一定总是整数

2. 对于除号 “\” 而言，它的整数除和小数除是有区别的。整数除会舍弃小数部分。
   
   > 例如：int x = 3500; x=x/1000*1000; x 的结果是？            x = 3000;

3. "+" 除了有字符串相加功能外，还能把非字符串装换成字符串。
   
   > 例如：System.out.println("5+5="+5+5);    //打印结果是？ 5+5=55

```java
//以下语句区别
System.out.println('*'+'\t'+'*');    //    93
System.out.println("*"+'\t'+'*');    //    *        *
```

#### 7.2 **赋值运算符**

1. 符号：“=”
* 当 “=” 两侧数据类型不一致时，可以使用自动类型转换或强制类型转换进行处理

* 支持连续赋值

```java
int i,m,n;
i=m=n=1;//连续赋值
```

* 扩展赋值运算符：+=，-=，*=，/=，%=
  
  ```java
  i += 2; //等价于 i= i + 2 其他类似于
  ```

* 字符串 += 等于拼接

* 以下代码 1 和 2 的区别

```java
short s = 3;
s = s + 2;    // 代码1    （无法编译，需要强制类型转换。变量参与运算时，java程序不知道具体的这个变量在做完运算后会不会超出当前变量的数值范围，所以会先把变量转换为一个更大长度的变量。这个例子中，short是一个短整型数据，会自动转换为默认的int）
s += 2;        // 代码2    （正常，在使用扩展赋值运算符的时候，变量在参与运算的时候会把结果自动强制转换为当前变量的类型）
```

* 思考题

```java
int i = 1;
i *= 0.1;
System.out.println(i);    // 0
i++;
System.out.println(i);     // 1
```

#### 7.3 **比较运算符**（关系运算符）

| **运算符**        | **运算                 范例                     结果**   |
| -------------- | -------------------------------------------------- |
| **==**         | 相等于                4==3                    false   |
| **!=**         | 不等于                4!=3                     true   |
| **<**          | 小于                  4<3                      false |
| **>**          | 大于                  4>3                      true  |
| **<=**         | 小于等于              4<=3                     false   |
| **>=**         | 大于等于              4>=3                     true    |
| **instanceof** | 检查是否是类的对象    “Hello” instanceof String    true     |

* 比较运算符的结果都是boolean型
* <font color=red>比较运算的 “==” 不能误写成 “=”</font>

#### 7.4 **逻辑运算符**

* 符号：

* &（逻辑与）、|（逻辑或）、！（逻辑非）、&&（短路与）、||（短路非）、^（逻辑异或）

| **a**     | **b**     | **a&b** | **a\|b** | **!a** | **a^b** | **a&&b** | **a\|\|b** |
| --------- | --------- | ------- | -------- | ------ | ------- | -------- | ---------- |
| **true**  | **true**  | true    | true     | false  | false   | true     | true       |
| **true**  | **false** | false   | true     | false  | true    | false    | true       |
| **false** | **true**  | false   | true     | true   | true    | false    | true       |
| **false** | **false** | false   | false    | true   | false   | false    | false      |

* 逻辑运算符用于连接布尔型表达式，在java中不可以写成 3<x<6 ，应该写成 x>3 & x>6.

* “&” 与 “&&” 的区别
  
  * 但 & 时，左边无论真假，右边都参与运算
  * 双&&时，如果左边为真，右边参与运算，如果左边为假，右边不参与运算
  * “|” 与 “||”的区别同理，||表示：当左边为真时，右边不参与运算。
  * “^” 与 “|” 的不同之处是：异或左右都为 true的时候，结果为false。（异或，追求的是异）

#### 7.5 **位运算符**

| **位运算符** |                                                                                                                                      |                                               |
| -------- | ------------------------------------------------------------------------------------------------------------------------------------ | --------------------------------------------- |
| 运算符      | 运算                                                                                                                                   | 范例                                            |
| <<       | 左移                                                                                                                                   | 3 << 2 = 12 --> 3\*2*2=12，m << n ---> m * 2^n |
| >>       | 右移                                                                                                                                   | 3 >> 1 = 1 --> 3/2=1，m >> n --> m * 2^-n      |
| >>>      | 无符号右移                                                                                                                                | 3 >>> 1 = 1 --> 3/2=1，正数的>>>与>>一致             |
| &        | 与运算                                                                                                                                  | 6 & 3 = 2                                     |
| \|       | 或运算                                                                                                                                  | 6 \| 3 = 7                                    |
| ^        | 异或运算                                                                                                                                 | 6 ^ 3 = 5                                     |
| ~        | 反码                                                                                                                                   | ~6 = -7                                       |
| <<       | 空位补0，被移除的高位丢弃，空缺位补0。                                                                                                                 |                                               |
| ----     | ------------------------------------------------------------                                                                         |                                               |
| >>       | 被移位的二进制最高位是0，右移后，空缺位补0；最高位是1，空缺位补1。                                                                                                  |                                               |
| >>>      | 被移位二进制最高位无论是0或者是1，空缺位都用0补。                                                                                                           |                                               |
| &        | 二进制位进行&运算，只有1&1时结果是1，否则是0;                                                                                                           |                                               |
| \|       | 二进制位进行 \| 运算，只有0 \| 0时结果是0，否则是1;                                                                                                     |                                               |
| ^        | 相同二进制位进行 ^ 运算，结果是0；1^1=0 , 0^0=0不相同二进制位 ^ 运算结果是1。1^0=1 , 0^1=1                                                                       |                                               |
| ~        | 正数取反，各二进制码按补码各位取反                                                                                                  负数取反，各二进制码按补码各位取反 |                                               |

* 位运算符,直接对二进制进行运算

#### 7.6 **三目运算符**（三元运算符）

* 格式：（条件表达式）？表达式1：表达式2
  
  > 如果 条件表达式为true ，结果为表达式1
  > 条件表达式为false，结果为表达式2

* 作业：求两个数中的最大值；求三个数中的最大值
  
  ```java
  1 > 2 ? 1 : 2 //两个数中的最大值
  1 > 2 ? (1 > 3 ? 1: 3):(2 > 3 ? 2 : 3) //三个数的最大值
  ```

### 算数符的优先级

![priority.PNG](https://i.loli.net/2020/09/05/LTSI8vWPKUYAOgq.png)
