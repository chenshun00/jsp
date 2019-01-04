### Spring Boot 特性

#### 事件监听器

#### 启动失败处理

#### 错误页面

#### Servlet

在Spring Boot 中，所有的 `Servlet` `Filter` 以及 `Listener` 实例都是作为Spring的一个bean被注册到内置的容器当中.
默认整个容器是一个 `单Servlet实例`,路径为 `/`，为了防止多个 `Servlet` 实例的影响，bean#name作为路径的前缀，Filter映射 `/*`
如果命名转换不够灵活，还可以使用 `ServletRegistrationBean` `FilterRegistrationBean` `ServletListenerRegistrationBean`
进行全面控制

> order 值越小，优先级越高(注意负数)

> 可以使用 `jmap -histo:live | grep top.huzhurong.boot.feature` 来查看存活实例，当作练习 `jmap` 的使用了

#####