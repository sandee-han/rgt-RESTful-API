package com.rgt.rgt_restfulapi.service;

import com.rgt.rgt_restfulapi.domain.dto.OrderRequest;
import com.rgt.rgt_restfulapi.domain.dto.OrderResponse;
import com.rgt.rgt_restfulapi.domain.entity.Order;
import com.rgt.rgt_restfulapi.repository.OrderJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderJpaRepository orderJpaRepository;

    public OrderResponse inputOrder(OrderRequest orderRequest) {
        Order newOrder = orderJpaRepository.save(Order.makeOrder(orderRequest));
        OrderResponse newOrderResponse = OrderResponse.makeOrderResponse(newOrder);

        replaceTeriaToLatte();
        return newOrderResponse;
    }

    @Transactional
    public String removeDuplicateOrderId() {
        orderJpaRepository.removeDuplicatedOrderId();
        return "중복 order_id 제거 완료";
    }

    @Transactional
    public String replaceTeriaToLatte() {
        orderJpaRepository.replaceTeriaToLatte();
        return "카페테리아를 카페라떼로 전부 수정 완료";
    }
}
