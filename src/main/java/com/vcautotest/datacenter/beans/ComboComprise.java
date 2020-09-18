package com.vcautotest.datacenter.beans;

import lombok.Data;
import lombok.ToString;
import java.util.List;
import lombok.NoArgsConstructor;

@Data
@ToString
@NoArgsConstructor
public class ComboComprise {

    private Integer round;

    private String roundNameCn;

    private String isChoices;

    private String choicesCode;

    private List<ComboItem> comboItemList;
    
}
