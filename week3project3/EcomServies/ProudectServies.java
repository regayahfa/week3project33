package com.example.week3project3.EcomServies;

import com.example.week3project3.model.Category;
import com.example.week3project3.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProudectServies {
    static ArrayList<Product> proudects=new ArrayList<>();

public ArrayList<Product>getProudect(){
    return proudects;
}


public void addProudect(Product product){

    proudects.add(product);
}

    public static boolean updateproduct(int id,Product product){
        for (int i=0; i<proudects.size();i++){
            if(((Product)this.products.get(i)).getId().equals(product.getId())){
                return false;
            }
        }
        proudects.add(product)
        return true;


    }
    public  boolean deleteproduct(Product product){
        for(int i=0;i<proudects.size();i++){
            if(((Product)this.products.get(i)).getId().equals(product.getId())){
                proudects.remove(product);
                return true;
            }
        }
        return false;
    }


}
