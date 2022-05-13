package Model;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private List<UserModel> users;
    private int id;
    private static UserDB instance;

    public UserDB() {
        users = new ArrayList<>();
        id = 0;
        add(new UserModel("Thomas", "Test"));
    }

    public static UserDB getInstance(){
        if (UserDB.instance == null)
        {
            UserDB.instance = new UserDB();
        }
        return UserDB.instance;
    }

    public List<UserModel> getAll(){
        return users;
    }

    public String[] getAllUserNames() {
        List<String> userList = new ArrayList<>();
        for (UserModel currUser : users) {
            userList.add(currUser.getUserName());
        }
        String[] arr = new String[userList.size()];
        userList.toArray(arr);
        return arr;
    }

    private void add(UserModel user){
        users.add(user);
    }

    public UserModel getUserByUserName(String userName){
        for (UserModel curr_user : users) {
            if (curr_user.getUserName().equals(userName)) {
                return curr_user;
            }
        }
        return null;
    }
}
