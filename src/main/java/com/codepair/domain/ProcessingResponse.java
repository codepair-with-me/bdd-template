package com.codepair.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter
public class ProcessingResponse {
    private boolean priority;
    private Item requestedItem;
    private Date processingDate;
    private Date shippingDate;
    private int requestedQuantity;
    private int approvedQuantity;
    private float refundAmount;
}
