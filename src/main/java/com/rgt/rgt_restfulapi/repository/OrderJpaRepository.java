package com.rgt.rgt_restfulapi.repository;

import com.rgt.rgt_restfulapi.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface OrderJpaRepository extends JpaRepository<Order, Long> {
    // order_id 중복되는 데이터 삭제 쿼리
    @Modifying
    @Query(value = "DELETE a FROM rgt.t_order a, rgt.t_order b\n" +
            "WHERE a.id > b.id\n" +
            "    AND a.order_id = b.order_id;", nativeQuery = true)
    void removeDuplicatedOrderId();

    @Modifying
    @Query(value = "UPDATE rgt.t_order " +
            "SET product_name = " +
            "REPLACE( product_name, '카페테리아', '카페라떼' ); ", nativeQuery = true)
    void replaceTeriaToLatte();


    // UPDATE rgt.t_order SET product_name = REPLACE( product_name, '카페테리아', '카페라떼' );
}
