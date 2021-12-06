package com.herokuapp.delivery.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.herokuapp.delivery.domain.enums.OrderStatusEntity;
import com.herokuapp.delivery.domain.enums.OrderTypeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "[ORDER]")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonBackReference(value = "command-orders")
    private CommandEntity command;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private Set<ItemOrderEntity> items;

    @Column(length = 8)
    @Enumerated(EnumType.STRING)
    private OrderStatusEntity orderStatus;

    @Column(precision = 19, scale = 2)
    private BigDecimal totalPrice;

    @Column(length = 8)
    @Enumerated(EnumType.STRING)
    private OrderTypeEntity orderType;

    @Override
    public String toString() {
        return ReflectionToStringBuilder
                .toString(this, ToStringStyle.JSON_STYLE, true, true);
    }
}
