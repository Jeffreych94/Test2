import java.io.ObjectOutputStream;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class MyTest {
    ConcurrentHashMap  map = new ConcurrentHashMap();

    public static void main(String[] args) {
        System.out.println("1");
        StringBuffer a = new StringBuffer("qwe");
        a.reverse();
        String cc = "qqqq"; }
        ArrayList<String> list1 = new ArrayList<String>();
    list1.add("123");
    list1.add(123);//编译错误


}
