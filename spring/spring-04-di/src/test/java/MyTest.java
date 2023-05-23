import com.lsgf.pojo.Student;
import com.lsgf.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void userPNamespaceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        //        User user = (User) context.getBean("user");
        //        System.out.println(user.toString());

        //        System.out.println(context.getBean("user").toString());

        //        不再用强转
        //        User user = context.getBean("user",User.class);
        //        System.out.println(user.toString());

        User user = context.getBean("user2", User.class);
        System.out.println(user.toString());

    }

    @Test
    public void userScopeNamespaceTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        //     单列模式
        User user1 = context.getBean("user3", User.class);
        User user2 = context.getBean("user3", User.class);
        System.out.println(user1 == user2);
        //     原型模式
        User user3 = context.getBean("user4", User.class);
        User user4 = context.getBean("user4", User.class);
        System.out.println(user3 == user4);


    }

}
