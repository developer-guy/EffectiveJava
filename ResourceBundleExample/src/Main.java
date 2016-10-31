import java.util.Enumeration;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("org.project.infos.project");
        Enumeration<String> keys = bundle.getKeys();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            String val = (String) bundle.getObject(key);
            System.out.println("Key : " + key + " Value : " + val);
        }
    }
}
