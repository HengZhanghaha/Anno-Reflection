package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@SuppressWarnings("all")   //镇压所有警告信息(不推荐)
//通过反射获取类的所有结构
public class Test6 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //创建反射
        Class c1 = Class.forName("Reflection.User");

        //1.获得类的名字
        String name = c1.getName(); //获取完整名字
        String simpleName = c1.getSimpleName();  //获取简易名字
        System.out.println("获取完整名字:" + name);
        System.out.println("获取简易名字:"+simpleName);

        //2.获得类的属性
        System.out.println("----------------------------------------------------------------------------------");
        Field[] fields = c1.getFields();  //获取public类型的属性
        for (Field field : fields) {
            System.out.println("public 获取public类型的属性:" + field);
        }
        fields = c1.getDeclaredFields(); //获取所有类型的属性
        for (Field field : fields) {
            System.out.println("getDeclaredFields 获取所有类型的属性:" + field);
        }

//        Field id = c1.getField("id");
//        System.out.println("public 获取具体的属性：" + id);
        Field id = c1.getDeclaredField("id");
        System.out.println("getDeclaredField 获取具体的属性：" + id);
        System.out.println("-----------------------------------------------------------------------------------------");

        //3.获取类的方法
        Method[] methods = c1.getMethods();  //获取所有public方法和父类方法
        for (Method method : methods) {
            System.out.println("public获取所有public方法：" + method);
        }
        methods = c1.getDeclaredMethods();  //获取所有类型方法
        for (Method method : methods) {
            System.out.println("getDeclaredMethods 获取所有类型方法：" + method);
        }

        //因为重载，所以要给定参数类型的class
        Method setName = c1.getDeclaredMethod("setName",String.class);
        Method getName = c1.getDeclaredMethod("getName",null);
        System.out.println(setName);
        System.out.println(getName);
        System.out.println("-----------------------------------------------------------------------------------------");

        //4.获得指定构造器
        Constructor[] constructors = c1.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("public 获得public的构造器：" + constructor);
        }
        constructors = c1.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("getDeclaredConstructors 获得所有类型的构造器：" + constructor);
        }
        //获得指定的构造器
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("获取指定的构造器：" + declaredConstructor);
    }
}
