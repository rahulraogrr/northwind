package com.northwind.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "Territories")
public class Territory {
    @Id
    @Size(max = 20)
    @Nationalized
    @Column(name = "TerritoryID", nullable = false, length = 20)
    private String territoryID;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "TerritoryDescription", nullable = false, length = 50)
    private String territoryDescription;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "RegionID", nullable = false)
    private Region regionID;

}