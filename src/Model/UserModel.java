package Model;

public class UserModel {
    private String userName, password;

    public UserModel(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }
    public String getPassword() { return password; }
}
