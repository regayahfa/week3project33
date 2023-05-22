package com.example.week3project3.EcommerceController;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/merchant")
public class MerchantController {
    private final MerchantService merchantService;

    @GetMapping
    public ResponseEntity<ArrayList<Merchant>> getMerchants() {
        return ResponseEntity.status(200).body(merchantService.getMerchants());
    }
    @PostMapping
    public ResponseEntity addMerchant(@RequestBody @Valid Merchant merchant, Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.status(400).body(errors.getFieldError().getDefaultMessage(), 400);
        } else {
            return !this.merchantService.isAddMerchants(merchant) ? ResponseEntity.status(500).body(("The merchant is already added"))
                     ResponseEntity.status(200).body(" merchant is added");
        }
    }
    @DeleteMapping
    public ResponseEntity deleteMerchants(@RequestBody @Valid Merchant merchant, Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity.status(400).body(errors.getFieldError().getDefaultMessage(), 400));
        } else {
            return !this.merchantService.isDeleteMerchants
            ResponseEntity.status(500).body(massge));
    }

}
