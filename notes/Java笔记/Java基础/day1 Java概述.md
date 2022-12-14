## JavaSE 图形详解

![image.png](https://i.loli.net/2020/08/29/vKl8qTPdx6Re9rw.png)

## 基础常识

* **软件开发**
  
  软件，即一系列按照特定顺序组织的计算机数据和指令的集合。有**系统软件**和**应用软件**之分。

* **人机交互方式**
  
  1. 图形化界面（Graphical User Interface GUI） ；易于上手，操作简单
  2. 命令行方式；需要控制台，利用命令进行计算机操作。较为麻烦，必须记录住一些命令。

## 常用的DOS命令

* **开启DOS界面的快捷键（窗口键+R键）**<font color=red>输入的所有字母字符，都是英文</font>
1. 切换磁盘：直接输入盘的名字就行 如：D:

2. dir：查看当前目录下的所有文件与文件夹

3. md：创建文件夹

4. rd：删除文件夹 <font color=red>例如：rd 文件名</font>

5. cd : 进入指定目录

6. cd.. ：返回到上级目录

7. cd\： 返回根目录

8. cd>文件名、type null>文件名、copy null>文件名：创建空文件

9. del ：删除文件

10. exit：退出dos窗口

11. 切换磁盘：直接输入盘的名字就行 如：D:

12. dir：查看当前目录下的所有文件与文件夹

13. md：创建文件夹

14. rd：删除文件夹 <font color=red>例如：rd 文件名</font>

15. cd : 进入指定目录

16. cd.. ：返回到上级目录

17. cd\： 返回根目录

18. cd>文件名、type null>文件名、copy null>文件名：创建空文件

19. del ：删除文件

20. exit：退出dos窗口

## Java语言概述

* **什么计算机语言**
  
  * 语言：是人与人交流沟通的一种方式。
  * <font color=red>计算机语言：人与计算机交流的一种方式</font>

* 第一代语言
  
  机器语言——打孔语言（二进制语言）

* 第二代语言
  
  汇编语言

* 第三代语言（高级语言）
  
  * C 面向过程语言  例如：张三打篮球，李四打网球
  
  * C++ 面向对象/面向过程
  
  * Java 跨平台的纯面向对象语言例如：人的对象、运动的动作对象、运动的种类的对象
    
    实例化一个张三对象，对象有一个打篮球的动作，运动的种类是篮球。
    
    实例化一个李四对象，对象有一个打网球的动作，运动的种类是网球。
    
    这是面向过程很难实现的
  
  * .NET跨语言的平台

## java在计算机语言中的地位排行

![计算机排行榜2019-2020.PNG](https://i.loli.net/2020/08/30/1El5PrfyM6TZKVb.png)

## Java的起源和特点

### 1、起源

java之父<font color=red>“Jqosling”</font>团队在开发“Green”项目时，发现C缺少垃圾回收系统，还有可移植的安全性，分布式设计、和多线程的功能。最后，他们想要一种易于移植到各种设备上的平台。

java名字的由来是因为原本开发小组一致将其命名为Oak（一种橡胶树），然而却被其他公司注册所使用。因此他们开会重 新进行语言的命名，正巧开发小组中有一个成员正好有着一杯咖啡上写着java，便提出了java这个名字。java（爪哇岛的英文名，因盛产开发而闻名）就很幸运的成为了新语言的名字

java由SUN公司在1995年推出的一门高级编程语言

### 2.java与C\C++的区别

java 确实是从C语言与C++语言继承了许多成分，甚至可以将java看成是**类C语言**发展和衍生的产物。
比如Java的变量申明，操作符形式，参数传递，流程控制等方面和c、c++完全相同。
但同时，java是一个**纯粹的面向对象**的高级程序设计语言，继承了c++面向对象的核心。
同时Java舍弃了C语言中容易引起错误的指针（使用引用来替代）、运算符重载、多重继承（以接口取代）等特性，
增加了垃圾回收器功能能用于回收不在引用的对象所占据的空间。
<font color=red>**JDK1.5又引入了泛型编程、类型安全的枚举、不定长参数、和自动装/拆箱**</font>

### 3、特征

1. Java语言是易学的。语法和C语言和C++非常接近，容易上手
2. java语言是一个强制面向对象的语言。
3. java语言是分布式的。Java语言支持Internet应用的开发。
4. JAVA语言是健壮的。
5. Java语言是安全的。Java通常被用在网络环境中。为此，Java提供了一个安全机制以防止恶意攻击。如：安全方法机制（类ClassLoader），如分配不同的名字空间以防替代本地的同名类、字节代码检查。
6. java语言是体系结构中立的。（跨平台）java程序在java平台被编译成体系结构中立的字节码格式，然后可以实现这个Java平台的任何系统的的解释器中运行（JVM）
7. java语言是解释型的。java程序在java平台被编译成字节码格式，然后可以实现这个Java平台的任何系统的的解释器中运行（JVM）
8. Java是性能略高的。与那些解释性高级语言相比还是比较高的。
9. Java语言是原生支持多线程的。在java中，线程是一种特殊的对象，它必须又Thread类或其子类来创建。

### 4、技术平台

* Java SE 标准版
  
  支持桌面版的java平台，提供了完整的java核心API，此版本以前称为J2SE

* Java EE 企业版
  
  是为开发企业环境下的应用程序提供的一套解决方案。该技术体系中包括的技术：servlet，jsp等，主要针对于web应用程序开发。版本以前称为J2EE

* Java ME 轻量版
  
  支持java程序运行在移动终端（手机、PDA）上的平台，对java API有所精简，并加入针对移动终端的支持，此版本以前也被称为J2ME

* java card
  
  支持一些java小程序（applets）运行在小内存设备（如智能卡）上的平台

### 5、java核心机制

* jvm （java虚拟机）
  
  java实现跨平台的机制

* GC （垃圾回收机制）
  
  相对于C语言的自动回收来讲，大大的降低了程序编写的难度，以及减少因为释放内存出错而导致的bug

### 6、jdk安装

* **下载jdk**
  
  官网地址：https://www.oracle.com/java/technologies/javase-downloads.html

* 下载后直接点击下一步安装即可，可以根据自己想要安装的位置进行设置，只用安装到jdk即可。

* 如果安装后没法使用，需要配置环境变量。计算机右键属性，找到高级设置。新建系统环境变量JAVA_HOME。内容填入jdk的路径。之后再在path后添加%JAVA_HOMR%\bin;%JAVA_HOMR%\jre（针对win7）。

### 7.jdk、jre、jvm的关系

* **什么是jdk、什么是jre**
  
  * jdk （java开发工具包）
    
    jdk是提供给java开发人员使用的，其中包含了java的开发工具，也包括了JRE
    
    其中开发工具：编译工具（javac.exe）打包工具（jar.exe）等
  
  * jre  （java运行环境）
    
    包括java虚拟机和java程序所需要的核心库等。

* jdk包含jre包含jdk

### 8、程序开发步骤

* 将java代码编写到扩展名的 .java 文件
* 通过 javac 命令对该 java 文件进行编译 例如：javac Test.java
* 通过 java 命令对生成的class文件进行运行 例如：java Test
* **注意**：<font color=red>所有符号均为英文符号、严格区分大小写、每个语句结束必须用分号、括号成对出现、public 类名于文件名一致（允许一个文件中又多个类，但是每个类仅有一个public类且与文件名相同）</font>

### 9、注释

* 用于注解说明程序的文字就是注释

* 注释格式
  
  * 单行注释 //
  
  * 多行注释 /* 语句块 */
  
  * 文档注释
    
    ```java
    /**
    *文档注释
    *
    **/
    ```
