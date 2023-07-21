package com.rgt.rgt_restfulapi.controller;

import com.rgt.rgt_restfulapi.domain.dto.OrderRequest;
import com.rgt.rgt_restfulapi.domain.dto.OrderResponse;
import com.rgt.rgt_restfulapi.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/codingTest")
public class OrderRestController {
    private final OrderService orderService;

    @PostMapping("/post")
    public ResponseEntity<OrderResponse> inputOrder(@RequestBody OrderRequest orderRequest) {
        OrderResponse newOrderResponse = orderService.inputOrder(orderRequest);
        return ResponseEntity.ok().body(newOrderResponse);
    }

    @DeleteMapping("/handle-duplicate")
    public ResponseEntity<String> handleDuplicateDate() {
        String result = orderService.removeDuplicateOrderId();
        return ResponseEntity.ok().body(result);
    }
}
