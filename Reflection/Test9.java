package Reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//对象关系映射(ORM):通过反射操作注解
public class Test9 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("Reflection.Student2");

        //通过反射获得注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获取注解的value值
        TableKuang tableKuang = (TableKuang)c1.getAnnotation(TableKuang.class);
        String value = tableKuang.value();
        System.out.println(value);

        //获得注定类的注解
        Field f = c1.getDeclaredField("name");
        FieldKuang annotation = f.getAnnotation(FieldKuang.class);
        System.out.println(annotation.colunmName());
        System.out.println(annotation.length());
        System.out.println(annotation.type());

    }
}

@TableKuang("db_student")
class Student2{
    @FieldKuang(colunmName = "db_name",type = "String",length = 10)
    private String name;
    @FieldKuang(colunmName = "db_id",type = "int",length = 10)
    private int id;
    @FieldKuang(colunmName = "db_age",type = "int",length = 10)
    private int age;

    public Student2(){

    }

    public Student2(String name,int id,int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

}

//类的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableKuang{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldKuang{
    String colunmName();
    String type();
    int length();
}

