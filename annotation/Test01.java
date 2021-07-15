package annotation;

//什么是注解
@SuppressWarnings("all") //@SuppressWarnings("all"),表示镇压警告
public class Test01 extends Object{

    // @Override,内置注解，你表示重写
    @Override
    public String toString() {
        return super.toString();
    }

    //@Deprecated，表示不推荐程序员使用
    @Deprecated
    public void test(){
        System.out.println("@Deprecated");
    }
    public static void main(String[] args) {
        System.out.println("cascsacsaaccsa");
    }
}
