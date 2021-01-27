package com.bh.project.dao;

import com.bh.project.pojo.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInfoDao extends JpaRepository<ProductInfo,String> {
                            //继承类--JpaRepository<实体类,类的主键>
}
