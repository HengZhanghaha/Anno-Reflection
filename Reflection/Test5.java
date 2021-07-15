package Reflection;

//类的加载器
public class Test5 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //2.获取扩展类加载器->>系统类加载器的父类
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //3.获取根加载器->>扩展类加载器的父类
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是那个加载器加载的
        ClassLoader classLoader = Class.forName("Reflection.Test5").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是那个加载器加载的
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);
    }
}
