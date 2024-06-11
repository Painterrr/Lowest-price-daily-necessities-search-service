package com.fisa.lep.mart.entity;

import com.fisa.lep.area.entity.Area;
import com.fisa.lep.common.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "mart")
@Entity
public class Mart extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mart_id")
    private Long id;

    private String name;

    private String brand;
    private Brand brand;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area_id")
    private Area area;

    @Builder
    public Mart(String name, Area area) {
    public Mart(String name, Brand brand, Area area) {
        this.name = name;
        this.brand = brand;
        this.area = area;
    }

}