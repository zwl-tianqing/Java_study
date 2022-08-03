## 面向对象

### 面向对象（oop）与面向过程（pop）

> * 两者都是一种思想，面向对象是面向过程而言的。面向过程，强调的是功能行为。面向对象，将功能封装成对象，强调具备了功能的对象。
> * 面向对象更加强调运用在人类在日常的思维逻辑中采用的思想方法与原则，如抽象、分类、继承、聚合、多态。

### 类

> * 类：是由**属性**和**行为**组成。
> 
> ```java
> //语法格式
> /**
> * 修饰符 class 类名{
> *    属性声明;
> *    方法声明;
> * }
> */
> 
> //举例
> public class Person{
> // 类的成员变量可以先声明，不用初始化。类成员变量是有默认值的
> public int age;//年龄
> //显示年龄
> //方法 5 要素
> /**
> *    修饰符、返回值类型、方法名、参数、方法体
> *     打印姓名方法
> */
> public void showAge(){
>   System.out.println(age);
> }
> }
> ```
> 
> * 属性
> 
> > * 语法格式：修饰符 类型 属性名 = 初始值
> > 
> > * 说明：修饰符private：该属性只能由该类的方法访问
> > 
> > ​            修饰符public：该属性可以被该类以外的方法访问
> > 
> > ​            类型：任何基本类型，如int、boolean或任何类。
> > 
> > ```java
> > public class Person{
> >   private int age; //私有属性
> >   public String name = "aa";//类外能够访问
> >   //变量分类
> >   public int id;    // 实例变量
> >   public static char set = '男';//静态变量（类变量）
> >      // 参数age 是形参变量
> >   public void setAge(int age){
> >       int n = 0; // 是局部变量
> >   }
> >   //
> >   {
> >         //这就是代码块
> >       int i = 0;//这就是代码块局部变量
> >   }
> > }
> > ```
> > 
> > * 成员变量和局部变量的区别
> >   * 成员变量
> >   1. 成员变量定义在类中，方法外。在整个类中都能访问。
> >      2. 成员变量分为类成员变量和实例成员变量，实例变量存在于对象所在的堆中。
> >      3. 成员变量有默认初始值。
> >      4. 成员变量的权限修饰符可以根据需要需要，任选一个。
> >      5. 类成员变量生命周期在类不被加载时结束。
> >      6. 实例成员变量生命周期在对象不被使用时结束。
> >   * 局部变量：
> >   1. 局部成员变量只定义在局部范围类，如：代码块内，方法内等。
> >   2. 局部变量只存在与栈内存中。
> >   3. 作用的范围结束，变量空间自动释放。
> >   4. 局部变量没有默认值，每次使用必须显示初始化。
> >   5. 局部变量声明时不指定权限修饰符
> 
> * 方法（method）
> 
> > * 什么是方法（函数）？
> > 
> > * 方法是类或对象行为特征的抽象，也称为函数。
> > 
> > * Java里的方法不能独立存在，所有的方法必须定义在类里。
> > 
> > * 语法格式：修饰符 返回值类型 方法名（参数列表）{方法体语句;}
> > 
> > * 说明：
> > 
> > 修饰符：public，private，protected等。
> > 
> > 返回值类型：return 语句传递返回值。没有返回值：void。
> > 
> > ```java
> > public void Person{
> >  privte int age;//私有成员变量，只在类中使用
> >  public int getAge(){ return age; } // 声明方法 getAge
> >  public void setAge(int age){    // 声明方法 setAge
> >      this.age = age;        //将参数age 赋值给类的成员变量age。this至当前成员变量
> >  }
> > }
> > ```
> > 
> > * 方法的调用
> > 
> > * 方法只有被调用才会被执行
> > 
> > * 没有返回值的方法，最后的一句return可以不写
> > 
> > * 调用方法时，方法的返回结果交给调用者处理
> > 
> > * 方法中内只能调用方法，不能定义方法。
> > 
> > <font : color = red>PS：方法中使用匿名内部类中书写的方法不属于在方法中定义方法，而是在类中定义方法</font>
> > 
> > * <font : color = red>同一个类中，所有的方法可以直接调用，不需要new创建对象（当然 main 方法不行，只能调用静态的方法）</font>
> > 
> > * <font : color = red>方法的重载</font>
> > 
> > * 概念：在同一个类中，允许存在一个的同名方法，只要它们的参数个数和参数类型不同即可。
> > 
> > * 重载的特点：与返回类型无关，只看<font : color=red>参数列表</font>，且参数列表必须不同。（参数个数或参数类型）调用时，根据方法参数列表的不同来区别。
> > 
> > ```java
> > public class Test{
> >    public static void main(String[] args){
> >        public int add(int x,int y){
> >            return x * y;
> >        }
> >        //下面注释的方法报错。只有不同的数据类型，参数个数不同的同名方法才能在同一个类中共存
> > //        public int add(int m,int n){
> > //            return m * n;
> > //        }
> >        //以下两个方法就属于典型的 方法重载
> >        public int add(int x,double y){
> >            return x * y;
> >        }
> >        public int add(int x,int y,int z){
> >            return x * y * z;
> >        }
> >    }
> > }
> > ```
> > 
> > * java中特有的可变参数定义
> > 
> > * 可变参数：方法参数部分指定类型非个数是可变多个的
> > 
> > * 声明方式：方法名（参数类型... 参数名）
> > 
> > * 可变参数方法的使用方式和方法参数数组部分使用是相同
> > 
> > * 如果一个方法有多个形参，可变参数（...）一定要放到最后
> > 
> > ```java
> > public class Test{
> > 
> >   public static void main(String[] args){
> >       showInfo("张三","男","13");//可以使用直接装填
> >       String[] s1 = new String[]{"南京","q5q66","t626"};
> >       showInfo(s1);//也可以装入数组
> >       showInfo();//也可以一个不填
> >   }
> >   /**
> >    * java特有的...的方式来传递可变个数的参数,这种使用的方式与数组相同。表示0个或多个参数。如果一个方法有多个形参，可变参数（...）一定要放到最后
> >    *(String... s,int a,int b)这种声明方式是错误了
> >    *(int a,String... s,int b)这种声明方式是错误了
> >    *(int a,int b,String... s)这种声明方式是对的
> >    * @param s
> >    */
> >   public static void showInfo(String... s){
> >       for (String s1 : s){
> >           System.out.println(s1);
> >       }
> >   }
> > }
> > ```
> > 
> > * 方法参数的传递
> > 
> > * 方法必须在所在的类或对象被调用才有意义，
> > 
> > * 方法的参数：
> >   
> >   * 形参：方法声明时参数
> >   * 实参：方法调用时实际传给形参的参数值
> > 
> > * java的实际参数传递方法只有一种：值传递。即将实际参数的副本（即变量在栈内存的内容）传入方法，而参数本身不受影响。
> > 
> > ```java
> >  public class Test{
> >      public static void main(String[] args){
> >          //基本数据类型在传递参数时，将值传递给形参，不会改变实参的值
> >          int i = 0;
> >          change(i);//输出为 6
> >          System.out.println("main方法中的i:"+i);    //输出为 0
> >          //引用数据类型在传递参数类型时，将在栈内存中的引用对象的内存地址传递给形参从而使得此形参也指向了引用对象，此时修改的时堆内存中对象成员变量的数据。而不会对栈内存的地址产生影响。
> >          A a = new A();
> >          System.out.println("change方法调用前的a.i:"+a.i);//输出为 0
> >          change(a);//输出为 6
> >          System.out.println("change方法调用后的a.i:"+a.i);//输出为 6
> >      }
> >      //静态方法
> >      public static void change(int i){
> >          i = 6;
> >          System.out.println("change调用时方法中i:"+i);
> >      }
> >      //静态方法 方法重载
> >      public static void change(A a){
> >          a.i = 6;
> >          System.out.println("change调用时方法中a.i:"+a.i);
> >      }
> >  }
> >  class A(){
> >      int i;
> >  }
> > ```
> > 
> > * 类的成员之三：构造器（构造方法）
> >   
> >   * 构造器的特征
> >     1. 它具有和类相同的名称
> >     2. 它不能声明返回值类型（与声明为void不同）
> >     3. 不能被static、final、synchronized、native修饰，不能有return语句返回值
> >   * 构造器的作用：创建对象：给对象进行初始化
> >   * 根据参数的不同，构造器分为两种
> >     * 无参构造：没有参数
> >     * 有参构造：有参数，创建对象是会通过赋予的实参值来进行成员变量初始化
> >   
> >   ```java
> >   public class Test{
> >      Person p = new Person();//是通过new 关键字来进行创建对象并初始化。
> >      //如果不书写构造方法，系统会自动生成隐式的无参构造方法。但一旦书写了构造方法，系统就会调用自己写的构造方法。构造方法可以存在多个
> >      //有参构造的对象声明
> >      Person p = new Person(13);
> >   }
> >   class Person{
> >      private int age;
> >      Person(){}
> >      public Person(int age){
> >          this.age = age;
> >      }
> >   }
> >   ```
> >   
> >   **<font : color=red>PS:注意</font>**
> >   
> >   1. **java语言中，每个类至少有一个构造器**
> >   2. **默认构造器的修饰符和所属的类修饰符一致**
> >   3. **一旦定义了构造器，则系统不提供默认构造器**
> >   4. **一个类可以重载多个构造器**
> >   5. **父类的构造器不能被子类继承**
> > 
> > * 构造器重载
> >   
> >   * 构造器一般用来创建对象并初始化属性值。
> >   * 构造器重载使得对象对的创建更加灵活，方便创建各种不同的对象
> >   * 构造器重载，参数列表必须不同
> > 
> > * **<font : color=red>关键字——this</font>**
> >   
> >   * 在java中，this关键字比较难理解，它的作用和词义很接近
> >     * 它在方法内部使用，表示这个所属方法的引用
> >     * 它在构造器中使用，表示该构造器正在初始化对象
> >   * this表示当前对象，可以调用类的属性、方法、构造器。
> >   * 什么时候使用this？
> >     * 当在方法内需要调用该该方法的对象时，就用this
> >   
> >   ```java
> >   public class Person{
> >      private int age;
> >      private String name;
> >      public Person(int age,String name){//在构造方法中，当形参和成员变量重名时。使用this来指向当前类的成员变量来表明当前变量是成员变量。完美解决含义不明的问题。
> >          this.age = age;
> >          this.name = name;
> >      }
> >      public void showInfo(){//但在方法中使用当前类的成员变量是，添加this指向能大大的增强代码的可读性。
> >           System.out.println("姓名:"+this.name); 
> >          System.out.println("年龄:"+this.age); 
> >      }
> >      public Person(){
> >   
> >      }
> >      public Person(int age){
> >          this();//表示调用类中的无参构造器
> >          this.age = age;
> >      }
> >      //this()表示使用当前类的构造器。可以作为一个类中构造器互相调用的特殊方式
> >      public Person(String name){
> >          this(1);//表示调用类中参数为age的有参构造器
> >          this.name = name;
> >      }
> >   }
> >   ```
> >   
> >   **<font : color=red>注意：</font>**
> >   
> >   **<font : color=red>1.使用this()必须放在构造器的首行(也就意味着一个构造器里面最多只使用一个this()调用其他构造器)</font>**
> >   
> >   **<font : color=red>2.使用this调用本类其他构造器时，必须保证至少有一个构造器不是用this()（实际上就是不能出现构造器自己调用自己）</font>**
> >   
> >   ```java
> >   package day6;
> >   
> >   public class Person2{
> >      private int age;
> >      private String name;
> >      public Person2(int age,String name){//在构造方法中，当形参和成员变量重名时。使用this来指向当前类的成员变量来表明当前变量是成员变量。完美解决含义不明的问题。
> >          this.age = age;
> >          this.name = name;
> >      }
> >      public void showInfo(){//但在方法中使用当前类的成员变量是，添加this指向能大大的增强代码的可读性。
> >          System.out.println("姓名:"+this.name);
> >          System.out.println("年龄:"+this.age);
> >      }
> >      public Person2(){
> >          //以下语句均出错，因为调用时最终会调用到本身的构造方法
> >          //this();        //调用本身构造方法
> >          //this(1);        //里面包含了this()本身的构造方法
> >          //this("111");    //里面包含了this()本身的构造方法
> >      }
> >      public Person2(int age){
> >          this();//表示调用类中的无参构造器
> >          this.age = age;
> >      }
> >      //this()表示使用当前类的构造器。可以作为一个类中构造器互相调用的特殊方式
> >      public Person2(String name){
> >          this(1);//表示调用类中参数为age的有参构造器
> >          this.name = name;
> >      }
> >   }
> >   ```
> > 
> > * 类的访问机制
> >   
> >   * 在一个类中的访问机制；类中的方法可以直接访问类的成员变量。（例外：static方法访问非static变量的成员变量，编译不通过）
> >   * 在不同类中的访问机制，先要用创建类的访问对象，才能在访问类中定义的非静态成员变量

### 对象

> * <font : color=red>注意：文档注释一般使用与方法和类上</font>
> * **类与对象的关系**
> * 类是对象的抽象，对象是类的实例。（如：汽车图纸是个类，而依照图纸造出来的汽车是一个对象 ）
> * 匿名对象：只用 new 创建直接使用方法，而不将对象赋予变量。例如 new Person().shout()
> * 使用情况
> * 如果对于一个对象只需要进行一次方法调用，那么久可以使用匿名对象。
> * 我们经常将匿名对象作为实参传给函数。
> 
> ```java
> //类的实例化        使用 new 关键字来实例化对象
> // 实例化 Person 类（创建 Person 对象）
> Person person;          // 声明一个 Person 的变量 person
> person = new Person();  // new Person()就是实例化Person类并赋值给person，
> // 赋值的值就是Person的实例
> // 一般直接写成 Person person = new Person();
> //类只有一个，但是通过多个类实例化出来的对象互不干扰。
> ```
> 
> | **成员变量类型**  | **初始值**                 |
> |:-----------:|:-----------------------:|
> | **byte**    | **0**                   |
> | **short**   | **0**                   |
> | **int**     | **0**                   |
> | **long**    | **0L**                  |
> | **float**   | **0.0F**                |
> | **double**  | **0.0D**                |
> | **char**    | '\\**u0000**'（**表示为空**） |
> | **boolean** | **false**               |
> | **引用数据类型**  | **null**                |

### 面向对象思想”落地“法则

**1. 关注类的设计，即设计类的成员：属性、方法**

**2. 类的实例化，即创建类的对象**

**3. 通过 “对象.属性”、“对象.方法” 执行**

### 包概念以及import导包

**1.在Java中包的概念和电脑里的文件夹类似，同样是为了解决文件太乱不好管理以及文件重名的问题**

**2.包可以包含类和子包**

**3.包在Java中的引用使用关键字<font : color=red>package</font>**

> * package语句作为java文件的第一句，指明改文件中定义的类所在的包。（若没有改语句，则指定无包）
> 
> * 格式： package 顶层包名.子包名；
>   
>   ```java
>   package day06.test; //指定类Test属于包day06.test
>   
>   public class Test{
>   
>   }
>   ```
> 
> * 包对应于系统的文件系统的项目，package语句中，用 "." 来指明包（目录）的层次;
> 
> * 包通常用小写单词，类名首字母通常大写。

**导包import**

* 为了使用定义在不同包中的Java类，需要import语句来引用指定包层次下所需要的类或全部类（.*）。import语句告诉编码器去哪里寻找类。

* 语法格式：import 包名[.子包名...].<类名 | *>
  
  ```java
  import day06.Test;//表示导入day06下的Test类
  import day06.*//表示导入day06下所有的类
  ```

* <font : color = red>注意：</font>
  
  * 若引入的包为：java.lang，则编译器默认可以获取此包下的类。不需要在显示说明
  * import语句出现在package之后，创建类之前
  * 一个类文件可以包含多个import语句
  * 可以使用import lee.\*;语句，表明导入lee包下的所有类。而lee包下sub子包内的类则不会被导入。import lee.sub.\*;才表示导入了sub包的所有类
  * import语句不是必须的，可坚持在类中使用其他类的全名
  * JDK 1.5加入 import static 语句

* **JDK 中主要的包介绍**
  
  1. java.lang ——包含一些 Java 语言的核心类，如String、Math、Integer、System和Thread，提供常用功能
  2. java.net——包含执行与网络相关的操作的类和接口
  3. java.io——包含能够提供的多种输入/输出功能的类。
  4. java.util——包含一些实用工具类，如定义系统特性、接口的集合框架类、使用与日期日历相关的函数。
  5. java.text——包含了一些java格式化相关的类
  6. java.sql——包含了java进行JDBC数据库编程的相关类/接口
  7. java.awt——包含了构成抽象窗口工具集（abstract window toolkits）的多个类，这些类被用来构建和管理应用程序的图形用户界面（GUI）
  8. java.applet——包含applet运行所需的一些类。

### 面向对象的三大特征

* 封装
  
  > 使用者对类内部定义的属性（成员变量）直接操作容易导致数据的错误、混乱以及安全性问题，因此出现了封装以及属性隐藏
  > 
  > **信息封装和隐藏**
  > 
  > java中通过将数据声明声明为私有（private），在提供公用的(public)方法：getXxx()和setXxx()（Xxx代表属性，其中首字母大喜）实现对属性的操作，实现下面目的：
  > 
  > 1. 隐藏一个类中不需要对外提供的实现细节；
  > 2. 使用者通过实现制定好的方法来访问数据，可以方便的加入控制逻辑，限制对属性的不合理操作；
  > 3. 便于代码的修改，增强代码的可维护性；
  > 
  > **四种访问修饰符（修饰变量和方法）**
  > 
  > | **修饰符**         | **类内部** | **同一个包内** | **子类**  | **不在前面条件之中任何地方** |
  > |:---------------:|:-------:|:---------:|:-------:|:----------------:|
  > | **private**     | **yes** |           |         |                  |
  > | **default(缺省)** | **yes** | **yes**   |         |                  |
  > | **protected**   | **yes** | **yes**   | **yes** |                  |
  > | **public**      | **yes** | **yes**   | **yes** | **yes**          |
  > 
  > **<font : color = red>PS：在不同的包中的子类也能调用父类的protected属性与方法</font>**
  > 
  > **对于class的权限修饰符只可以用public和default（缺省）**
  > 
  > 1. public类可以在任意地方访问
  > 2. default类只可以被同一个包中的类访问
  > 
  > **JavaBean**
  > 
  > * JavaBean是一种Java语言写成的可重用组件
  > * JavaBean的标准：
  >   * 类是公有的
  >   * 有一个无参构造器
  >   * 有属性，属性一般是私有的，且有对应的get、set方法
  > * 用户可以使用JavaBean将功能、处理、值、数据库访问和其他任何可以用Java代码穿凿的对象进行打包，并且其他开发者可以通过内部的Jsp页面、servlet、其他的JavaBean、applet程序或者应用来使用这些对象。**（简单的说就是JavaBean就是一个接受对象数据和传递对象数据的中间工具）**
  > * 用户可以认为JavaBean提供了一种随时随地可以复制和粘贴的功能，而不关心任何改变
  > 
  > ```java
  > package day6;
  > 
  > /**
  > * JavaBean书写测试
  > */
  > public class Person3 {
  >    private String name;
  >    private int age;
  >    private char sex;
  > 
  >    //idea get/set快捷鍵 alt + insert
  >    public void setName(String name) {
  >        this.name = name;
  >    }
  > 
  >    public void setAge(int age) {
  >        this.age = age;
  >    }
  > 
  >    public void setSex(char sex) {
  >        this.sex = sex;
  >    }
  > 
  >    public String getName() {
  >        return name;
  >    }
  > 
  >    public int getAge() {
  >        return age;
  >    }
  > 
  >    public char getSex() {
  >        return sex;
  >    }
  > }
  > ```

* 继承
  
  > * **为什么要有继承？**
  > 
  > * 多个类中存在相同的属性和行为，为了避免代码的重复和冗余，将这些共同拥有的内容抽取到单独的一个类中，那么多个类就无需在定义这些属性和行为，只要继承该类即可。
  > 
  > * 此处的多个类被称为**子类**，单独的这个类被称为**父类（也成基类和超类）**。
  > 
  > * 类继承的语法结构
  > 
  > ```java
  > class Student extends Person{}
  > ```
  > 
  > * **继承的作用**
  > 
  > * 提高代码的复用性
  > 
  > * 继承的出现产生了类与类之间的关系，提供了多态的前提
  > 
  > * **<font color = red>注意：不要仅为了获取其它类中的某个功能去继承类。继承是有逻辑关系的，不要随便继承。</font>**
  > 
  > * 子类继承父类，就继承了父类的<font color = red>属性和方法（但不包括构造方法、私有属性和私有方法）</font>
  > 
  > * 在子类中，继承使用关键字用的是”extends“，即子类不是父类的子集而是父类的扩展。
  > 
  > * 子类不能直接访问父类中私有的属性和方法
  > 
  > * java只有单继承而没有多继承，一个子类只有一个父类。但是有多层继承。子类的父类也可以继承一个类。
  > 
  > ```java
  > class Animal{
  >   String name; 
  > }
  > class Dog extends Animal{
  >   String fur;
  > }
  > class YellowDog extends Dog{
  > 
  > }
  > //以上就是多层继承
  > ```
  > 
  > **方法重写**
  > 
  > * 定义：在子类中可以根据需要对分类中继承来的方法进行改造，也称之为方法的重置、覆盖。在程序执行时，子类的方法覆盖父类的方法。
  > * 要求：
  > * 重写方法必须和被重写的方法具有相同的方法名称、参数列表、返回值类型。
  > * 重写方法不能比被重写的方法的权限还有严格（比如：父类public的方法，子类重写后不能用private）
  > * 重写的方法和被重写的方法要么就是static的，或者就是非static
  > * 子类方法抛出的异常不能大于父类被重写方法的异常
  > 
  > **<font color=red>关键字super</font>**
  > 
  > * 在Java类中使用super来调用父类的指定操作
  > * super可用于访问父类中定义的属性、方法。
  > * super可以在子类的构造方法中调用父类的构造器
  > * <font color=red>注意：</font>
  > * 子类与父类出现同名成员时，可以使用super区分
  > * super的追溯不仅限与直接父类。（可以追溯父类的父类，一直到超类object）
  > * super和this的用法相似。this代表本类对象的引用，super代表的是父类的内存空间的标识。
  > 
  > **调用父类构造器**
  > 
  > * 子类中的所有构造器**默认**都会访问父类中的**无参构造器**（在父类有无参构造器时）
  > * 当父类中没有无参构造器时，子类的构造器必须通过**super(参数列表)**语句指定去调用父类中的构造器，且必须放在构造器的第一行
  > * 如果子类构造器中既没有显示的调用父类或本类的构造器，且父类也没有无参构造器，则编译出错。
  > 
  > **<font color = red>this与super的区别</font>**
  > 
  > | NO. | 区别点   | this                       | 属性                    |
  > | --- |:----- | -------------------------- | --------------------- |
  > | 1   | 访问属性  | 访问本类中的属性，如果本类中没有该属性则从父类中查找 | 访问父类中的属性              |
  > | 2   | 调用方法  | 访问本类中的方法                   | 直接访问父类的方法             |
  > | 3   | 调用构造器 | 使用本类的构造器，必须放在构造器的首行        | 调用父类的构造器。必须放在子类构造器的首行 |
  > | 4   | 特殊含义  | 表示当前对象                     | 无此概念                  |
  > 
  > <font color = red>PS：在子类中，通过**this**或**super**调用构造器只能出现一个，因为它们都要占据构造器首行</font>
  > 
  > **类对象的实例化过程**
  > 
  > ![捕获.PNG](https://i.loli.net/2020/09/28/HG4iJSvatxTP1yF.png)
  > 
  > **子类对象的实例化过程**
  > 
  > <font color=red>PS：子类实例化的过程中先加载父类，在加载子类</font>
  > 
  > ![对象实例化内存分析.PNG](https://i.loli.net/2020/09/28/IbRkKlLiQgNfueT.png)

* 多态
