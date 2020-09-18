package com.vcautotest.datacenter.beans;

import java.math.BigDecimal;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Product {

    private String productCode;

    private String productType;

    private String productNameCn;

    private String productNameEn;

    private Integer sequence;

    private Integer quantity;

    private BigDecimal productPrice;

    private Integer discountPrice;

    private BigDecimal taxRate;

    private String saleFlag;

    private String noSalesCode;

    private String noSalesReason;

    private BigDecimal subtotal;

    private BigDecimal realSubtotal;

    private BigDecimal taxAmount;

    private String taxId;

    private String productImage;

    private List<ComboComprise> comboComprisesList;

    private List<Grill> grillList;

    private List<Promotion> cartItemPromotions;

    
}
