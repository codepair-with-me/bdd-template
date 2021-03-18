package com.codepair.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
@Data
public class Item {

    private String source;
    private String priority;
    private String debitAccount;
    private String creditAccount;
    private String currency;
    private float transactionAmount;
    private String itemName;
    private int itemQuantity;
    private String shipName;
    private String shipAdd1;
    private String shipAdd2;
    private String shipPinCode;

}
