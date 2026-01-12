package com.camp.minicommercetask.service;

import com.camp.minicommercetask.dto.ProductRequestDto;
import com.camp.minicommercetask.dto.ProductResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    /**
     * 상품 등록 비즈니스 로직
     * @param requestDto 상품 등록 요청 정보
     * @return 등록된 상품 정보
     */
    public ProductResponseDto createProduct(ProductRequestDto requestDto) {
        // TODO: [Level 1] 요구사항을 만족하는 상품 등록 로직을 구현하세요.
        return null;
    }

    /**
     * 전체 상품 조회 비즈니스 로직
     * @return 등록된 모든 상품 목록
     */
    public List<ProductResponseDto> getProducts() {
        // TODO: [Level 1] 요구사항을 만족하는 전체 상품 조회 로직을 구현하세요.
        return null;
    }
}
