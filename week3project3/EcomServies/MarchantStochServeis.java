package com.example.week3project3.EcomServies;

import com.example.week3project3.model.Merchant;
import com.example.week3project3.model.MetchantStock;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MarchantStochServeis {
    static ArrayList<Merchant> marchantStochServeis=new ArrayList<>();

    public static ArrayList<Merchant> getmarSrock() {

        return marchantStochServeis;
    }
    public ArrayList<Merchant> getmaStock(){
        return marchantStochServeis;
    }


    public static void addmaStock(Merchant metchantStock) {
        for (int i = 0; i < this.merchantStocks.size(); ++i) {
            if (((MerchantStock) this.merchantStocks.get(i)).getMerchantId().equals(merchantStock.getId())) {
                return false;
            }
        }
        marchantStochServeis.add(metchantStock);
        return true;
    }
    public static boolean updatemaStock( Merchant merchant){
        for (int i=0; i<marchantStochServeis.size();i++){
            if((merchant)this.marchantStochServeis.get(i).getId()==id){
                marchantStochServeis.set(i, merchant);
                return true;
            }



        }
        return false;


    }
    public static boolean deletemaStock(MetchantStock metchantStock){
        for(int i=0;i<marchantStochServeis.size();++i){
            if(marchantStochServeis.get(i).getId()==0){
                marchantStochServeis.remove(i);
                return true;
            }
        }
        return false;
    }


}

