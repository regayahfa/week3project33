package com.example.week3project3.EcommerceController;

import com.example.week3project3.Apirespons.Apirespons;
import com.example.week3project3.EcomServies.ProudectServies;
import com.example.week3project3.EcomServies.UserServies;
import com.example.week3project3.model.Product;
import com.example.week3project3.model.User;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserServies userServies;
    @PostMapping("/get")
    public ResponseEntity getUser(){
        ArrayList<User> users=UserServies.getUser();
        return ResponseEntity.status(200).body(this.userServies.getuser());
    }
    public ResponseEntity addUser(@Valid @RequestBody User user, Errors errors){
        if (errors.hasErrors()){
            String massege=errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(400).body(new Apirespons(massege));

        }
        UserServies.addUser(user);
        return ResponseEntity.status(200).body("NOT FOUND");
    }
    public ResponseEntity updateUser(@RequestBody User user, Errors errors, @PathVariable int id) {
        if (errors.hasErrors()) {
            String massege = errors.getFieldError().getDefaultMessage();
            return ResponseEntity.status(200).body(new Apirespons(massege));
        }
        boolean isUpdate = UserServies.updateUser(id, user);
        if (isUpdate) {
            return ResponseEntity.status(400).body("body update");
        }
        return ResponseEntity.status(200).body("worng id");
    }
    public  ResponseEntity deleteuser(@PathVariable int id ){
        if(userServies.deleteuser(id))
            return ResponseEntity.status(400).body(" DATA OS DELETED ");
        return ResponseEntity.status(200).body("DELELTE ");
    }

}
