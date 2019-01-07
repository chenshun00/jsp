package top.huzhurong.springboot.dubbo.provider.impl;

import com.alibaba.dubbo.common.Constants;

import java.util.stream.Stream;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/7
 */
public class App {
    public static void main(String[] args) {
        String[] split = Constants.COMMA_SPLIT_PATTERN.split("zookeeper://127.0.0.1:2181|zookeeper://127.0.0.1:2181|zookeeper://127.0.0.1:2181");
        System.out.println(split.length);
        Stream.of(split).forEach(System.out::println);
    }
}
