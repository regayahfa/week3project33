package com.example.week3project3.EcommerceController;

import com.example.week3project3.Apirespons.Apirespons;
import com.example.week3project3.EcomServies.MarchantStochServeis;
import com.example.week3project3.EcomServies.ProudectServies;
import com.example.week3project3.model.Merchant;
import com.example.week3project3.model.MetchantStock;
import com.example.week3project3.model.Product;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/merchStock")

@RequiredArgsConstructor
public class MerchantStockController {
    private final MarchantStochServeis marchantStochServeis;
    @PostMapping("/get")
    public ResponseEntity getmarStock(){
        ArrayList<MetchantStock> metchantStocks=MetchantStock.getStock();
        return ResponseEntity.status(200).body(metchantStocks);
    }
    @postMapping("/add")
    public ResponseEntity addmaStock(@Valid @RequestBody Merchant merchant, Errors errors){
        if (errors.hasErrors()){
            String massege=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new Apirespons(massege));

        }
        MarchantStochServeis.addmaStock(merchant);
        return ResponseEntity.status(200).body("NOT FOUND");
    }
    @putMapping("/update")
    public ResponseEntity updatemaStock(@RequestBody Merchant merchant, Errors errors, @PathVariable int id) {
        if (errors.hasErrors()) {
            String massege = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(200).body(new Apirespons(massege));
        }
        boolean isUpdate =MarchantStochServeis.updatemaStock(id, merchant);
        if (isUpdate) {
            return ResponseEntity.status(400).body("body update");
        }
        return ResponseEntity.status(200).body("worng id");
    }
    public  ResponseEntity deletemaStock(@PathVariable int id ){
        if(MarchantStochServeis.deletemaStock(id)){
            return ResponseEntity.status(400).body(" DATA OS DELETED ");}

        return ResponseEntity.status(200).body("DELELTE ");
    }

}
