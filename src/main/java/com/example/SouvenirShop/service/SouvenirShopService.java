package com.example.SouvenirShop.service;

import com.example.SouvenirShop.dto.ItemRequest;
import com.example.SouvenirShop.model.Item;
import com.example.SouvenirShop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SouvenirShopService {

    private final ItemRepository itemRepository;

    public void createNewSouvenir(ItemRequest itemRequest) {
        Item item = new Item();
        item.setName(itemRequest.getName());
        item.setDescription(itemRequest.getDescription());
        item.setPrice(itemRequest.getPrice());
        item.setQuantity(itemRequest.getQuantity());
        item.setSeller(itemRequest.getSeller());
        itemRepository.save(item);
    }
}
