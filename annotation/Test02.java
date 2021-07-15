package annotation;

import java.lang.annotation.*;

//元注解
public class Test02 {
    @MyAnnotation
    public static void show()
    {
        System.out.println("来吧，元注解！！！！！");
    }
    public static void main(String[] args) {
        Test02.show();

    }
}

//自定义一个注解
  //@Target,表示该注解的使用范围(TYPE, FIELD,METHOD,  PARAMETER,CONSTRUCTOR,等)
@Target(value = ElementType.METHOD)
  //@Retention,表示该注解的有效范围(SOURCE源码<class类<Runtime运行时)
@Retention(value = RetentionPolicy.RUNTIME)
  //@Documented,表示我们的代码是否写在Javadoc中
@Documented
  //@Inheried ,表示子类可以继承父类的注解
@Inherited
@interface MyAnnotation{

}
