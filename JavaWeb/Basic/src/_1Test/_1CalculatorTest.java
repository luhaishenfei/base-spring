package _1Test;

import _1Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.util.calendar.CalendarUtils;

public class _1CalculatorTest {

    /*初始化方法，
    用于资源申请，所有测试方法在执行之前都会先执行该方法
    * */
        @Before
    public void init() {
        System.out.println("init...");

    }


    /*释放资源方法
     *
     */
    @After
    public  void close(){
        System.out.println("close...");
    }




    /*
     * */
    @Test
    public void testAdd() {
        System.out.println("I'm running");
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        System.out.println(result);
        //3.  断言  一般使用断言来操作处理结果  我断言这个结果是4
        Assert.assertEquals(4, result);
    }

    @Test
    public void testSub() {
        Calculator c = new Calculator();
        int result = c.sub(4, 1);
        Assert.assertEquals(3, result);
    }
}
