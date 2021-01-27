package com.bh.project.controller;

import com.bh.project.entity.Result;
import com.bh.project.entity.StautsCode;
import com.bh.project.pojo.ProductInfo;
import com.bh.project.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productInfo")
public class ProductInfoController {
    /**
     * 导入bean 依赖serive完成功能调用
     * @return
     */
    @Autowired
    private ProductInfoService productInfoService;

    /**
     * findById 根据id查询信息
     * @return
     */
    @RequestMapping("/findById")
    public Result findById(String productId) {
        Optional<ProductInfo> productInfoOptional = productInfoService.findById(productId);
        if (productInfoOptional.isPresent()) {
            return new Result(StautsCode.SUCCESS,"查询成功",productInfoOptional);
        }
        return new Result(StautsCode.FAIL,"查询失败");
    }


    /**
     * findAll 获取所有信息
     * @return
     */
    @RequestMapping("/findAll")
    private Result findAll() {
        List<ProductInfo> productInfoList= productInfoService.findAll();
        return new Result(StautsCode.SUCCESS,"查询成功",productInfoList);
    }
}
