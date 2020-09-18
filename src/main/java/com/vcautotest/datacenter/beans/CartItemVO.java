package com.vcautotest.datacenter.beans;

import java.math.BigDecimal;
import java.util.List;

public class CartItemVO {
    
    private String productCode;

    private String productNameCn;

    private String productNameEn;

    private Integer quantity;

    private String productImage;

    private String productType;

    private BigDecimal productPrice;

    private Integer sequence;

    private List<ComboComprisesVO> comboComprisesList;

    private List<GrillVO> grillList;

}
