//1）通过Lombok注解方式创建一个实体
//2）通过枚举创建一个单例类
//3）通过Double check locking 创建一个单例对象
//4）创建一个构建器(Builder)模式实例
public class Test {
    public static void main(String[] args){
        // Homework #1: 通过Lombok注解方式创建一个实体
        User user = new User();
        user.setName("AL");
        System.out.println("Homework #1: 通过Lombok注解方式创建一个实体. User name:" + user.getName());

        // Homework #2: 通过枚举创建一个单例类
        EnumSingleton.INSTANCE.setName("Enum Singleton");
        System.out.println(EnumSingleton.INSTANCE.getName());

        // Homework #3: 通过Double check locking 创建一个单例对象
        DoubleCheckSingleton.getInstance().setName("Double check Singleton");
        System.out.println( DoubleCheckSingleton.getInstance().getName());

        // Homework #4: 创建一个构建器(Builder)模式实例
        UserBuilder builder = new UserBuilder();
        User newUser = builder.CreateUser("AL000",66);
        System.out.println("Homework #4: 创建一个构建器(Builder)模式实例. User name:" + newUser.getName());
    }
}
