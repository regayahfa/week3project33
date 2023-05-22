package com.example.week3project3.EcommerceController;

import com.example.week3project3.Apirespons.Apirespons;
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
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProudectServies proudectServies;
@PostMapping("/get")
    public ResponseEntity getProduct(){
        ArrayList<Product> products=proudectServies.getProudect();
    return ResponseEntity.status(200).body(products);
    }
    public ResponseEntity addproduct(@Valid @RequestBody Product product, Errors errors){
    if (errors.hasErrors()){
        String massege=errors.getFieldError().getDefaultMessage();
        return ResponseEntity.status(400).body(new Apirespons(massege));

    }
    proudectServies.addProudect(product);
    return ResponseEntity.status(200).body("NOT FOUND");
    }
public ResponseEntity updateproduct(@RequestBody Product product, Errors errors, @PathVariable int id) {
    if (errors.hasErrors()) {
        String massege = errors.getFieldError().getDefaultMessage();
        return ResponseEntity.status(200).body(new Apirespons(massege));
    }
    boolean isUpdate = ProudectServies.updateproduct(id, product);
    if (isUpdate) {
        return ResponseEntity.status(400).body("body update");
    }
    return ResponseEntity.status(200).body("worng id");
}
public  ResponseEntity deleteproduct(@PathVariable int id ){
    if(proudectServies.deleteproduct(id))
        return ResponseEntity.status(400).body(" DATA OS DELETED ");
    return ResponseEntity.status(200).body("DELELTE ");
}
public ResponseEntity addprodect(@Valid @RequestBody Merchant name, @PathVariable Merchant  id , MetchantStock stock,@PathVariable Product id  ){
    return addproduct(id);
}

    private ResponseEntity addproduct(Merchant id) {
    return null;
    }

    public boolean check(MetchantStock ,@PathVariable int Product){
    if(int price=0;MetchantStock>price;--price) {
        return false;
    }
    if (Product==1){
        return true;
    }
    return false;
}
public ResponseEntity getstock(@PathVariable Merchant id ,@PathVariable Product id ,@PathVariable MetchantStock id ){
    return null;
}
}

