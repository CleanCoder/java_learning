public class UserBuilder {
    public User CreateUser(String name, int age){
        User user = new User();
        user.setName(name);
        user.setAge(age);

        return user;
    }
}
