//package top.huzhurong.springboot.testinnerjsp.view;
//
//import org.springframework.util.ClassUtils;
//
///**
// * @author chenshun00@gmail.com
// * @since 2018/12/22
// */
//public class Constant {
//
//    public final static Boolean springBoot1_5;
//    public final static Boolean springBoot2_0;
//
//    static {
//        Boolean springBoot1_;
//        try {
//            ClassUtils.forName("org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory", Constant.class.getClassLoader());
//            springBoot1_ = true;
//        } catch (ClassNotFoundException ex) {
//            springBoot1_ = false;
//        }
//        springBoot1_5 = springBoot1_;
//
//        Boolean springBoot2_;
//        try {
//            ClassUtils.forName("org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory"
//                    , Constant.class.getClassLoader());
//            springBoot2_ = true;
//        } catch (ClassNotFoundException ex) {
//            springBoot2_ = false;
//        }
//        springBoot2_0 = springBoot2_;
//    }
//
//}
