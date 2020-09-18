package com.vcautotest.datacenter.beans;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Promotion {
    
    private String promotionId;

    private String promotionName;

    private String couponCode;

    private String couponName;

    private Integer discountPrice;

    private String discountType;

    private Integer finalPrice;

    private Boolean used;

    private List<String> items;

}
