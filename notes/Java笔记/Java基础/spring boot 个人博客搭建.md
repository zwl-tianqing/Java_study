## spring boot 个人博客搭建

### 1.环境搭建

#### 1.1<font color = red>引入spring boot 模板</font>

* **Spring Web（继承了 spring MVC 和 Tomcat 以及 web service模块）**
* **Thymeleaf（HTML 模板）版本选择有待商榷**
* **JPA（规范数据库操作的JPA）**
* **MYSQL（mysql数据库驱动）**
* **AOP（2018版只能手动配置）**
* **DevTools（开发工具，不用每次重新启动）**

##### 1.1.1 配置 pom.xml 文件（我这生成pom.xml不会生成编码所以自己配置了一下，同时指定了MYSQL的版本。好配置spring boot的模板信息）

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.3.4.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.zwl</groupId>
    <artifactId>longblog</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>longblog</name>
    <description>Demo project for Spring Boot</description>

    <properties>
        <!--配置编码-->
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <!--手动配置引入aop jar包-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-aop</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <!--<scope>runtime</scope>-->
            <!--指定MYSQL版本-->
            <version>5.1.6</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>
```

##### 1.1.2 配置application.yml(公用模板)文件（我这里自己将文件后缀改成了yml）

```yaml
# 配置 spring boot 模板信息 （共同环境）
spring:
  # 配置 thymeleaf 模板 HTML 版本号
  thymeleaf:
    mode: HTML
  # 指定使用的配置文件，不需要打全，使用文件的不同的后面的内容
  profiles:
    active: dev # dev 表示使用开发者配置文件
    #active: pro # pro 表示使用生产者配置文件
```

##### 1.1.3 配置application-pro.yml(生成者)文件（自己创建，或者copy改名）

```yaml
# 配置 spring boot 模板信息 （生产环境）
# 个性化设置
spring:
  # 配置 mysql 连接配置信息
  datasource:
    # 配置 mysql 驱动信息 com.mysql.jdbc.Driver 必须指定版本号，我这里使用的是5.1.6
    driver-class-name: com.mysql.jdbc.Driver
    # 配置 mysql URL 信息并设置编码格式为 utf8
    url: jdbc:mysql://localhost:3306/blog?useUnicode=true&characterEncoding=utf8
    # 配置 连接用户名
    username: root
    # 配置 连接密码
    password: zhu1234
  # 配置 检测 mysql（简化了所有的数据库的操作工作）
  jpa:
    hibernate:
      # 默认 none，不会更新表结构，确定实体类之后就使用 none，避免更新实体类后使得数据库丢失
      # 生产环境使用 update 表示每次连接数据库是比较实体类对象与数据表之间的映射，判断表结构是否一致，不一致时会自动更新表结构
      # create 表示每次重新启动后，会清除数据库重新创建。
      ddl-auto: update
    # 在日志文件和控制台中显示执行的 SQL 语句
    show-sql: true
# 配置日志的级别 默认日志文件生成在项目的更目录下 日志级别表明 trace < debug < info < warn < error < fatal
logging:
  # debug 表示所有的都按debug这个级别
  level: # debug
    # spring boot 本身的级别，默认 info
    root: warn  # warn更高级别的日志才打印
    # 包下
    com.zwl.longblog: info
  file:
    name: log/blog-pro.log
# 设置生产环境 Tomcat 的服务端口 不设置默认 8080
server:
  port: 8081
```

##### 1.1.4 配置application-dev.yml(开发者)文件（自己创建，或者copy改名）

```yaml
# 配置 spring boot 模板信息 （开发环境）
# 个性化配置
spring:
  # 配置 mysql 连接配置信息
  datasource:
    # 配置 mysql 驱动信息 com.mysql.jdbc.Driver 必须指定版本号，我这里使用的是5.1.6
    driver-class-name: com.mysql.jdbc.Driver
    # 配置 mysql URL 信息并设置编码格式为 utf8
    url: jdbc:mysql://localhost:3306/blog?useUnicode=true&characterEncoding=utf8
    # 配置 连接用户名
    username: root
    # 配置 连接密码
    password: zhu1234
  # 配置 检测 mysql（简化了所有的数据库的操作工作）
  jpa:
    hibernate:
      # 默认 none，不会更新表结构，确定实体类之后就使用 none，避免更新实体类后使得数据库丢失
      # 生产环境使用 update 表示每次连接数据库是比较实体类对象与数据表之间的映射，判断表结构是否一致，不一致时会自动更新表结构
      # create 表示每次重新启动后，会清除数据库重新创建。
      ddl-auto: none #开发环境已经不需要在更新数据库结构了
    # 在日志文件和控制台中显示执行的 SQL 语句
    show-sql: true
# 配置日志的级别 默认日志文件生成在项目的更目录下 日志级别表明 trace < debug < info < warn < error < fatal
logging:
  # 设置成debug 表示所有的都按debug这个级别
  level: # debug
    # spring boot 本身的级别，默认 info
    root: info
    # 包下
    com.zwl.longblog: debug
  file:
    name: log/blog-dev.log
```

##### 1.1.4 配置logback-spring.xml(日志配置进阶文件)

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!--日志配置进阶文件-->
<configuration>
    <!--包含Spring boot对logback日志的默认配置-->
    <include resource="org/springframework/boot/logging/logback/defaults.xml" />
    <property name="LOG_FILE" value="${LOG_FILE:-${LOG_PATH:-${LOG_TEMP:-${java.io.tmpdir:-/tmp}}}/spring.log}"/>
    <include resource="org/springframework/boot/logging/logback/console-appender.xml" />

    <!--重写了Spring Boot框架 org/springframework/boot/logging/logback/file-appender.xml 配置-->
    <appender name="TIME_FILE"
              class="ch.qos.logback.core.rolling.RollingFileAppender">
        <encoder>
            <pattern>${FILE_LOG_PATTERN}</pattern>
        </encoder>
        <file>${LOG_FILE}</file>
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>${LOG_FILE}.%d{yyyy-MM-dd}.%i</fileNamePattern>
            <!--保留历史日志一个月的时间-->
            <maxHistory>30</maxHistory>
            <!--
            Spring Boot默认情况下，日志文件10M时，会切分日志文件,这样设置日志文件会在100M时切分日志
            -->
            <timeBasedFileNamingAndTriggeringPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
                <maxFileSize>10MB</maxFileSize>
            </timeBasedFileNamingAndTriggeringPolicy>

        </rollingPolicy>
    </appender>

    <root level="INFO">
        <appender-ref ref="CONSOLE" />
        <appender-ref ref="TIME_FILE" />
    </root>

</configuration>
        <!--
            1、继承Spring boot logback设置（可以在appliaction.yml或者application.properties设置logging.*属性）
            2、重写了默认配置，设置日志文件大小在100MB时，按日期切分日志，切分后目录：

                blog.2017-08-01.0   80MB
                blog.2017-08-01.1   10MB
                blog.2017-08-02.0   56MB
                blog.2017-08-03.0   53MB
                ......
        -->
```

### 2 异常处理

#### 2.1定义错误界面

    * 404
    * 500
    * error