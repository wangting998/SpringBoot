package com.bh.project.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * 创建实体类
 */
@Entity
@Table(name = "product_info")
@Data   //导入Lombok依赖，添加@Data注释后，就不需要get、set方法了
public class ProductInfo {
    @Id
    private String productId; //商品id
    @Column
    private String productName; //商品名称
    @Column
    private Double productPrice; //商品价格
    @Column
    private Integer productStock; //商品库存
    @Column
    private String productDescription; //商品描述
    @Column
    private String productIcon; //商品小图
    @Column
    private Integer productStatus; //商品状态,0正常1下架
    @Column
    private Integer categoryType; //类目编号
    @Column
    private Timestamp createTime; //创建时间
    @Column
    private Timestamp updateTime; //修改时间

    //get set方法
    /*public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon;
    }

    public Integer getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(Integer productStatus) {
        this.productStatus = productStatus;
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }*/
}
