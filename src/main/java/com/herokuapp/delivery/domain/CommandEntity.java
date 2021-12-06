package com.herokuapp.delivery.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.herokuapp.delivery.domain.enums.CommandStatusEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "COMMAND")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommandEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date iniDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date finalDate;

    @Column(length = 8)
    @Enumerated(EnumType.STRING)
    private CommandStatusEntity commandStatus;

    @JsonManagedReference(value = "command-orders")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "command", fetch = FetchType.EAGER, orphanRemoval = true)
    private Set<OrderEntity> orders;

    @Override
    public String toString() {
        return ReflectionToStringBuilder
                .toString(this, ToStringStyle.JSON_STYLE, true, true);
    }
}
