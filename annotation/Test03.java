package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class Test03 {
    @MyAnnotation1(name = "ss")
    public static void test(){
        System.out.println("hello super world!!");
    }

    @MyAnnotation2(2)
    public static void test2(){
        System.out.println("yes，it is.......");
    }

    public static void main(String[] args) {
        test();
        test2();
    }
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation1{
    String name();
}

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation2{
    int value();
}
