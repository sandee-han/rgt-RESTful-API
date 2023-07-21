package com.rgt.rgt_restfulapi.domain.entity;

import com.rgt.rgt_restfulapi.domain.dto.OrderRequest;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "t_order")
@Getter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "order_id")
    private String orderId;

    @NotEmpty
    @Column(name = "product_name")
    private String productName;

    @Column(name = "options")
    private String options;

    @NotNull
    @Column(name = "table_no")
    private Long tableNo;

    @NotNull
    @Column(name = "quantity")
    private Long quantity;

    @NotEmpty
    @Column(name = "order_date")
    private String orderDate;

    @NotEmpty
    @Column(name = "order_time")
    private String orderTime;

    @NotEmpty
    @Column(name = "date_time")
    private String dateTime;

    @Column(name = "robot_status")
    private String robotStatus;

    @NotNull
    @Column(name = "dong")
    private Long dong;

    @NotNull
    @Column(name = "ho")
    private Long ho;

    @NotNull
    @Column(name = "seq")
    private Long seq;

    @NotEmpty
    @Column(name = "orderer_name")
    private String ordererName;

    public static Order makeOrder(OrderRequest orderRequest) {
        return Order.builder()
                .orderId(orderRequest.getOrderId())
                .productName(orderRequest.getProductName())
                .options(orderRequest.getOptions())
                .tableNo(orderRequest.getTableNo())
                .quantity(orderRequest.getQuantity())
                .orderDate(orderRequest.getOrderDate())
                .orderTime(orderRequest.getOrderTime())
                .dateTime(orderRequest.getDateTime())
                .robotStatus(orderRequest.getRobotStatus())
                .dong(orderRequest.getDong())
                .ho(orderRequest.getHo())
                .seq(orderRequest.getSeq())
                .ordererName(orderRequest.getOrdererName())
                .build();
    }
}
