## 程序流程控制语句

### 顺序结构

>**Java中定义成员变量时采用合法的前向引用**
>
>````java
>public class Test{
>	int i = 1;
>    int k = i + 2;
>}
>//错误形式：
>public class Test{
>    int k = i +2;
>    int i = 1;
>}
>//程序所使用的变量必须在先前已存在易声明
>````

### 循环结构

>* **循环语句功能**
>* 在某些条件满足的情况下，反复执行特定代码的功能
>* **循环语句的四个组成部分**
>* 初始化部分（ini_statement）
>* 循环条件部分（test_exp）
>* 循环体部分（body_statement）
>* 迭代部分（alter_statement）
>* **循环语句分类**
>* for 循环
>* while 循环
>* do/while 循环
>
>````java
>//for 语法结构
>//for(初始化表达式1;布尔值测试表达式2;更改表达式){ 语句或语句块3 }
>for(int i=1;i<=100;i++){
>  System.out.println(i);
>}
>
>// while 语法结构
>/**
>* 初始化语句
>* while(布尔值测试表达式){
>*	语句或语句块
>*	更改表达式
>*}
>*/
>int i = 0;
>while(i<5){
>   System.out.println(i);
>   i++
>}
>
>// do while语法结构与while相似,不过do while 至少会执行一次循环
>int i = 0;
>do{
>   System.out.println(i);
>   i++;
>}while(i<5);
>
>// 循环可以进行嵌套，不过最好大循环次数要小于小循环次数（在不影响程序的逻辑下）。
>for(int i = 1;i <= 9; i++) {
>	for(int j = 1;j <= i;j++) {
>		System.out.print(j+"*"+i+"="+i*j+" ");
>	}
>	System.out.println();
>}
>````
>

### 分支语句

> **if  else 语句**
>
> ````java
> //判断奇偶数
> int i = 2;
> if(i%2 == 0){
>  System.out.println("偶数");
> }else{
>  System.out.println("奇数");
> }
> ````
>
> **if else if else 语句** 
>
> ````java
> //判断星期几 不在[1,7]之内 输出不知道
> int i = 4;
> if(i == 1){
>  System.out.println("星期1")
> }else if(i == 2){
>  System.out.println("星期2")
> }else if(i == 3){
>  System.out.println("星期3")
> }else if(i == 4){
>  System.out.println("星期4")
> }else if(i == 5){
>  System.out.println("星期5")
> }else if(i == 6){
>  System.out.println("星期6")
> }else if(i == 7){
>  System.out.println("星期天")
> }else if{
>  System.out.println("不知道")
> }
> ````
>
> **if 中 代码块可以 写 if语句可以嵌套**
>
> **switch case 语句**
>
> ````java 
> //判断星期几 不在[1,7]之内 输出不知道
> int i = 4;
> switch(i) {
> 	case 1:
> 		System.out.println("星期1");
> 		break;
> 	case 2:
> 		System.out.println("星期2");
> 		break;
> 	case 3:
> 		System.out.println("星期3");
> 		break;
> 	case 4:
> 		System.out.println("星期4");
> 		break;
> 	case 5:
> 		System.out.println("星期5");
> 		break;
> 	case 6:
> 		System.out.println("星期6");
> 		break;
> 	case 7:
> 		System.out.println("星期天");
> 		break;
> 	default:
> 		System.out.println("不知道,输入出错");
> 		break;
> }
> ````
>
> 

### 特殊流程控制语句

> **break**
>
> ````java
> // break 出现在 switch 是终止 case 语句。 其他地方出现在循环里
> for(int i = 1;i <= 10;i++){
>     if(i > 6){
>         break;
>     }
>     System.out.println(i);
> }
> 
> //break 只会终止当前所在循环
> for(int i = 1;i < 3;i++){
>     for(int j = 1;j <= 10;j++){
>     	if(i > 6){
>         	break;
>     	}
>    		System.out.println(j);
> 	}
> }
> ````
>
> **continue**
>
> ```java
> // continue 结束当前所在循环进入下一次循环 一般只对所在循环起作用，如果嵌套中指定标签会对所指定的循环起作用（基本很少用）
> for(int i = 1;i < 7;i++){
>     if(i % 2 == 0){
>         continue;
>     }
>     System.out.println(i);
> }
> // continue 标记使用
> CEN: 
> for(int i = 1;i < 4;i++) {
> 	for(int j = 1;j <= i;j++) {
> 		if(j > 2) {
> 			continue CEN;
> 		}
> 		System.out.println(j);
> 	}
> 	System.out.println("aaa");
> }
> ```
>
> **return**
>
> ````java
> // return 的作用是结束一个方法 return 下的代码就不生效了，会报错
> for(int i = 1;i < 3;i++){
>     for(int j = 1;j < 4;j++){
>         if(i == j){
>             return;	// 1==1的时候就直接结束，，不会有结果 
> 		}
>     }
>     System.our.println(i);
> }
> ````
>
> 

