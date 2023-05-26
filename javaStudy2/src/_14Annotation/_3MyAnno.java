package _14Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value={ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})//可以作用于类 方法 成员 上
public @interface _3MyAnno {
}
