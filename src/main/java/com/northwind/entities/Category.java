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
@Table(name = "Categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategoryID", nullable = false)
    private Integer id;

    @Size(max = 15)
    @NotNull
    @Nationalized
    @Column(name = "CategoryName", nullable = false, length = 15)
    private String categoryName;

    @Nationalized
    @Lob
    @Column(name = "Description")
    private String description;

    @Column(name = "Picture")
    private byte[] picture;
}