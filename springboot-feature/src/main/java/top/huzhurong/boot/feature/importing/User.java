package top.huzhurong.boot.feature.importing;

/**
 * @author chenshun00@gmail.com
 * @since 2019/1/5
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
