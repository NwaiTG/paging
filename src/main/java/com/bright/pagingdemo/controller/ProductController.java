package com.bright.pagingdemo.controller;

import com.bright.pagingdemo.dto.request.ProductRequestDto;
import com.bright.pagingdemo.dto.response.ProductResponseDto;
import com.bright.pagingdemo.model.Product;
import com.bright.pagingdemo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<ProductResponseDto> createSSD(@RequestBody ProductRequestDto productRequestDto) {
        ProductResponseDto productResponseDto = productService.createProduct(productRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(productResponseDto);
    }

    @GetMapping
    public ResponseEntity<Page<ProductResponseDto>> searchProducts(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int pageSize,
            @RequestParam(defaultValue = "id")String sortBy,
            @RequestParam(defaultValue = "asc")String sortDirection //or desc
    ){
        Page<ProductResponseDto> productResponseDtoPage = productService.searchProducts(page, pageSize, sortDirection, sortBy);
        return ResponseEntity.status(HttpStatus.OK).body(productResponseDtoPage);
    }

    @GetMapping("/by-category")
    public ResponseEntity<Page<ProductResponseDto>> searchProductsByCategory(
            @RequestParam String category,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "5") int pageSize,
            @RequestParam(defaultValue = "id")String sortBy,
            @RequestParam(defaultValue = "asc")String sortDirection //or desc
    ){
        Page<ProductResponseDto> productResponseDtoPage = productService.searchProductsByCategory(category, page, pageSize, sortDirection, sortBy);
        return ResponseEntity.status(HttpStatus.OK).body(productResponseDtoPage);
    }
}
