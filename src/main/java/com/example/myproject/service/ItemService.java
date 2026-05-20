package com.example.myproject.service;

import com.example.myproject.model.Item;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ItemService {

    private final Map<Long, Item> itemStore = new HashMap<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public ItemService() {
        // Seed with sample data
        save(new Item(null, "Laptop", 999.99, "High-performance laptop"));
        save(new Item(null, "Phone", 499.99, "Latest smartphone"));
        save(new Item(null, "Tablet", 299.99, "Portable tablet"));
    }

    public List<Item> findAll() {
        return new ArrayList<>(itemStore.values());
    }

    public Optional<Item> findById(Long id) {
        return Optional.ofNullable(itemStore.get(id));
    }

    public Item save(Item item) {
        if (item.getId() == null) {
            item.setId(idCounter.getAndIncrement());
        }
        itemStore.put(item.getId(), item);
        return item;
    }

    public Optional<Item> update(Long id, Item updated) {
        if (!itemStore.containsKey(id)) return Optional.empty();
        updated.setId(id);
        itemStore.put(id, updated);
        return Optional.of(updated);
    }

    public boolean delete(Long id) {
        return itemStore.remove(id) != null;
    }
}
