package com.rgt.rgt_restfulapi.domain.dto;

import com.rgt.rgt_restfulapi.domain.entity.Order;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class OrderResponse {
    private String orderId;
    private String productName;
    private String options;
    private Long tableNo;
    private Long quantity;
    private String orderDate;
    private String orderTime;
    private String dateTime;
    private String robotStatus;
    private Long dong;
    private Long ho;
    private Long seq;
    private String ordererName;

    public static OrderResponse makeOrderResponse(Order order) {
        return OrderResponse.builder()
                .orderId(order.getOrderId())
                .productName(order.getProductName())
                .options(order.getOptions())
                .tableNo(order.getTableNo())
                .quantity(order.getQuantity())
                .orderDate(order.getOrderDate())
                .orderTime(order.getOrderTime())
                .dateTime(order.getDateTime())
                .robotStatus(order.getRobotStatus())
                .dong(order.getDong())
                .ho(order.getHo())
                .seq(order.getSeq())
                .ordererName(order.getOrdererName())
                .build();
    }
}
