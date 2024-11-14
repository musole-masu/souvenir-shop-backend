package com.example.SouvenirShop.repository;

import com.example.SouvenirShop.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long>   {
}
