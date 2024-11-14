package com.example.SouvenirShop.controller;

import com.example.SouvenirShop.dto.ItemRequest;
import com.example.SouvenirShop.service.SouvenirShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/souvenir-shop")
@RequiredArgsConstructor
public class SouvenirShopController {

    private final SouvenirShopService mSouvenirShopService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createNewSouvenir(@RequestBody ItemRequest itemRequest) {
        mSouvenirShopService.createNewSouvenir(itemRequest);
        return "Souvenir Successfully created";
    }

}
