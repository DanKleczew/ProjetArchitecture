package fr.pantheonsorbonne.cri;
import java.util.ArrayList;


public class UserRepository {
    private ArrayList<User> UserList;

    public UserRepository(ArrayList<User> Users){
        this.UserList = Users;

    }
    public UserRepository(){}

    /*
    * Adds a User instance to the repository
    */

    public void registerUser(User user){
        this.UserList.add(user);
    }

}
