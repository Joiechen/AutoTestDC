package com.vcautotest.datacenter.beans;

import java.math.BigDecimal;
import java.util.List;
import lombok.Data;
import lombok.ToString;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ToString
public class ComboItem {

    private String itemProductCode;

    private String itemProductNameCn;

    private String itemProductNameEn;

    private BigDecimal itemProductPrice;

    private BigDecimal taxRate;

    private String taxId;

    private List<Grill> grillList;

}