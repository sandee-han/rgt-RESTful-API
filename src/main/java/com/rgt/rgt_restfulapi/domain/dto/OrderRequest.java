package com.rgt.rgt_restfulapi.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class OrderRequest {
    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("options")
    private String options;

    @JsonProperty("table_no")
    private Long tableNo;

    @JsonProperty("quantity")
    private Long quantity;

    @JsonProperty("order_date")
    private String orderDate;

    @JsonProperty("order_time")
    private String orderTime;

    @JsonProperty("date_time")
    private String dateTime;

    @JsonProperty("robot_status")
    private String robotStatus;

    @JsonProperty("dong")
    private Long dong;

    @JsonProperty("ho")
    private Long ho;

    @JsonProperty("seq")
    private Long seq;

    @JsonProperty("orderer_name")
    private String ordererName;
}
