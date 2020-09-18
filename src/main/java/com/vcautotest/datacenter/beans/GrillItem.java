package com.vcautotest.datacenter.beans;

import lombok.Data;
import lombok.ToString;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ToString
public class GrillItem {

    private String grillItemNameCn;

    private String grillItemNameEn;

    private Integer quantity;

    private String isModify;

    private Integer grillItemPrice;
}