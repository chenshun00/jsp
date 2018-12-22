### SpringBoot 运行jsp

#### test-inner-jsp  jsp在SpringBoot项目内部内运行

-java
-resources
    -META-INF
        -resources
            =jsp
jsp 即可被加载 方法 `http://127.0.0.1:8080/test-inner-jsp.jsp` 可知

#### test-jsp 外部jar包中的jsp文件
打包jsp放置到SpringBoot项目中使用

```bash
cd test-jsp & mvn clean install
```

将该jar包放置到 `test-inner-jsp` 项目中的 `pom` 文件运行即可查看

`http://127.0.0.1:8080/index.jsp`

#### 动态修改jsp并且及时生效

1、设置servlet 参数

```java
server.servlet.jsp.init-parameters.development=true
server.jsp-servlet.init-parameters.development=true
```

2、打开被注释的 `ResourceConfigurer` 和 `Bean`(需修改路径),运行并实时修改jsp即可观察效果