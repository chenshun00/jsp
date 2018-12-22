//package top.huzhurong.springboot.testinnerjsp.view;
//
//import org.apache.catalina.*;
//import org.springframework.util.ResourceUtils;
//
//import java.io.FileNotFoundException;
//import java.net.URL;
//import java.util.concurrent.atomic.AtomicBoolean;
//
///**
// * @author chenshun00@gmail.com
// * @since 2018/12/22
// */
//public class ResourceConfigurer implements LifecycleListener {
//    private final Context context;
//    private final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
//
//    ResourceConfigurer(Context context) {
//        this.context = context;
//    }
//
//    @Override
//    public void lifecycleEvent(LifecycleEvent event) {
//        if (event.getType().equals(Lifecycle.CONFIGURE_START_EVENT)) {
//            //指定目录 并且仅加载一次
//            if (atomicBoolean.compareAndSet(false, true)) {
//                try {
//                    String property = System.getProperty("user.home");
//                    System.out.println(property);
//                    if (property.equalsIgnoreCase("/Users/chenshun")) {
//                        throw new RuntimeException("请修改 URL url = ResourceUtils.getURL(\"/Users/chenshun/work/verification/src/main/webapp\"); 的路径，并去掉这里的判断 ");
//                    }
//                    URL url = ResourceUtils.getURL("/Users/chenshun/work/verification/src/main/webapp");
//                    context.getResources().createWebResourceSet(WebResourceRoot.ResourceSetType.RESOURCE_JAR, "/", url, "/");
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
