package com.bright.pagingdemo.service;


import com.bright.pagingdemo.dto.request.ProductRequestDto;
import com.bright.pagingdemo.dto.response.ProductResponseDto;
import com.bright.pagingdemo.model.Product;
import org.springframework.data.domain.Page;
import java.util.List;

public interface ProductService {
    ProductResponseDto createProduct(ProductRequestDto dto);
    //Get a page of Products
    Page<ProductResponseDto> searchProducts(int page, int pageSize, String sortDirection, String sortBy);
    //Get a page of products, filtered by category
    Page<ProductResponseDto> searchProductsByCategory(
            String category,
            int page,
            int pageSize,
            String sortDirection,
            String sortBy);
}
