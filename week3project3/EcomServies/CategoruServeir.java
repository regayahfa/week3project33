package com.example.week3project3.EcomServies;

import com.example.week3project3.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoruServeir {
    static ArrayList<Category> categories=new ArrayList<>();

    public ArrayList<Category>getcatdory(){
        return categories;
    }


    public void addcatogry(Category category){

        categories.add(category);
    }
    public static boolean updatecatogry(int id,Category category){
        for (int i=0; i<categories.size();i++){
            if(categories.get(i).getId()==id){
               categories.set(i, category);
                return true;
            }



        }
        return false;


    }
    public  boolean deletecatogry(int id){
        for(int i=0;i<categories.size();i++){
            if(categories.get(i).getId()==id){
               categories.remove(i);
                return true;
            }
        }
        return false;
    }


    public ArrayList<Category> getcatogry() {
        return null;
    }
}
