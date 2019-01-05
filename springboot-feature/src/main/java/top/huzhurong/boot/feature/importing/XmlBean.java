package top.huzhurong.boot.feature.importing;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/5
 */
public class XmlBean {
    private String test;

    public XmlBean(String test) {
        this.test = test;
    }

    public XmlBean() {
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        System.err.println("===" + test + "===");
        this.test = test;
    }
}
