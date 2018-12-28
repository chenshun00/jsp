### 实际配置

实际配置同 `log4j` ， 只是 `log4j` 转换成 `log4j2` . 具体的详情可查看 `pom.xml` 文件.

### log4j2 日志文件
一开始以为 `log4j2` 和 `log4j` 一样是直接以环境变量指定`System.getProperty("webapp.root")` . 实际测试发现通过失败
，后来查询官方文档 [log4j2 文档](https://logging.apache.org/log4j/2.x/manual/configuration.html#PropertySubstitution) 解决，通过 `sys:环境变量`