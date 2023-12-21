package com.northwind.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "CustomerDemographics")
public class CustomerDemographic {
    @Id
    @Size(max = 10)
    @Nationalized
    @Column(name = "CustomerTypeID", nullable = false, length = 10)
    private String customerTypeID;

    @Nationalized
    @Lob
    @Column(name = "CustomerDesc")
    private String customerDesc;

}