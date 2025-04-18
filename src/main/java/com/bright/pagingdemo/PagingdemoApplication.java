package com.bright.pagingdemo;

import com.bright.pagingdemo.dto.request.ProductRequestDto;
import com.bright.pagingdemo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class PagingdemoApplication {

    private final ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(PagingdemoApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {

            List<ProductRequestDto> products = List.of(
                    new ProductRequestDto("Apple iPhone 15", "Electronics", new BigDecimal("999.00")),
                    new ProductRequestDto("Design Patterns by GoF", "Books", new BigDecimal("54.99")),
                    new ProductRequestDto("Men's Formal Shirt", "Clothing", new BigDecimal("29.50")),
                    new ProductRequestDto("Spring in Action", "Books", new BigDecimal("39.99")),
                    new ProductRequestDto("Logitech MX Master 3S Mouse", "Electronics", new BigDecimal("99.99")),
                    new ProductRequestDto("Women's Denim Jacket", "Clothing", new BigDecimal("59.95")),
                    new ProductRequestDto("Domain-Driven Design", "Books", new BigDecimal("57.99")),
                    new ProductRequestDto("Samsung 4K Smart TV", "Electronics", new BigDecimal("649.00")),
                    new ProductRequestDto("Men's Cotton T-Shirt", "Clothing", new BigDecimal("19.99")),
                    new ProductRequestDto("Effective Java by Joshua Bloch", "Books", new BigDecimal("45.00")),
                    new ProductRequestDto("Google Pixel 8", "Electronics", new BigDecimal("699.00")),
                    new ProductRequestDto("Wool Winter Scarf", "Clothing", new BigDecimal("24.99")),
                    new ProductRequestDto("Head First Java", "Books", new BigDecimal("35.99")),
                    new ProductRequestDto("Unisex Hoodie - Black", "Clothing", new BigDecimal("34.99")),
                    new ProductRequestDto("Amazon Echo Dot (5th Gen)", "Electronics", new BigDecimal("39.99")),
                    new ProductRequestDto("Clean Code by Robert C. Martin", "Books", new BigDecimal("37.99")),
                    new ProductRequestDto("Anker Portable Charger", "Electronics", new BigDecimal("49.95")),
                    new ProductRequestDto("Java Concurrency in Practice", "Books", new BigDecimal("44.99")),
                    new ProductRequestDto("Athletic Running Shoes", "Clothing", new BigDecimal("89.99")),
                    new ProductRequestDto("The Pragmatic Programmer", "Books", new BigDecimal("42.50")),
                    new ProductRequestDto("Samsung Galaxy S24", "Electronics", new BigDecimal("799.99")),
                    new ProductRequestDto("Sports Cap - Navy Blue", "Clothing", new BigDecimal("17.50")),
                    new ProductRequestDto("Sony WH-1000XM5 Headphones", "Electronics", new BigDecimal("349.00")),
                    new ProductRequestDto("Refactoring by Martin Fowler", "Books", new BigDecimal("49.95")),
                    new ProductRequestDto("Crew Socks (5-pack)", "Clothing", new BigDecimal("14.99")),
                    new ProductRequestDto("Apple MacBook Air M3", "Electronics", new BigDecimal("1249.00")),
                    new ProductRequestDto("Dell XPS 13 Laptop", "Electronics", new BigDecimal("1199.00")),
                    new ProductRequestDto("Women's Summer Dress", "Clothing", new BigDecimal("44.00")),
                    new ProductRequestDto("Leather Belt - Brown", "Clothing", new BigDecimal("21.00")),
                    new ProductRequestDto("Introduction to Algorithms", "Books", new BigDecimal("89.00"))
            );


//            List<ProductRequestDto> products = List.of(
//                    // Electronics
//                    new ProductRequestDto("Samsung Galaxy S24", "Electronics", new BigDecimal("799.99")),
//                    new ProductRequestDto("Apple iPhone 15", "Electronics", new BigDecimal("999.00")),
//                    new ProductRequestDto("Sony WH-1000XM5 Headphones", "Electronics", new BigDecimal("349.00")),
//                    new ProductRequestDto("Dell XPS 13 Laptop", "Electronics", new BigDecimal("1199.00")),
//                    new ProductRequestDto("Apple MacBook Air M3", "Electronics", new BigDecimal("1249.00")),
//                    new ProductRequestDto("Logitech MX Master 3S Mouse", "Electronics", new BigDecimal("99.99")),
//                    new ProductRequestDto("Google Pixel 8", "Electronics", new BigDecimal("699.00")),
//                    new ProductRequestDto("Anker Portable Charger", "Electronics", new BigDecimal("49.95")),
//                    new ProductRequestDto("Samsung 4K Smart TV", "Electronics", new BigDecimal("649.00")),
//                    new ProductRequestDto("Amazon Echo Dot (5th Gen)", "Electronics", new BigDecimal("39.99")),
//
//                    // Books
//                    new ProductRequestDto("Clean Code by Robert C. Martin", "Books", new BigDecimal("37.99")),
//                    new ProductRequestDto("Effective Java by Joshua Bloch", "Books", new BigDecimal("45.00")),
//                    new ProductRequestDto("Design Patterns by GoF", "Books", new BigDecimal("54.99")),
//                    new ProductRequestDto("The Pragmatic Programmer", "Books", new BigDecimal("42.50")),
//                    new ProductRequestDto("Refactoring by Martin Fowler", "Books", new BigDecimal("49.95")),
//                    new ProductRequestDto("Spring in Action", "Books", new BigDecimal("39.99")),
//                    new ProductRequestDto("Head First Java", "Books", new BigDecimal("35.99")),
//                    new ProductRequestDto("Java Concurrency in Practice", "Books", new BigDecimal("44.99")),
//                    new ProductRequestDto("Introduction to Algorithms", "Books", new BigDecimal("89.00")),
//                    new ProductRequestDto("Domain-Driven Design", "Books", new BigDecimal("57.99")),
//
//                    // Clothing
//                    new ProductRequestDto("Men's Cotton T-Shirt", "Clothing", new BigDecimal("19.99")),
//                    new ProductRequestDto("Women's Denim Jacket", "Clothing", new BigDecimal("59.95")),
//                    new ProductRequestDto("Unisex Hoodie - Black", "Clothing", new BigDecimal("34.99")),
//                    new ProductRequestDto("Men's Formal Shirt", "Clothing", new BigDecimal("29.50")),
//                    new ProductRequestDto("Women's Summer Dress", "Clothing", new BigDecimal("44.00")),
//                    new ProductRequestDto("Athletic Running Shoes", "Clothing", new BigDecimal("89.99")),
//                    new ProductRequestDto("Wool Winter Scarf", "Clothing", new BigDecimal("24.99")),
//                    new ProductRequestDto("Leather Belt - Brown", "Clothing", new BigDecimal("21.00")),
//                    new ProductRequestDto("Crew Socks (5-pack)", "Clothing", new BigDecimal("14.99")),
//                    new ProductRequestDto("Sports Cap - Navy Blue", "Clothing", new BigDecimal("17.50"))
//            );

            products.forEach(productService::createProduct);
        };
    }
}
