import com.lsgf.pojo.User;
import com.lsgf.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        User user = new User();
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //使用总的applicationContext.xml将所有人开发的beans.xml合并为一个总的。
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        System.out.println(user==user2);

        //两种别名各自的使用
       // UserT aliasUser =(UserT) context.getBean("aliasUser");
//        UserT aliasUser =(UserT) context.getBean("userT2");
        UserT aliasUser =(UserT) context.getBean("u4");

        aliasUser.show();

        //依赖注入：Set注入
//            依赖：bean对象的创建依赖于容器！
//            注入：bean对象的所有属性，由容器来注入！
    }
}
