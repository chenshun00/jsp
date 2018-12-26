//package top.huzhurong.springboot.testinnerjsp.view;
//
//import org.apache.catalina.*;
//import org.springframework.util.ClassUtils;
//import org.springframework.util.ResourceUtils;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.net.MalformedURLException;
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
//
//
//        if (event.getType().equals(Lifecycle.CONFIGURE_START_EVENT)) {
//            URL location = this.getClass().getProtectionDomain().getCodeSource().getLocation();
//
//
//            try {
//                URL resource = ClassUtils.getDefaultClassLoader().getResource("");
//                System.out.println("equals:\t" + location.equals(resource));
//            } catch (Exception e) {
//                ;
//            }
//
//            if (ResourceUtils.isFileURL(location)) {
//                // when run as exploded directory
//                String rootFile = location.getFile();
//                if (rootFile.endsWith("/BOOT-INF/classes/")) {
//                    rootFile = rootFile.substring(0, rootFile.length() - "/BOOT-INF/classes/".length() + 1);
//                }
//                if (!new File(rootFile, "META-INF" + File.separator + "resources").isDirectory()) {
//                    return;
//                }
//
//                try {
//                    location = new File(rootFile).toURI().toURL();
//                } catch (MalformedURLException e) {
//                    throw new IllegalStateException("Can not add tomcat resources", e);
//                }
//            }
//
//            String locationStr = location.toString();
//            if (locationStr.endsWith("/BOOT-INF/classes!/")) {
//                // when run as fat jar
//                locationStr = locationStr.substring(0, locationStr.length() - "/BOOT-INF/classes!/".length() + 1);
//                try {
//                    location = new URL(locationStr);
//                } catch (MalformedURLException e) {
//                    throw new IllegalStateException("Can not add tomcat resources", e);
//                }
//            }
//            this.context.getResources().createWebResourceSet(WebResourceRoot.ResourceSetType.RESOURCE_JAR, "/", location,
//                    "/META-INF/resources");
//        }
//    }
//}
