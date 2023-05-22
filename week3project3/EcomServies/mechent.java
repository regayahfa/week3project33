package com.example.week3project3.EcomServies;

import java.util.ArrayList;

@Servise
public class mechent {
    private final ArrayList<Merchant> merchants = new ArrayList();

    public boolean addMerchant(Merchant merchant) {
        for(int i = 0; i < this.merchants.size(); ++i) {
            if (((Merchant)this.merchants.get(i)).getId().
                    equals(merchant.getId())) {
                return false;
            }
        }

        this.merchants.add(merchant);
        return true;
    }
    public boolean UpdateMerchant(Merchant merchant) {
        for(int i = 0; i < this.merchants.size(); ++i) {
            if (((Merchant)this.merchants.get(i)).getId().
                    (merchant.getId())) {
                this.merchants.set(i, merchant);
                return true;
            }
        }

        return false;
    }

}
