package com.example.ecommerce;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final ProductRepository repository;
    public DataLoader(ProductRepository repository) { this.repository = repository; }

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Product("Laptop","High-end gaming laptop",1200));
        repository.save(new Product("Phone","Latest smartphone",800));
        repository.save(new Product("Headphones","Noise-cancelling headphones",200));
    }
}
