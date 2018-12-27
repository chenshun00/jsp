### 实际配置

*   移除 `spring-boot-starter` 的 `logback`

```java
    <exclusion>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-logging</artifactId>
    </exclusion>
```

*   加入 `log4j` 的starter

```java
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-log4j</artifactId>
        <version>1.3.8.RELEASE</version>
    </dependency>
```

*   加入配置好的 `log4j.xml` ,启动app


### log4j 初始化

`File` 属性初始化 `DailyRollingFileAppender`.

```java
    protected void setParameter(Element elem, PropertySetter propSetter) {
        String name = subst(elem.getAttribute(NAME_ATTR));//获取属性 File
        String value = (elem.getAttribute(VALUE_ATTR)); //获取属性对应的value ${webapp.root}/logs2/error/error.log
        value = OptionConverter.convertSpecialChars(value);//空格转换
        value = subst(value);//替换 ${webapp.root} 这里的webapp.root可以替换为其他的
        propSetter.setProperty(name, value); // 替换完之后就成了 /path/logs2/error/error.log
    }
```

源代码详见 `DOMConfigurator#setParameter`.

#### log4j为什么需要配置成固定的名字

`LogManager` 静态代码块 `log4j.properties` `log4j.xml` `log4j.configuratorClass` `log4j.defaultInitOverride`