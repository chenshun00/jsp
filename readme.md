### SpringBoot学习

#### SpringBoot和dubbo

SpringBoot2.x 和 apache dubbo starter整合,更加方便.

#### SpringBoot feature

SpringBoot的特点，来源于SpringBoot官方文档

#### SpringBoot和log

SpringBoot和 `log4j` ，`log4j2` 的使用,指定位置

#### SpringBoot Starter

编写兼容 1.x 和 2.x 的starter

#### SpringBoot webSocket

Spring webSocket的封装，这里只是一个例子

#### SpringBoot和jsp

jar包中的 `jsp` 和 `META-INF/resources` 目录下的 `jsp` 不支持实时更新，指定目录下的 `jsp` 支持实时更新

> Note:在 `CentOS` 上使用 `tomcat` 默认的临时目录用于存储编译的jsp，文件上传以及其他的临时文件，就算这个应用还在运行，这个目录也可能会被 `tmpwatch` 删除而导致访问失败，
为了避免这个错误，需要自定义你的 `tmpwatch` 配置例如 `tomcat.*` 目录不会被删除或者配置server.tomcat.basedir目录，将临时目录转移. -Djava.io.tmpdir也是一个不错的选择

> 文档:[SpringBoot 文档](!https://docs.spring.io/spring-boot/docs/2.1.1.RELEASE/reference/html/)
> 文档:[webSocket 文档](!https://docs.spring.io/spring-framework/docs/5.0.0.M1/spring-framework-reference/html/websocket.html)
> 文档:[webSocket rfc6455](!https://tools.ietf.org/html/rfc6455)