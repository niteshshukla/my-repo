public class BuilderPatternExample {

    public static void main(String[] args) {
        User user=new User.UserBuilder().setId(1).setName("nitesh").setAddress("gkp").build();
    }
}
