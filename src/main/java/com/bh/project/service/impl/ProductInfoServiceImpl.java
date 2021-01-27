package com.bh.project.service.impl;

import com.bh.project.dao.ProductInfoDao;
import com.bh.project.pojo.ProductInfo;
import com.bh.project.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProductInfoServiceImpl implements ProductInfoService {
    /**
     * 实现接口  依赖dao
     */
    @Autowired
    private ProductInfoDao productInfoDao;

    /**
     * 查询所有信息
     * @return
     */
    @Override
    public List<ProductInfo> findAll() {
        return productInfoDao.findAll();
    }

    @Override
    public Optional<ProductInfo> findById(String productId) {
        return productInfoDao.findById(productId);
    }
}
