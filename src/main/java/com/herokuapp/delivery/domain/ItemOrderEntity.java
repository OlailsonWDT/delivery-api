package com.herokuapp.delivery.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM_ORDER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "PRODUCT_ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private ProductEntity product;

    @JoinColumn(name = "ORDER_ID")
    @ManyToOne(cascade = CascadeType.ALL)
    private OrderEntity order;

    private Integer qtyItem;

    @Column(precision = 19, scale = 2)
    private BigDecimal subTotalPrice;

    @Override
    public String toString() {
        return ReflectionToStringBuilder
                .toString(this, ToStringStyle.JSON_STYLE, true, true);
    }
}
