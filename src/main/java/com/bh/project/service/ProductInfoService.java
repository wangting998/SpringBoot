package com.bh.project.service;
import com.bh.project.pojo.ProductInfo;

import java.util.List;
import java.util.Optional;

public interface ProductInfoService {
    /**
     * 获取所有信息功能
     * @return
     */
    List<ProductInfo> findAll();

    /**
     * 根据id查询功能
     * @return
     */
    Optional<ProductInfo> findById(String productId);
}
