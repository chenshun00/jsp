### SpringBoot 整合 Dubbo

使用 `zookeeper` 作为注册中心，如果是 `zk` 集群的话还需要修改

#### 优点

*   开发和发布的过程相比 `Spring dubbo` 的 `xml` 体系更快.
*   使用 `@Service` 注解发布的形式相对来说更加容易维护


#### 缺点

*   apache-dubbo 文档10分给3分,文档过于简单

```java
    @Reference(version = "1.0.0")
    private DemoService demoService;
```

*   `@Reference` 形式不利于维护,如果项目当中的引用多达上百个，岂不是每次维护都要这么修改,会增大维护成本

> 利用 `@Reference` 支持 `ElementType.ANNOTATION_TYPE` 可以自定义注解.