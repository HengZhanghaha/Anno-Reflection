package Reflection;

//类的引用
public class Test4 {
    static {
        System.out.println("main类被加载!!");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用
//        Son son = new Son();

        //2.反射引用
//        Class.forName("Reflection.Son");

        //不会产生类引用的方法
        System.out.println(Son.b);      //子类不会加载
        Son[] array = new Son[5];     //子类父类都不加载
        System.out.println(Son.M);    //子类父类都不加载
    }
}

class Father{
    static int b = 2;
    static {
        System.out.println("父类被加载.......");
    }
}

class Son extends Father{
    static {
        m = 300;
        System.out.println("子类被加载..");
    }
    static int m = 100;
    static final int M = -5;
}