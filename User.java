public class User {

    private int id;
    private String name;
    private String address;

    private  User(UserBuilder builder){
        this.id= builder.id;
        this.name= builder.name;
        this.address= builder.address;

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder{

        private int id;
        private String name;
        private String address;

        public UserBuilder setId(int id){
            this.id=id;
            return this;
        }
        public UserBuilder setName(String name){
            this.name=name;
            return this;
        }
        public UserBuilder setAddress(String address){
            this.address=address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
