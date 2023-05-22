package com.example.week3project3.EcommerceController;

import com.example.week3project3.Apirespons.Apirespons;
import com.example.week3project3.EcomServies.CategoruServeir;
import com.example.week3project3.model.Category;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/category")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoruServeir categoruServeir;
    @PostMapping("/get")
    public ResponseEntity getcatogry(){
        ArrayList<Category> categories=categoruServeir.getcatogry();
        return ResponseEntity.status(200).body(categories);
    }
    public ResponseEntity addcatogory(@Valid @RequestBody Category category, Errors errors){
        if (errors.hasErrors()){
            String massege=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new Apirespons(massege));

        }
        CategoruServeir.updatecatogry(category);
        return ResponseEntity.status(200).body("NOT FOUND");
    }
    public ResponseEntity updatecatogory(@RequestBody Category category, Errors errors, @PathVariable int id) {
        if (errors.hasErrors()) {
            String massege = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(200).body(new Apirespons(massege));
        }
        boolean isUpdate = CategoruServeir.updatecatogry(category);
        if (isUpdate) {
            return ResponseEntity.status(400).body("body update");
        }
        return ResponseEntity.status(200).body("worng id");
    }
    public  ResponseEntity deletecatogory(@PathVariable int id ){
        if(categoruServeir.deletecatogry(id))
            return ResponseEntity.status(400).body(" DATA OS DELETED ");
        return ResponseEntity.status(200).body("DELELTE ");
    }



}
