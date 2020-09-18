package com.vcautotest.datacenter.beans;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@NoArgsConstructor
@ToString
@Data
public class Grill{

    private String grillCode;

    private String grillNameCn;

    private String grillNameEn;

    private List<GrillItem> grillItemList;
}