package com.HibernateApp.domain;


import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.*;

import java.math.BigDecimal;

@Getter
@Setter

@Entity
@Table(name = "country_language", schema = "world")
public class CountryLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String language;

    @Column(name = "is_official", columnDefinition = "BIT")
    @Type(type = "org.hibernate.type.NumericBooleanType")
    private Boolean isOfficial;

 /*   @Basic
    @Convert(converter = org.hibernate.type.NumericBooleanConverter.class)
    private Boolean isOfficial;*/

    private BigDecimal percentage;
}
