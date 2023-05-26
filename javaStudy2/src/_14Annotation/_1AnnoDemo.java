package _14Annotation;


import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * 注解javadoc演示
 *
 * @author zhuHaoWen
 * @version 1.0
 * @since 1.5
 */


//@Target()描述注解能够作用的位置
//@Retention()描述注解被保留的阶段
//    @Documented()描述注解是否被抽取到api文档中
//@Inherited()描述注解是否能被子类继承
 @_3MyAnno
public class _1AnnoDemo {

    /**
     * 计算两数的和
     *
     * @param a 整数
     * @param b 整数
     * @return 两数的和
     */
    @Deprecated//标注已过时
    //@SuppressWarnings()//压制警告
    public int add(int a, int b) {
        return a + b;
    }

    //移除所有警报 （之前提示未使用）
    @SuppressWarnings("all")
    public void add() {

    }

    //自定义注解
    @_2CustomAnno
    public void demo() {
        add(1, 2);
    }
}
