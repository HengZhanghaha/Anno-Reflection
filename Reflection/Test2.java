package Reflection;

//测试Class类的创建的方式
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Teacher();
        System.out.println("这个人是:" + person.name);

        //1.方式一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //2.方式二:通过forname()获得
        Class c2 = Class.forName("Reflection.Teacher");
        System.out.println(c2.hashCode());

        //3.方式三:通过类名.class获得
        Class c3 = Teacher.class;
        System.out.println(c3.hashCode());

        //获得父类
        Class superclass = c1.getSuperclass();
        System.out.println(superclass);
    }
}

class Person{
    public String name;
    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}

class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}