package com.example.week3project3.EcomServies;

import com.example.week3project3.model.Product;
import com.example.week3project3.model.User;
import org.springframework.steretype.Service;

import java.util.ArrayList;

@Service
public class UserServies {
   private final ArrayList<User> users=new ArrayList<>();
private final UserServies userServies;


    public static ArrayList<User> getUser() {
        return this.users;
    }

    public static void addUser(User user) {
        for(int i = 0; i < this.users.size(); ++i) {
            if ((User)this.users.get(i)).getId().user.getId())) {
                return false;
            }

    }
        this.users.add(user);
        return true;
    }
    public static boolean updateUser(int id, User user) {
        for(int i = 0; i < this.users.size(); ++i) {
            if (((User) this.users.get(i)).getId().user.getId()) {
                this.users.set(i, user);
                return true;
            }
        }
        return false;
    }

    public ArrayList<User>getuser(){
        return users;
    }
    public void adduser(User user){

        users.add(user);
    }
    public  boolean deleteuser(int id){
        for(int i=0;i<users.size();i++){
            if(users.get(i).getId()==id){
                users.remove(i);
                return true;
            }
        }
        return false;
    }

}
